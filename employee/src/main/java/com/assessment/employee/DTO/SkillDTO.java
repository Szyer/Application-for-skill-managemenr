package com.assessment.employee.DTO;

import com.assessment.employee.Entities.Employee;

public class SkillDTO {

    private Long skillId;

    private String skillName;

    private String proficiencyLevel;

    private Long employee;

    public SkillDTO(Long skillId, String skillName, String proficiencyLevel, Employee employee) {
        this.skillId = skillId;
        this.skillName = skillName;
        this.proficiencyLevel = proficiencyLevel;
        this.employee = employee.getEmployee_id();
    }

    public SkillDTO(){}

    public Long getSkillId() {
        return skillId;
    }

    public void setSkillId(Long skillId) {
        this.skillId = skillId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getProficiencyLevel() {
        return proficiencyLevel;
    }

    public void setProficiencyLevel(String proficiencyLevel) {
        this.proficiencyLevel = proficiencyLevel;
    }

    public Long getEmployee() {
        return employee;
    }

    public void setEmployee(Long employee) {
        this.employee = employee;
    }
}
