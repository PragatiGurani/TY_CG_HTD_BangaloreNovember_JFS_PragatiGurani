import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  router: any;

  constructor() { }

  goToId(id, name, url) {
    this.router.navigate([`/user/${id}`], {
      queryParams: {userName: name, userImage: url}
    });
  }
  ngOnInit() {
  }

}
