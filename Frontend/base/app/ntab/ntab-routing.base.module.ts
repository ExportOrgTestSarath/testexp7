import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CanDeactivateGuard } from '@baseapp/auth.can-deactivate-guard.service';

import { NtabListComponent } from '@app/ntab/ntab/ntab-list/ntab-list.component';
import { NtabDetailComponent } from '@app/ntab/ntab/ntab-detail/ntab-detail.component';

export const routes: Routes = [

{
     path: 'ntablist',
     component: NtabListComponent,
     canDeactivate: [ CanDeactivateGuard ],
     data: {
     	label: "NTAB_LIST",
        breadcrumb: "NTAB_LIST",
        roles : [					"all"
				]
     }
},
{
     path: 'ntabdetail',
     component: NtabDetailComponent,
     canDeactivate: [ CanDeactivateGuard ],
     data: {
     	label: "NTAB_DETAIL",
        breadcrumb: "NTAB_DETAIL",
        roles : [					"all"
				]
     }
}
];

@NgModule({
  imports: [ RouterModule.forChild(routes) ],
  exports: [ RouterModule ]
})
export class NtabBaseRoutingModule
{
}
