import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-add-movie',
  templateUrl: './add-movie.component.html',
  styleUrls: ['./add-movie.component.css']
})
export class AddMovieComponent implements OnInit {

  get movie() {
    return this.form.get('movie');
  }

  get titl() {
    return this.form.get('titl');
  }
  get url() {
    return this.form.get('url');
  }
  get desc() {
    return this.form.get('desc');
  }

  form = new FormGroup({
    movie: new FormControl('' , [Validators.required]),
    titl: new FormControl('', [Validators.required]),
    url: new FormControl('', Validators.required),
    desc: new FormControl('', Validators.required)
  });

  constructor() { }

  ngOnInit() {
  }

  loginData(form) {
    console.log(form);
  }
}
