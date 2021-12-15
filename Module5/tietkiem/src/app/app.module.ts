import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { TietkiemListComponent } from './tietkiem-list/tietkiem-list.component';
import {MatTableModule} from "@angular/material/table";
import {HttpClientModule} from "@angular/common/http";
import {MatButtonModule} from "@angular/material/button";
import { TietkiemDetailComponent } from './tietkiem-detail/tietkiem-detail.component';
import {MatDialog, MatDialogModule} from "@angular/material/dialog";
import { TietkiemDeleteComponent } from './tietkiem-delete/tietkiem-delete.component';
import { TietkiemCreateComponent } from './tietkiem-create/tietkiem-create.component';
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatInputModule} from "@angular/material/input";
import {MatSelectModule} from "@angular/material/select";
import {MatGridListModule} from "@angular/material/grid-list";
import {MatDatepickerModule} from "@angular/material/datepicker";
import {MatNativeDateModule} from "@angular/material/core";
import {ReactiveFormsModule} from "@angular/forms";
import {MatCurrencyFormatModule} from "mat-currency-format";
import { TietkiemEditComponent } from './tietkiem-edit/tietkiem-edit.component';
import {MatSnackBar, MatSnackBarModule} from "@angular/material/snack-bar";
import {MatPaginatorModule} from "@angular/material/paginator";

@NgModule({
  declarations: [
    AppComponent,
    TietkiemListComponent,
    TietkiemDetailComponent,
    TietkiemDeleteComponent,
    TietkiemCreateComponent,
    TietkiemEditComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    MatTableModule,
    HttpClientModule,
    MatButtonModule,
    MatDialogModule,
    MatFormFieldModule,
    MatInputModule,
    MatSelectModule,
    MatGridListModule,
    MatDatepickerModule,
    MatNativeDateModule,
    ReactiveFormsModule,
    MatCurrencyFormatModule,
    MatSnackBarModule,
    MatPaginatorModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
