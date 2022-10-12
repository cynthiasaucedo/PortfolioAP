import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { subscribeOn } from 'rxjs';
import { Education } from 'src/app/models/education';
import { EducationService } from 'src/app/services/education.service';
import { PortfolioService } from 'src/app/services/portfolio.service';

@Component({
  selector: 'education',
  templateUrl: './education.component.html',
  styleUrls: ['./education.component.css']
})
export class EducationComponent implements OnInit {
  
  public educations: Education[]=[];


  constructor(private educationService: EducationService) { }

  ngOnInit(): void {
    this.getEducations();
  }

  public getEducations():void{
  this.educationService.getEducation().subscribe({
      next:(Response: Education[]) =>{
        this.educations=Response;
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
    })
    }

}
