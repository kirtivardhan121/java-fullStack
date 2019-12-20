import { AuthService } from './../../../auth.service';
import { Component, OnInit, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-studentregister',
  templateUrl: './studentregister.component.html',
  styleUrls: ['./studentregister.component.css']
})
export class StudentregisterComponent implements OnInit, OnDestroy {

  error: string;

  constructor(private auth: AuthService, private router: Router) { }

  register(form: NgForm) {

    this.error = null;
    this.auth.registerStudent(form.value)
    .subscribe(res => {
      console.log('registration response', res);
      this.router.navigateByUrl('/slogin');
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });
  }


  ngOnInit() {
  }


  ngOnDestroy() {
    this.error = null;
  }

}
