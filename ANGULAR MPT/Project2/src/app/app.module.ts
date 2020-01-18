import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router'
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { AddUserComponent } from './add-user/add-user.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { EditUserComponent } from './edit-user/edit-user.component';
import { GetAllUserComponent } from './get-all-user/get-all-user.component';

@NgModule({
  declarations: [
    AppComponent,
    AddUserComponent,
    HomeComponent,
    HeaderComponent,
    EditUserComponent,
    GetAllUserComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path: '', component: HomeComponent},
      {path: 'add-user', component: AddUserComponent},
      {path: 'edit-user', component: EditUserComponent},
     
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
