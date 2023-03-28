package com.assessment.employee.EmployeeController;

import com.assessment.employee.DTO.CertificationDTO;
import com.assessment.employee.DTO.CertificationSaveDTO;
import com.assessment.employee.DTO.ExperienceDTO;
import com.assessment.employee.Service.CertificateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/certification")
@SpringBootApplication

public class CertificationController {

    @Autowired
    private CertificateService certificateService;

    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody CertificationSaveDTO certificateSaveDTO) {
        String id = certificateService.saveCertification(certificateSaveDTO);
        return id;

    }

    @GetMapping(path="/getAllCertifications")
    public List<CertificationDTO> getAllCertifications(){
        List<CertificationDTO> allcertifications = certificateService.getAllCertifications();
        return allcertifications;
    }
}