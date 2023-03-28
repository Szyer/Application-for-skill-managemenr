package com.assessment.employee.DTO;

import com.assessment.employee.Entities.Employee;


public class WorkingDaysDTO {
    private Long workingDaysId;

    private int totalWorkingDays;


    private Long employee;

    public WorkingDaysDTO(){}

    public WorkingDaysDTO(Long workingDaysId, int totalWorkingDays, Employee employee) {
        this.workingDaysId = workingDaysId;
        this.totalWorkingDays = totalWorkingDays;
        this.employee = employee.getEmployee_id();
    }

    public Long getWorkingDaysId() {
        return workingDaysId;
    }

    public void setWorkingDaysId(Long workingDaysId) {
        this.workingDaysId = workingDaysId;
    }

    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }

    public void setTotalWorkingDays(int totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
    }

    public Long getEmployee() {
        return employee;
    }

    public void setEmployee(Long employee) {
        this.employee = employee;
    }
}
