import { Component, OnInit,inject } from '@angular/core';
import { NtabDetailBaseComponent } from '@baseapp/ntab/ntab/ntab-detail/ntab-detail.base.component';
import { NtabService } from '@baseapp/ntab/ntab/ntab.service';


@Component({
  selector: 'app-ntab-detail',
  templateUrl: '../../../../../base/app/ntab/ntab/ntab-detail/ntab-detail.component.html',
  styleUrls: ['./ntab-detail.scss']
})
export class NtabDetailComponent extends NtabDetailBaseComponent implements OnInit {
 
	
  ngAfterViewInit(): void {
    this.onAfterViewInit()
  }

  ngOnInit(): void {
    super.onInit();
  }
 
}