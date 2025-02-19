import { Injectable,inject } from '@angular/core';
import { Subject, Observable } from 'rxjs';
import { Title } from '@angular/platform-browser';
import { AppGlobalService } from '@baseapp/app-global.service';
import { environment } from '@env/environment';

@Injectable({
  providedIn: 'root'
})
export class AppLayoutBaseService {
  private displayMenu = new Subject<boolean>();
  private menuType: string = 'float';
  private displayLeftMenu = new Subject<boolean>();
  private displayRightMenu = new Subject<boolean>();
  
   public titleService = inject(Title)
   public appGlobalService = inject(AppGlobalService);
  config : any = {"left":[{"outline":false,"infiniteScroll":false,"urlIconFileName":"Company Logo.svg","valueChange":true,"logoFileName":"Company Logo.svg","currentNode":"74e1b698-159e-4c83-a6be-ddbb04850195","mobileLogoFileName":"Company Logo.svg","element":"logo"},{"outline":false,"menuType":"fixed","hideSidebarOnCollapse":false,"element":"leftMenu"},{"outline":false,"element":"appTitle"}],"middle":[{"outline":false,"element":"leftPane"},{"outline":false,"element":"middlePane"},{"outline":false,"element":"rightPane"}],"right":[{"outline":false,"menuType":"float","element":"rightMenu"},{"children":[{"outline":false,"link":"/logout","label":"Logout","element":"logout"}],"element":"user"}]};

  public getLeftMenuVisibility(): Observable<boolean> {
    return this.displayLeftMenu.asObservable();
  }

  public updateLeftMenuVisibility(displayLeftMenu: boolean): void {
    this.displayLeftMenu.next(displayLeftMenu);
  }

  public getRightMenuVisibility(): Observable<boolean> {
    return this.displayRightMenu.asObservable();
  }

  public updateRightMenuVisibility(displayRightMenu: boolean): void {
    this.displayRightMenu.next(displayRightMenu);
  }

  public getMenuType(): string {
    return this.menuType;
  }

  public getTopBarCofiguration() {
    return this.config;
  }

  public getMenuItems() {

    const leftMenu: any = (this.config.left.find((t: { element: string; }) => t.element === "leftMenu"))
    const rightMenu: any = (this.config.right.find((t: { element: string; }) => t.element === "rightMenu"));
    let left = (leftMenu?.children ? leftMenu : false)
    // return (left || rightMenu);
    return { leftMenu: leftMenu, rightMenu: rightMenu }
  }

  public getStyles(item: any) {
    let properties = ['fontsize', 'font-family', 'color', 'background-color', 'height', 'width', 'margin', 'padding'];
    let styleObj: any = {};
    if (item) {
      for (const key in item) {
        if (key != "backgroundColor") {
          if (properties.includes((key.toLowerCase()))) {
            styleObj[key] = item[key];
          }
        }
        else if(key == "backgroundColor") {
          styleObj['background-color'] = item['backgroundColor'];
        }
      }
    }
    return styleObj;
  }

  getConfigData(): Observable<any> {
    const subject: Observable<any> = new Observable(observer => {
      const data = require('base/assets/menu.json');
      observer.next(data as any);
    });
    return subject;
  }
  
  public setAppTitle() {
    let appTitleObj: any = (this.config.left.find((t: { element: string; }) => t.element === "appTitle"))
    if (appTitleObj?.title) {
      this.titleService.setTitle(appTitleObj?.title);
    }
  }
  
  public setAppLogo() {
    let appLogoObj: any = (this.config.left.find((t: { element: string; }) => t.element === "logo"));
    let favIcon: any = document.querySelector('#appLogo');
    if (appLogoObj?.urlIconFileName) {
      favIcon.href = `assets/images/` + appLogoObj.urlIconFileName;
    } else {
      favIcon.href = `assets/images/` + appLogoObj.logoFileName;
    }
  }
getMenu() {
    let menuData: any;
    if (environment.prototype) {
      this.getConfigData().subscribe((response) => {
        menuData = response;
      })
    }
    else {
      let currentUserData = this.appGlobalService.getCurrentUserData();
      menuData = currentUserData ? JSON.parse(currentUserData.menuRole) : {};
    }
    menuData = this.customizeMenuContent(menuData);
    return menuData;
  }
customizeMenuContent(menu: any) {
    return menu;
  }
}