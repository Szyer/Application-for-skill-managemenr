package com.assessment.employee.Service;

import com.assessment.employee.DTO.CertificationDTO;
import com.assessment.employee.DTO.CertificationSaveDTO;

import java.util.List;

public interface CertificateService {
    String saveCertification(CertificationSaveDTO certificateSaveDTO);

    List<CertificationDTO> getAllCertifications();

}
