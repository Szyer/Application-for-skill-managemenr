import { Injectable } from '@angular/core';
import { Skill } from './skills';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class SkillsService {

  constructor(
    private http : HttpClient
  ) { }
  private apiUrl = 'http://localhost:8085/api/v1';
  
  getAllSkills(): Observable<Skill[]> {
    return this.http.get<Skill[]>('http://localhost:8085/api/v1/skill/getAllSkills');
  }
  getEmployeesByJob(skill: string): Observable<Skill[]> {
    return this.http.get<Skill[]>(`${this.apiUrl}/Skill/getEmployeeBySkill${skill}`);
  }
}
