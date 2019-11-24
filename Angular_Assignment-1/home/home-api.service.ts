import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HomeApiService {

  API_KEY = '3293d5260290446fbbf49df643b5054c';
  constructor(private httpClient:HttpClient) { }

  getNews():Observable<object>{
    return this.httpClient.get('https://newsapi.org/v2/top-headlines?sources=techcrunch&apiKey='+this.API_KEY);
  }
}
