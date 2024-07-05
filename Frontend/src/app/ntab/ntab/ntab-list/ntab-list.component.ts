import { Component, OnInit,inject } from '@angular/core';
import { NtabListBaseComponent } from '@baseapp/ntab/ntab/ntab-list/ntab-list.base.component';
import { NtabService } from '@baseapp/ntab/ntab/ntab.service';


@Component({
  selector: 'app-ntab-list',
  templateUrl: '../../../../../base/app/ntab/ntab/ntab-list/ntab-list.component.html',
  styleUrls: ['./ntab-list.scss']
})
export class NtabListComponent extends NtabListBaseComponent implements OnInit {
 
	
  ngAfterViewInit(): void {
    this.onAfterViewInit()
  }

  ngOnInit(): void {
    super.onInit();
  }
 
}