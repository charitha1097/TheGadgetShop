import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import {ProductInformation} from "./../product-information";
import { UsersServiceService } from '../users-service.service';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Users } from '../users';
@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
export class DetailsComponent implements OnInit {

 id: string;
name: string;
desc:string;
price:string;
img:string;
products:ProductInformation;

  constructor(private route: ActivatedRoute, private router: Router,
  	private userService: UsersServiceService) { }

  ngOnInit() {
  	this.products = new ProductInformation();

  	this.id = this.route.snapshot.paramMap.get('product_id');
    this.name = this.route.snapshot.paramMap.get('product_name');  
    this.desc = this.route.snapshot.paramMap.get('product_description');    
    this.price = this.route.snapshot.paramMap.get('product_price');    
    this.img = this.route.snapshot.paramMap.get('product_icon');    
   
  	this.userService.getproductid(this.id,this.name,this.desc,this.price,this.img)
  	.subscribe(data=> { 
    
          this.name=this.products.product_name;
          this.desc=this.products.product_description;
          this.price=this.products.product_price;
          this.img=this.products.product_icon;
    
   
    console.log(data)

  })
     

    
  }

    list() {

  	this.router.navigate(['Admin']);
  }
buy(id:number) {

    this.router.navigate(['buy']);
  }


  getcart(product_id:string,product_name:string,product_description:string,product_price:string,product_icon:string) {
    this.router.navigate(['cart',product_id,product_name,product_description,product_price,product_icon]);
  }


}