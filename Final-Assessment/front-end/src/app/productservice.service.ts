import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductserviceService {

  constructor(private http: HttpClient) { }

  addProduct(product): Observable<any> {
    return this.http.post('http://localhost:8080/add', product);
  }

  modifyProduct(product): Observable<any> {
    return this.http.post('http://localhost:8080/modify', product);
  }

  searchProduct(name): Observable<any> {
    return this.http.get<any>(`http://localhost:8080/getbyname?name=${name}`, name);
  }

  getProduct(category): Observable<any> {

    return this.http.get<any>(`http://localhost:8080/getbyname?category=${category}`, category);
  }
 }
