import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { TietkiemListComponent } from './tietkiem/tietkiem-list/tietkiem-list.component';
import {HttpClientModule} from "@angular/common/http";
import { TietkiemEditComponent } from './tietkiem/tietkiem-edit/tietkiem-edit.component';
import {RouterModule, Routes} from "@angular/router";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {NgxPaginationModule} from "ngx-pagination";

const routes:Routes=[
  {
    path:'tietkiem',
    component:TietkiemListComponent
  },
  {
    path:'tietkiem/edit/:id',
    component:TietkiemEditComponent
  }
  ]

@NgModule({
  declarations: [
    AppComponent,
    TietkiemListComponent,
    TietkiemEditComponent,

  ],
    imports: [
        BrowserModule,
        HttpClientModule,
        RouterModule.forRoot(routes),
        ReactiveFormsModule,
        FormsModule,
        NgxPaginationModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
