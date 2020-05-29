import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {SignupRequestPayload} from "../signup/signup-request.payload";
import {Observable} from "rxjs";
import {LoginRequestPayload} from "../login/login-request.payload";

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private httpClient: HttpClient) {

  }

  signup(signupRequestPayload: SignupRequestPayload): Observable<any> {
    return this.httpClient.post('http://localhost:8080/api/auth/signup',
      signupRequestPayload, { responseType: 'text' });
  }

  login(loginRequestPayload: LoginRequestPayload): Observable<any>{
    return this.httpClient.post('http://localhost:8080/api/auth/login',
      loginRequestPayload,{responseType: "text"})


  }
}
