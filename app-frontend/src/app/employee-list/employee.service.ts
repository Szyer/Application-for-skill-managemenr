import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, forkJoin, map, mergeMap, of } from 'rxjs';
import { Employee } from './employee';
import { Skill } from '../skills/skills';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private baseUrl = 'http://localhost:8085/api/v1/employee/getAllEmployees';
  private apiUrl = 'http://localhost:8085/api/v1';
  constructor(
    private http: HttpClient
  ) { }

  getAllEmployees(): Observable<Employee[]> {
    return this.http.get<Employee[]>(this.baseUrl);
  }


  getEmployeesByJob(jobTitle: string): Observable<Employee[]> {
    return this.http.get<Employee[]>(`${this.baseUrl}/getEmployeesByJob/${jobTitle}`);
  }
}
