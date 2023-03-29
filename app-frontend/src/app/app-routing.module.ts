import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { AppModule } from './app.module';
import { SkillsComponent } from './skills/skills.component';
import { CertificationComponent } from './certification/certification.component';
import { HomeComponent } from './home/home.component';
import { ExperienceComponent } from './experience/experience.component';
import { WorkingdaysComponent } from './workingdays/workingdays.component';
import { ChartsComponent } from './charts/charts.component';

const routes: Routes = [
  {path:'', component:HomeComponent},
  {path:'employees', component:EmployeeListComponent},
  {path:'skills', component:SkillsComponent},
  {path:'certificate', component:CertificationComponent},
  {path:'experience', component:ExperienceComponent},
  {path:'workingdays', component:WorkingdaysComponent},
  {path:'chart', component:ChartsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
