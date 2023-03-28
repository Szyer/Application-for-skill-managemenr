package com.assessment.employee.Service;

import com.assessment.employee.DTO.ExperienceDTO;
import com.assessment.employee.DTO.ExperienceSaveDTO;
import com.assessment.employee.DTO.SkillDTO;
import com.assessment.employee.DTO.SkillSaveDTO;
import com.assessment.employee.Entities.Employee;
import com.assessment.employee.Entities.Experience;
import com.assessment.employee.Entities.Skill;
import com.assessment.employee.Repositories.EmployeeRepo;
import com.assessment.employee.Repositories.ExperienceRepo;
import com.assessment.employee.Repositories.SkillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ExperienceServiceIMPL implements ExperienceService{
    @Autowired
    private ExperienceRepo experienceRepo;

    @Autowired
    private EmployeeRepo employeeRepo;



    @Override
    public String saveExperience(ExperienceSaveDTO experienceSaveDTO) {
        Optional<Employee> employee = employeeRepo.findById(experienceSaveDTO.getEmployee().getEmployee_id());
        Experience experience = new Experience(
                employee.get(),
                experienceSaveDTO.getJobTitle(),
                experienceSaveDTO.getRating()
                );
        experienceRepo.save(experience);
        return experience.getJobTitle();
    }

    @Override
    public List<ExperienceDTO> getAllExperiences() {
        List<Experience> getExperience = experienceRepo.findAll();
        List<ExperienceDTO> experienceDTOList = new ArrayList<>();
        for (Experience a : getExperience) {
            ExperienceDTO experienceDTO = new ExperienceDTO(
                    a.getExperienceId(),
                    a.getEmployee(),
                    a.getJobTitle(),
                    a.getRating()
                        );
            experienceDTOList.add(experienceDTO);
        }
        return experienceDTOList;
    }
}
