import { Component, ViewChild } from '@angular/core';
import { MatSort } from '@angular/material/sort';
import { MatTableDataSource } from '@angular/material/table';
import { Skill } from './skills';
import { SkillsService } from './skills.service';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent {
  selectedSkill: string = '';
  filteredSkill: Skill[] = [];
  skills: Skill[] = [];
  constructor(private skillService: SkillsService) {}
  displayedColumns: string[] = ['employee', 'skillName', 'proficiencyLevel'];
  dataSource = new MatTableDataSource<Skill>();
  @ViewChild(MatSort) sort!: MatSort;

  ngOnInit() {
    this.skillService.getAllSkills().subscribe(data => {
      this.skills = data;
      this.dataSource.data = this.skills;
      this.dataSource.sort = this.sort;
    });
  }

  filterSkills() {
    this.filteredSkill = this.skills;
    if (this.selectedSkill && this.selectedSkill !== '') {
      this.filteredSkill = this.filteredSkill.filter(skill => skill.skillName == this.selectedSkill);
    }
    this.dataSource = new MatTableDataSource(this.filteredSkill);
    this.dataSource.sort = this.sort;
  }
}
