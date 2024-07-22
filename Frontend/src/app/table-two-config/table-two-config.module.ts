import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { TableTwoConfigRoutingModule } from './table-two-config-routing.module';
import { TableTwoConfigBaseModule } from '@baseapp/table-two-config/table-two-config.base.module';
@NgModule({
  declarations: [
  ],
  imports: [
    CommonModule,
    TableTwoConfigBaseModule,
    TableTwoConfigRoutingModule
    
  ],
  exports: [
      TableTwoConfigBaseModule,
  ]

})
export class TableTwoConfigModule  { }