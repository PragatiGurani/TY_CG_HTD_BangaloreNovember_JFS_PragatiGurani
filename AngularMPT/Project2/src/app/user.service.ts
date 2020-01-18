import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  url = `http://localhost:8080/project1`;

  constructor(private http: HttpClient) { }

  addUsers(userDetails): Observable<any> {
    return this.http.post<any>(`${this.url}/add-user`, userDetails);
  }

  searchUser(userDetails): Observable<any> {
    return this.http.get<any>(`${this.url}/get-user`, userDetails);
  }
  getAllUser(): Observable<any> {
    return this.http.get<any>(`${this.url}/get-all-user`);
  }

  deleteUser(user: User) {
    return this.http.delete<any>(`${this.url}/delete-user/${user.userId}`);
  }
}
