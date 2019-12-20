import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserserviceService {

  constructor(private http: HttpClient) { }

  userRegister(user): Observable<any> {
    return this.http.post('http://localhost:8080/register', user);
  }

  userLogin(user): Observable<any> {
    return this.http.post('http://localhost:8080/login', user);
  }
}
