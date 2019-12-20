import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './lms/home/home.component';
import { FooterComponent } from './footer/footer.component';
import { StudentregisterComponent } from './lms/register/studentregister/studentregister.component';
import { LibrarianregisterComponent } from './lms/register/librarianregister/librarianregister.component';
import { StudentloginComponent } from './login/studentlogin/studentlogin.component';
import { LibrarianloginComponent } from './login/librarianlogin/librarianlogin.component';
import { StudentComponent } from './lms/student/student.component';
import { LibrarianComponent } from './lms/librarian/librarian.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AddbookComponent } from './lms/librarian/addbook/addbook.component';
import { UpdatebookComponent } from './lms/librarian/updatebook/updatebook.component';
import { DeletebookComponent } from './lms/librarian/deletebook/deletebook.component';
import { ShowAllComponent } from './lms/librarian/show-all/show-all.component';
import { AcceptissueComponent } from './lms/librarian/acceptissue/acceptissue.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    FooterComponent,
    StudentregisterComponent,
    LibrarianregisterComponent,
    StudentloginComponent,
    LibrarianloginComponent,
    StudentComponent,
    LibrarianComponent,
    AddbookComponent,
    UpdatebookComponent,
    DeletebookComponent,
    ShowAllComponent,
    AcceptissueComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
