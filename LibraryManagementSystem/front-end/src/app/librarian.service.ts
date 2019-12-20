import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';


@Injectable({
    providedIn: 'root'
  })

export class LibrarianService {

    constructor(private http: HttpClient) {}


    addBook(book): Observable<any> {
        return this.http.post<any>('http://localhost:8080/libraryspringrest/addbook', book);
    }

    deleteBook(id: any): Observable<any> {
        return this.http.delete<any>(`http://localhost:8080/libraryspringrest/delete?id=${id}`);
    }

    updateBook(book: any): Observable<any> {
        return this.http.put<any>('http://localhost:8080/libraryspringrest/updatebook', book);
    }

    getBook(): Observable<any> {
        return this.http.get<any>('http://localhost:8080/libraryspringrest/get-all');
    }
}
