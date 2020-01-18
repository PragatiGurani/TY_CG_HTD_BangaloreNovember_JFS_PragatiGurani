import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-get-all-user',
  templateUrl: './get-all-user.component.html',
  styleUrls: ['./get-all-user.component.css']
})
export class GetAllUserComponent implements OnInit {

  success: string;
  failure: string;
  users: User[];

  
  constructor(private userDet: UserService,
              private router: Router) {
                this.getAllUser();
               }

  ngOnInit() {
  }

  getAllUser() {
    this.userDet.getAllUser().subscribe(response => {
      console.log(response);
      if (response.statusCode === 201) {
        this.users = response.bean;
        this.success = response.description;
        localStorage.setItem('User Details', JSON.stringify(response));
        setTimeout(() => {
          this.success = null;
        }, 3000);
      } else {
        this.failure = response.description;
        localStorage.setItem('user Details', JSON.stringify(response))
        console.log('user Details are Added');
        setTimeout(() => {
          this.failure = null;
        }, 3000);
      }
    });
}
