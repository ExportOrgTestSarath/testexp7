import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { routes } from '@baseapp/table-one-confg/table-one-confg-routing.base.module';

/**
 * Extend routes here 
 * Example, 
 * 
 *  routes.push({
 *    path: 'projectsublist',
 *    component: ProjectsSubListComponent,
 *    data: {
 *       label: "PROJECTS_SUB_LIST",
 *       expectedRoles: ["business_owner"],
 *      breadcrumb: "PROJECTS_SUB_LIST",
 *     }
 *  })
 */

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})

export class TableOneConfgRoutingModule { }