import {Injectable} from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor() {
  }

  public setRoles(role: string) {
    localStorage.setItem("role", role)
  }

  public getRoles() {
    return localStorage.getItem('role')
  }
}
