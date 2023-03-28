package com.assessment.employee.Service;

import com.assessment.employee.DTO.ExperienceDTO;
import com.assessment.employee.DTO.ExperienceSaveDTO;


import java.util.List;

public interface ExperienceService {
    String saveExperience(ExperienceSaveDTO experienceSaveDTO);

    List<ExperienceDTO> getAllExperiences();
}
