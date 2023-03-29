import { Component, EventEmitter, Output, ViewChild } from '@angular/core';
import { Employee } from './employee';
import { EmployeeService } from './employee.service';
import { MatTableDataSource } from '@angular/material/table';
import { MatSort } from '@angular/material/sort';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent {
  @Output() onDataReady = new EventEmitter<any>();
  searchJobTitle: string = '';
  selectedJobTitle: string = '';
  employees: Employee[] = [];
  filteredEmployees: Employee[] = [];
  displayedColumns: string[] = [
    'name',
    'email',
    'phone_number',
    'job_title',
    'salary',
    'productivity_score',
    'quality_of_work_score',
    'attendance_score',
  ];
  
  constructor(private employeeService: EmployeeService) { }
  dataSource!: MatTableDataSource<Employee>;
  @ViewChild(MatSort) sort!: MatSort;
  ngOnInit(): void {
    
    this.employeeService.getAllEmployees().subscribe(data => {
        this.employees = data;
        this.dataSource = new MatTableDataSource(data);
        this.dataSource.sort = this.sort;
      });
    
  }
  filterEmployees() {
    this.filteredEmployees = this.employees;
    if (this.selectedJobTitle && this.selectedJobTitle !== "") {
      this.filteredEmployees = this.filteredEmployees.filter(employee => employee.job_title == this.selectedJobTitle);
    }
    this.dataSource = new MatTableDataSource(this.filteredEmployees);
    this.dataSource.sort = this.sort;
  }
}

