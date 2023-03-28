import { Component, ViewChild } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { Experience } from './experience';
import { MatSort } from '@angular/material/sort';
import { ExperienceService } from './experience.service';

@Component({
  selector: 'app-experience',
  templateUrl: './experience.component.html',
  styleUrls: ['./experience.component.css']
})
export class ExperienceComponent {
  experience!: Experience[];
  displayedColumns: string[] = ['employee','jobTitle', 'rating'];
  dataSource!: MatTableDataSource<Experience>;

  @ViewChild(MatSort) sort!: MatSort;

  constructor(private experienceService: ExperienceService) { }

  ngOnInit(): void {
      this.experienceService.getAllExperiences().subscribe(data => {
        this.experience = data;
        this.dataSource = new MatTableDataSource<Experience>(this.experience);
        this.dataSource.sort = this.sort;
      });
    }
}
