import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { NtabRoutingModule } from './ntab-routing.module';
import { NtabBaseModule } from '@baseapp/ntab/ntab.base.module';
@NgModule({
  declarations: [
  ],
  imports: [
    CommonModule,
    NtabBaseModule,
    NtabRoutingModule
    
  ],
  exports: [
      NtabBaseModule,
  ]

})
export class NtabModule  { }