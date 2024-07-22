import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { TableOneConfgRoutingModule } from './table-one-confg-routing.module';
import { TableOneConfgBaseModule } from '@baseapp/table-one-confg/table-one-confg.base.module';
@NgModule({
  declarations: [
  ],
  imports: [
    CommonModule,
    TableOneConfgBaseModule,
    TableOneConfgRoutingModule
    
  ],
  exports: [
      TableOneConfgBaseModule,
  ]

})
export class TableOneConfgModule  { }