import { Component, OnInit } from '@angular/core';

import {   Users } from '../users';

import { UsersServiceService } from '../users-service.service';

import { ActivatedRoute,Router } from '@angular/router';

import { FormBuilder, FormGroup, Validators } from '@angular/forms';





@Component({

  selector: 'app-user-login',

  templateUrl: './user-login.component.html',

  styleUrls: ['./user-login.component.css']

})

export class UserLoginComponent implements OnInit {

user:Users = new Users();



model:any;

name:string;

password:string;

getdata:boolean;

  constructor(private userService: UsersServiceService, private router: Router,

  	private route: ActivatedRoute,private formBuilder: FormBuilder) { }



  ngOnInit() {

  		/*this.user = new Users();
  	this.name= this.route.snapshot.params['name'];
        this.password= this.route.snapshot.params['password'];
  	this.userService.getUsers(this.name)
  	.subscribe(data=>{
  		console.log(data)
  		this.user= data;
  	}, error =>console.log(error));*/

 

 /* newUsers(): void {
  	this.submitted= false;
  	this.user = new Users();
  }
  save() {
  	this.userService.loginValidation(this.name,this.password,this.user)
  	.subscribe(data => console.log(data), error => console.log(error));
  	this.user = new Users();
     alert('Success!!:-)');
  	this.gotoList();  
  }
  onSubmit() {
this.submitted=true;
      this.save();
}
/**/

 /* gotoList() {
  	this.router.navigate(['/home']);
  }*/


}
Loginuser()

{

  var name=this.user.name;

    var password=this.user.password;

    console.log(name);

    console.log(password);

    this.userService.loginValidation(name,password)

    .subscribe((res:boolean)=>{

     console.log("Hello---"+res);

  

    this.getdata=res;

    console.log("flag "+this.getdata);

          });

    if(this.getdata==true)

    {

   console.log("j");

      this.router.navigate(['/home'])

    }

}
}
