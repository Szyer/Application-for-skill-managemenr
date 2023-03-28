import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Skill } from '../skills/skills';
import { HttpClient } from '@angular/common/http';
import { WorkingDays } from './workingdays';

@Injectable({
  providedIn: 'root'
})
export class WorkingdaysService {

  constructor(
    private http: HttpClient
  ) { }
  getAllWorkingDays(): Observable<WorkingDays[]> {
    return this.http.get<WorkingDays[]>('http://localhost:8085/api/v1/workingdays/getAllWorkingdays');
  }
}
