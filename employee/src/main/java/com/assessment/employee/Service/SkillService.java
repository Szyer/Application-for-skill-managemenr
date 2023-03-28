package com.assessment.employee.Service;


import com.assessment.employee.DTO.SkillDTO;
import com.assessment.employee.DTO.SkillSaveDTO;

import java.util.List;


public interface SkillService {
    String saveSkill(SkillSaveDTO skillSaveDTO);

    List<SkillDTO> getAllSkills();

    List<SkillDTO> getEmployeesByJob(String skill);
}
