package com.assessment.employee.Service;


import com.assessment.employee.DTO.SkillDTO;
import com.assessment.employee.DTO.SkillSaveDTO;
import com.assessment.employee.Entities.Employee;
import com.assessment.employee.Entities.Skill;
import com.assessment.employee.Repositories.EmployeeRepo;
import com.assessment.employee.Repositories.SkillRepo;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SkillServiceIMPL implements SkillService {
    @Autowired
    private SkillRepo skillRepo;

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public String saveSkill(SkillSaveDTO skillSaveDTO) {
        Optional<Employee> employee = Optional.ofNullable(employeeRepo.findById(skillSaveDTO.getEmployee().getEmployee_id())
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found")));
        Skill skill = new Skill(
                skillSaveDTO.getSkillName(),
                skillSaveDTO.getProficiencyLevel(),
                employee.get()
        );
        skillRepo.save(skill);
        return skill.getSkillName();
    }

    @Override
    public List<SkillDTO> getAllSkills() {
        List<Skill> getSkill = skillRepo.findAll();
        List<SkillDTO> skillDTOList = new ArrayList<>();
        for (Skill a : getSkill) {
            SkillDTO skillDTO = new SkillDTO(
                    a.getSkillId(),
                    a.getSkillName(),
                    a.getProficiencyLevel(),
                    a.getEmployee()
            );
            skillDTOList.add(skillDTO);
        }
        return skillDTOList;
    }

    @Override
    public List<SkillDTO> getEmployeesByJob(String skill) {
        List<Skill> getSkill = skillRepo.findAll();
        List<SkillDTO> skillDTOList = new ArrayList<>();
        for (Skill a : getSkill) {
            if (skill.equals(a.getSkillName())) {
                SkillDTO skillDTO = new SkillDTO(
                        a.getSkillId(),
                        a.getSkillName(),
                        a.getProficiencyLevel(),
                        a.getEmployee()
                );
                skillDTOList.add(skillDTO);
            }

        }
        return skillDTOList;
    }
}


