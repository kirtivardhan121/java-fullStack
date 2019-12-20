import { AcceptissueComponent } from './lms/librarian/acceptissue/acceptissue.component';
import { ShowAllComponent } from './lms/librarian/show-all/show-all.component';
import { UpdatebookComponent } from './lms/librarian/updatebook/updatebook.component';
import { AddbookComponent } from './lms/librarian/addbook/addbook.component';
import { LibrarianComponent } from './lms/librarian/librarian.component';
import { StudentComponent } from './lms/student/student.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule, CanActivate } from '@angular/router';
import { HomeComponent } from './lms/home/home.component';
import { StudentregisterComponent } from './lms/register/studentregister/studentregister.component';
import { LibrarianregisterComponent } from './lms/register/librarianregister/librarianregister.component';
import { LibrarianloginComponent } from './login/librarianlogin/librarianlogin.component';
import { StudentloginComponent } from './login/studentlogin/studentlogin.component';
import { AuthGuard } from './auth.guard';
import { DeletebookComponent } from './lms/librarian/deletebook/deletebook.component';


const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'sregister' , component: StudentregisterComponent},
  {path: 'lregister' , component: LibrarianregisterComponent},
  {path: 'slogin' , component: StudentloginComponent},
  {path: 'llognin' , component: LibrarianloginComponent},
  {path: 'student', component: StudentComponent,
  canActivate: [AuthGuard], data: { roles: ['librarian', 'student']}},
  {path: 'librarian', component: LibrarianComponent,
  canActivate: [AuthGuard], data: { roles: ['librarian']}},
  {path: 'addbook', component: AddbookComponent},
  {path: 'updatebook', component: UpdatebookComponent},
  {path: 'deletebook', component: DeletebookComponent},
  {path: 'showallbooks', component: ShowAllComponent},
  {path: 'acceptissue', component: AcceptissueComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
