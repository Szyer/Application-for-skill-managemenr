import { Component, ViewChild } from '@angular/core';
import { MatSort } from '@angular/material/sort';
import { WorkingdaysService } from './workingdays.service';
import { MatTableDataSource } from '@angular/material/table';
import { WorkingDays } from './workingdays';

@Component({
  selector: 'app-workingdays',
  templateUrl: './workingdays.component.html',
  styleUrls: ['./workingdays.component.css']
})
export class WorkingdaysComponent {
  constructor(
    private workingdayService : WorkingdaysService
  ){}
  displayedColumns: string[] = [ 'totalWorkingDays', 'employee'];
  dataSource = new MatTableDataSource<WorkingDays>();
  @ViewChild(MatSort) sort!: MatSort;


  ngOnInit() {
    this.workingdayService.getAllWorkingDays().subscribe(data => {
      this.dataSource.data = data;
      this.dataSource = new MatTableDataSource(data);
      this.dataSource.sort = this.sort;
    });
  }

}
