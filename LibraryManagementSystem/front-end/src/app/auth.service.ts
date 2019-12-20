import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
    providedIn: 'root'
  })
  export class AuthService {

    constructor(private http: HttpClient) { }

    registerStudent(student): Observable<any> {
        return this.http.post('http://localhost:8080/libraryspringrest/registerstud', student);
    }

    loginStudent(student): Observable<any> {
        return this.http.post('http://localhost:8080/libraryspringrest/student/login', student);
    }

    registerLibrarian(librarian): Observable<any> {
        return this.http.post('http://localhost:8080/libraryspringrest/registerlib', librarian);
    }

    loginLibrarian(librarian): Observable<any> {
        return this.http.post('http://localhost:8080/libraryspringrest/librarian/login', librarian);
    }
}
