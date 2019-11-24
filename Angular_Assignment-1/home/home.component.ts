import { ApiService } from './../api.service';
import { HomeApiService } from './home-api.service';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  
  public entertainmentArticles:Array<any>;
  public topArticles:Array<any>;
  public sportsArticles:Array<any>;
  constructor(
    private apiService:ApiService,
  ) { }

  ngOnInit() {
    this.fetchEntertainmentData();
    this.fetchSportsData();
    this.fetchTopData();
  }
  fetchEntertainmentData(){
    this.apiService.getEntertainmentNews().subscribe(result=>{
      console.log(result)
      this.entertainmentArticles = result['articles'];
    });
  }

  fetchTopData(){
    this.apiService.getTopNews().subscribe(result=>{
      console.log(result)
      this.topArticles = result['articles'];
    });
  }

  fetchSportsData(){
    this.apiService.getSportsNews().subscribe(result=>{
      console.log(result)
      this.sportsArticles = result['articles'];
    });
  }
}
