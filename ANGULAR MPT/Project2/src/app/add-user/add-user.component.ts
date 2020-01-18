import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent implements OnInit {
  success: any;
  failure: any;

  constructor(private user: UserService) { }

  ngOnInit() {
  }
  addUsers(form: NgForm) {
    this.user.addUsers(form.value).subscribe(data => {
      console.log(data);

      if (data.statusCode === 201) {
        this.success = data.description;
        setTimeout(() => {
          this.success = null;
        }, 3000);
        form.reset();
      } else {
        this.failure = data.description;
        setTimeout(() => {
          this.failure = null;
        }, 3000);
      }
    });

  }
}
