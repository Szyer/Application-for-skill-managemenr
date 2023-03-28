import { Component, ViewChild } from '@angular/core';
import { Certificate } from './certificate';
import { MatTableDataSource } from '@angular/material/table';
import { MatSort } from '@angular/material/sort';
import { CertificateService } from './certificate.service';

@Component({
  selector: 'app-certification',
  templateUrl: './certification.component.html',
  styleUrls: ['./certification.component.css']
})
export class CertificationComponent {
  certifications!: Certificate[];
  displayedColumns: string[] = ['certificationName', 'employee'];
  dataSource!: MatTableDataSource<Certificate>;

  @ViewChild(MatSort) sor!: MatSort;

  constructor(private certificationService: CertificateService) { }

  ngOnInit(): void {
      this.certificationService.getAllCertifications().subscribe(data => {
        this.certifications = data;
        this.dataSource = new MatTableDataSource<Certificate>(this.certifications);
        this.dataSource.sort = this.sor;
      });
    }
  }

  

