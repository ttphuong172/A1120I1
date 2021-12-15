import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ListComponent } from './list/list.component';
import {HttpClientModule} from "@angular/common/http";
import { DetailComponent } from './detail/detail.component';
import {MatDialogModule} from "@angular/material/dialog";
import { CreateComponent } from './create/create.component';
import {ReactiveFormsModule} from "@angular/forms";
import { EditComponent } from './edit/edit.component';
import { DeleteComponent } from './delete/delete.component';
import {NgxPaginationModule} from "ngx-pagination";

@NgModule({
  declarations: [
    AppComponent,
    ListComponent,
    DetailComponent,
    CreateComponent,
    EditComponent,
    DeleteComponent
  ],
    imports: [
        BrowserModule,
        BrowserAnimationsModule,
        HttpClientModule,
        MatDialogModule,
        ReactiveFormsModule,
        NgxPaginationModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
