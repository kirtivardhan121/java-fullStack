import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mobile',
  templateUrl: './mobile.component.html',
  styleUrls: ['./mobile.component.css']
})
export class MobileComponent implements OnInit {

  selectMobile;
  mobiles = [
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2018/01/08/02/34/technology-3068617__340.jpg',
      name: 'Iphone X',
      model: 'Model: 2016',
      // tslint:disable-next-line:max-line-length
      description: 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'
    },
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2018/08/09/10/46/phone-3594206__340.jpg',
      name: 'Old Phone',
      model: 'Model: 2017',
      // tslint:disable-next-line:max-line-length
      description: 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'

    },
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2017/04/26/16/06/mobile-2262928__340.jpg',
      name: 'Samsung Galaxy',
      model: 'Model: 2016',
      // tslint:disable-next-line:max-line-length
      description: 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'

    },
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2016/11/22/23/40/electronics-1851218__340.jpg',
      name: 'Mi',
      model: 'Model: 2016',
      // tslint:disable-next-line:max-line-length
      description: 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'

    },
    {
      imgUrl: 'https://cdn.pixabay.com/photo/2015/01/02/00/01/telephone-586268__340.jpg',
      name: 'Asus Zenphone',
      model: 'Model: 2017',
      // tslint:disable-next-line:max-line-length
      description: 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'

    }
  ];
  constructor() { }

  ngOnInit() {
  }
  sendMobile(mobile) {
    this.selectMobile = mobile;
    console.log(mobile);
  }
}
