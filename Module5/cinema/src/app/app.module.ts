import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { CinemaListComponent } from './cinema-list/cinema-list.component';
import {HttpClientModule} from "@angular/common/http";
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { CinemaDeleteComponent } from './cinema-delete/cinema-delete.component';
import { MatDialogModule} from "@angular/material/dialog";
import { CinemaCreateComponent } from './cinema-create/cinema-create.component';
import {Router, RouterModule} from "@angular/router";
import {ReactiveFormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
    CinemaListComponent,
    CinemaDeleteComponent,
    CinemaCreateComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatDialogModule,
    RouterModule.forRoot([
      {path: "", component: CinemaListComponent},
      {path: "create", component: CinemaCreateComponent}
    ]),
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
