package com.assessment.employee.Service;

import com.assessment.employee.DTO.EmployeeDTO;
import com.assessment.employee.DTO.WorkingDaysDTO;

import java.util.List;

public interface WorkingDaysService {
    int saveWorkingDays(WorkingDaysDTO workingDaysDTO);

   List<WorkingDaysDTO> getAllWorkingdays();
}
