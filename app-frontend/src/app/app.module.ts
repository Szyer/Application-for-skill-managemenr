import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NavbarComponent } from './navbar/navbar.component';
import { MaterialModule } from './material.module';
import { HttpClientModule } from '@angular/common/http';
import { SkillsComponent } from './skills/skills.component';
import { CertificationComponent } from './certification/certification.component';
import { ExperienceComponent } from './experience/experience.component';
import { HomeComponent } from './home/home.component';
import { EmployeeService } from './employee-list/employee.service';
import { WorkingdaysComponent } from './workingdays/workingdays.component';
import { FormsModule } from '@angular/forms';
import { ChartsComponent } from './charts/charts.component';
import * as CanvasJSAngularChart from '../assets/canvasjs.angular.component'
var CanvasJSChart = CanvasJSAngularChart.CanvasJSChart;
@NgModule({
  declarations: [
   
    EmployeeListComponent,
    NavbarComponent,
    SkillsComponent,
    CertificationComponent,
    ExperienceComponent,
    HomeComponent,
    WorkingdaysComponent,
    ChartsComponent,
    CanvasJSChart,   
    AppComponent
    ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule,
    MaterialModule
  ],
  providers: [EmployeeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
