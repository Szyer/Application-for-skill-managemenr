package com.assessment.employee.Service;

import com.assessment.employee.DTO.SkillDTO;
import com.assessment.employee.DTO.WorkingDaysDTO;
import com.assessment.employee.DTO.WorkingDaysSaveDTO;
import com.assessment.employee.Entities.Employee;
import com.assessment.employee.Entities.Skill;
import com.assessment.employee.Entities.WorkingDays;
import com.assessment.employee.Repositories.EmployeeRepo;
import com.assessment.employee.Repositories.WorkingDaysRepo;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class WorkingDaysServiceIMPL implements WorkingDaysService{
    @Autowired
    private WorkingDaysRepo workingDaysRepo;

    @Autowired
    private EmployeeRepo employeeRepo;


    @Override
    public int saveWorkingDays(WorkingDaysDTO workingDaysDTO) {
        Optional<Employee> employee = employeeRepo.findById(workingDaysDTO.getEmployee());
        WorkingDays workingDays = new WorkingDays(
                workingDaysDTO.getTotalWorkingDays(),
                employee.get()
        );
        workingDaysRepo.save(workingDays);
        return workingDays.getTotalWorkingDays();
    }


    public List<WorkingDaysDTO> getAllWorkingdays() {
        List<WorkingDays> getWorkingDays = workingDaysRepo.findAll();
        List<WorkingDaysDTO> workingDaysDTOList = new ArrayList<>();
        for (WorkingDays a : getWorkingDays) {
            WorkingDaysDTO workingDaysDTO = new WorkingDaysDTO(
                    a.getWorkingDaysId(),
                    a.getTotalWorkingDays(),
                    a.getEmployee()
            );
            workingDaysDTOList.add(workingDaysDTO);
        }
        return workingDaysDTOList;
    }
}
