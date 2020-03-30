import { BrowserModule } from '@angular/platform-browser';

import { NgModule } from '@angular/core';

import { ReactiveFormsModule,FormsModule } from '@angular/forms';

import { HttpClientModule } from '@angular/common/http';



import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';

import { UserSignupComponent } from './user-signup/user-signup.component';

import { UserLoginComponent } from './user-login/user-login.component';

import { HomeComponent } from './home/home.component';

import { ProductInfoComponent } from './product-info/product-info.component';
import { ProductDetailsComponent } from './product-details/product-details.component';
import { BuynowComponent } from './buynow/buynow.component';
import { AddcartsComponent } from './addcarts/addcarts.component';
import { AddProductComponent } from './add-product/add-product.component';
import { MobileComponent } from './mobile/mobile.component';
import { LaptopComponent } from './laptop/laptop.component';
import { CameraComponent } from './camera/camera.component';
import { SmartwatchComponent } from './smartwatch/smartwatch.component';
import { ProductListAdminComponent } from './product-list-admin/product-list-admin.component';
import { LastpageComponent } from './lastpage/lastpage.component';
import { DetailsComponent } from './details/details.component';



@NgModule({

  declarations: [

    AppComponent,

    UserSignupComponent,

    UserLoginComponent,

    HomeComponent,

    ProductInfoComponent,

    ProductDetailsComponent,

    BuynowComponent,

    AddcartsComponent,

    AddProductComponent,

    MobileComponent,

    LaptopComponent,

    CameraComponent,

    SmartwatchComponent,

    ProductListAdminComponent,

    LastpageComponent,

    DetailsComponent,

    
    

  ],

  imports: [

    BrowserModule,

    AppRoutingModule,

    FormsModule,

    HttpClientModule,

    ReactiveFormsModule





  ],

  providers: [],

  bootstrap: [AppComponent]

})

export class AppModule { }