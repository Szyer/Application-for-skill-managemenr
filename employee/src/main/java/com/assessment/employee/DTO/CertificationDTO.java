package com.assessment.employee.DTO;

import com.assessment.employee.Entities.Employee;

public class CertificationDTO {
    private Long certificationId;

    private String certificationName;

    private Long employee;

    public CertificationDTO(){}
    public CertificationDTO(Long certificationId, String certificationName, Employee employee) {
        this.certificationId = certificationId;
        this.certificationName = certificationName;
        this.employee = employee.getEmployee_id();
    }

    public Long getCertificationId() {
        return certificationId;
    }

    public void setCertificationId(Long certificationId) {
        this.certificationId = certificationId;
    }

    public String getCertificationName() {
        return certificationName;
    }

    public void setCertificationName(String certificationName) {
        this.certificationName = certificationName;
    }

    public Long getEmployee() {
        return employee;
    }

    public void setEmployee(Long employee) {
        this.employee = employee;
    }


}
