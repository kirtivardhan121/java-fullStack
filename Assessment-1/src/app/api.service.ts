import { Injectable } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  API_KEY = '3293d5260290446fbbf49df643b5054c';
  constructor(private httpClient:HttpClient) { }

  getTopNews(){
    return this.httpClient.get('https://newsapi.org/v2/top-headlines?country=in&apiKey='+this.API_KEY);
  }
  getEntertainmentNews(){
    return this.httpClient.get('https://newsapi.org/v2/top-headlines?country=in&category=entertainment&apiKey='+this.API_KEY);
  }

  getSportsNews(){
    return this.httpClient.get('https://newsapi.org/v2/top-headlines?country=in&category=sports&apiKey='+this.API_KEY);
  }

}
