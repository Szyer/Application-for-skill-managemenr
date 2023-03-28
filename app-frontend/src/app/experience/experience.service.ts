import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Certificate } from '../certification/certificate';
import { HttpClient } from '@angular/common/http';
import { Experience } from './experience';

@Injectable({
  providedIn: 'root'
})
export class ExperienceService {

  constructor( private http: HttpClient) { 
   
  }
  private baseUrl = 'http://localhost:8085/api/v1';
  getAllExperiences(): Observable<Experience[]> {
    return this.http.get<Experience[]>(`http://localhost:8085/api/v1/experience/getAllExperiences`);
  }
}
