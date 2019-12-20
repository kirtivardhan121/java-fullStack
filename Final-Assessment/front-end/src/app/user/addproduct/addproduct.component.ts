import { ProductserviceService } from './../../productservice.service';
import { Component, OnInit, OnDestroy } from '@angular/core';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit, OnDestroy {

  error: string;

  constructor(private service: ProductserviceService, private router: Router) { }

  addProduct(form: NgForm) {

    this.error = null;
    this.service.addProduct(form.value)
    .subscribe(res => {
      console.log('Response', res);
      this.router.navigateByUrl('/user');
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
