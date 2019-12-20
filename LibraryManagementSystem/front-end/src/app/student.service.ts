import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
    providedIn: 'root'
  })


export class StudentService {

    constructor(private http: HttpClient) {}

    getBook(id): Observable<any> {
        return this.http.get<any>(`http://localhost:8080/libraryspringrest/searchbook?id=${id}`);
    }

    requestBook(rollno, bid): Observable<any> {
        return this.http.get<any>(`http://localhost:8080/libraryspringrest/requestbook/${rollno}?bid=${bid}`);
    }
}
