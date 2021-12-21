import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppComponent} from './app.component';
import {UserLoginComponent} from './user-login/user-login.component';
import {ReactiveFormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import {RouterModule} from "@angular/router";
import {AdminPageComponent} from './admin-page/admin-page.component';
import {UserPageComponent} from "./user-page/user-page.component";
import {AuthGuard} from "./service/auth.guard";

@NgModule({
  declarations: [
    AppComponent,
    UserLoginComponent,
    AdminPageComponent,
    UserPageComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path: '', component: UserLoginComponent},
      {path: 'admin', component: AdminPageComponent, canActivate: [AuthGuard]},
      {path: 'user', component: UserPageComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
