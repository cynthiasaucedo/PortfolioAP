import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Profile } from 'src/app/models/profile';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})

export class ProfileService {
  private apiServerUrl=environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  //methods
  public getProfile():Observable<Profile>{
    return this.http.get<Profile>(`${this.apiServerUrl}profile/id/1`);
  }

  public editProfile(profile: Profile):Observable<Profile>{
    return this.http.put<Profile>(`${this.apiServerUrl}/edit`, profile);
  }
}
