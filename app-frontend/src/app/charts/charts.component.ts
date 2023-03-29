import { Component, Input } from '@angular/core';
import { CanvasJS } from 'src/assets/canvasjs.angular.component';
import { HostListener } from '@angular/core';
import {Chart} from 'chart.js';
import { Employee } from '../employee-list/employee';
import { ActivatedRoute } from '@angular/router';
import { EmployeeService } from '../employee-list/employee.service';
@Component({
  selector: 'app-charts',
  templateUrl: './charts.component.html',
  styleUrls: ['./charts.component.css']
})
export class ChartsComponent {

  chart: any;
  charts: Employee[] = [];

  constructor(
    private route : ActivatedRoute,
    private empService : EmployeeService
  ){
    
  }

  getChart(){
    this.empService.getAllEmployees().subscribe((data)=>{
      this.charts = data;
      const chart = new CanvasJS.Chart("chartContainer", {
        animationEnabled: true,
        exportEnabled: true,
        theme: "light2", 
        title:{
          text: "KPI INDEX"
        },
          axisY: {
            includeZero: true
          },
        data: [{
          type: "line",
          indexLabelFontColor: "#5A5757",
              indexLabelFontSize: 16,
          indexLabelPlacement: "outside",
          dataPoints: [
            { x: 1, y: this.charts[0].attendance_score},
            { x: 2, y: this.charts[1].attendance_score },
            { x: 3, y: this.charts[2].attendance_score },
            { x: 4, y: this.charts[3].attendance_score },
            { x: 5, y: this.charts[4].attendance_score },
            { x: 6, y: this.charts[5].attendance_score},
            { x: 7, y: this.charts[6].attendance_score },
            { x: 8, y: this.charts[7].attendance_score},
                 
          ]
        },
        {
          type: "line",
          indexLabelFontColor: "#5A5757",
              indexLabelFontSize: 16,
          indexLabelPlacement: "outside",
          dataPoints: [
            { x: 1, y: this.charts[0].productivity_score},
            { x: 2, y: this.charts[1].productivity_score },
            { x: 3, y: this.charts[2].productivity_score },
            { x: 4, y: this.charts[3].productivity_score },
            { x: 5, y: this.charts[4].productivity_score },
            { x: 6, y: this.charts[5].productivity_score},
            { x: 7, y: this.charts[6].productivity_score },
            { x: 8, y: this.charts[7].productivity_score},
                 
          ]
        },
        {
          type: "line",
          indexLabelFontColor: "#5A5757",
              indexLabelFontSize: 16,
          indexLabelPlacement: "outside",
          dataPoints: [
            { x: 1, y: this.charts[0].productivity_score},
            { x: 2, y: this.charts[1].productivity_score },
            { x: 3, y: this.charts[2].productivity_score },
            { x: 4, y: this.charts[3].productivity_score },
            { x: 5, y: this.charts[4].productivity_score},
            { x: 6, y: this.charts[5].productivity_score},
            { x: 7, y: this.charts[6].productivity_score },
            { x: 8, y: this.charts[7].productivity_score},
                 
          ]
        },
        {
          type: "line",
          indexLabelFontColor: "#5A5757",
              indexLabelFontSize: 16,
          indexLabelPlacement: "outside",
          dataPoints: [
            { x: 1, y: this.charts[0].quality_of_work_score},
            { x: 2, y: this.charts[1].quality_of_work_score },
            { x: 3, y: this.charts[2].quality_of_work_score },
            { x: 4, y: this.charts[3].quality_of_work_score },
            { x: 5, y: this.charts[4].quality_of_work_score },
            { x: 6, y: this.charts[5].quality_of_work_score},
            { x: 7, y: this.charts[6].quality_of_work_score },
            { x: 8, y: this.charts[7].quality_of_work_score },
                 
          ]
        }]
        
      });
      chart.render();
    })
  }

    

  
  ngOnInit(): void {
    this.getChart();
}

}