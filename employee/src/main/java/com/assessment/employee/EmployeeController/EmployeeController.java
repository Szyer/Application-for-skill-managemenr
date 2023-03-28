package com.assessment.employee.EmployeeController;


import com.assessment.employee.DTO.EmployeeDTO;
import com.assessment.employee.DTO.EmployeeSaveDTO;

import com.assessment.employee.Entities.Employee;
import com.assessment.employee.Entities.Skill;
import com.assessment.employee.Repositories.EmployeeRepo;
import com.assessment.employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
@SpringBootApplication
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeRepo employeeDataRepo;
    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody EmployeeSaveDTO employeeSaveDTO) {
        String id = employeeService.saveEmployee(employeeSaveDTO);
        return id;
    }

    @GetMapping(path = "/getAllEmployees")
    public List<EmployeeDTO> getAllEmployees() {
        List<EmployeeDTO> allEmployees = employeeService.getAllEmployees();
        return allEmployees;
    }

    @GetMapping(path = "/getEmployeesByJob/{job}")
    public List<EmployeeDTO> getAllEmployees(@PathVariable(name = "job") String job) {
        List<EmployeeDTO> allEmployees = employeeService.getEmployeesByJob(job);
        return allEmployees;
    }


}
