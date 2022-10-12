import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Profile } from 'src/app/models/profile';
import { ProfileService } from 'src/app/services/profile/profile.service';

@Component({
  selector: 'profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  public profile: Profile | undefined;
  public editProfile: Profile | undefined;

  constructor(private profileService : ProfileService) { }

  ngOnInit(): void {
    this.getProfile();
  }

  public getProfile():void{
    this.profileService.getProfile().subscribe({
      next: (response: Profile) =>{
        this.profile = response;
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }
}
