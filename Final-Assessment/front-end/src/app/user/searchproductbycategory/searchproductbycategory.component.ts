import { ProductserviceService } from './../../productservice.service';
import { Component, OnInit, OnDestroy } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-searchproductbycategory',
  templateUrl: './searchproductbycategory.component.html',
  styleUrls: ['./searchproductbycategory.component.css']
})
export class SearchproductbycategoryComponent implements OnInit, OnDestroy {

  error = null;
  myProduct;
  constructor(private service: ProductserviceService, private router: Router) { }

  getProduct(name) {
    this.service.searchProduct(name).subscribe(res => {
      console.log('products are', res.product);
      this.myProduct = res.product;
      console.log('my Product', this.myProduct);
    }, err => {
      console.log(err);
    });

  }

  ngOnInit() {
  }

  ngOnDestroy() {
    this.error = null;
  }
}
