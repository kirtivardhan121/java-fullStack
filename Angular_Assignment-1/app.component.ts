import { ApiService } from './api.service';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public articles:Array<any>;
  constructor(
    private apiService:ApiService,
  ) { }

  ngOnInit() {
    // this.apiService.getNews().subscribe((data)=>{
    //   console.log(data);
    //   this.articles = data['articles'];
    // });

  }

}

