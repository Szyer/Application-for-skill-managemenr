import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Certificate } from './certificate';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CertificateService {

  constructor(
    private http: HttpClient
  ) { }
  private baseUrl = 'http://localhost:8085/api/v1';
  getAllCertifications(): Observable<Certificate[]> {
    return this.http.get<Certificate[]>(`${this.baseUrl}/certification/getAllCertifications`);
  }
}
