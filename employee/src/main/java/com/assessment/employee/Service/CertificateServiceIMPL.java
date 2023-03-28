package com.assessment.employee.Service;

import com.assessment.employee.DTO.CertificationDTO;
import com.assessment.employee.DTO.CertificationSaveDTO;
import com.assessment.employee.Entities.Certification;
import com.assessment.employee.Entities.Employee;
import com.assessment.employee.Repositories.CertificateRepo;
import com.assessment.employee.Repositories.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CertificateServiceIMPL implements CertificateService {

    @Autowired
    private CertificateRepo certificateRepo;

    @Autowired
    private EmployeeRepo employeeRepo;




    @Override
    public String saveCertification(CertificationSaveDTO certificateSaveDTO) {
        Optional<Employee> employee = employeeRepo.findById(certificateSaveDTO.getEmployee().getEmployee_id());
        Certification certification = new Certification(
                certificateSaveDTO.getCertificationName(),
                employee.get()
        );
        certificateRepo.save(certification);
        return certification.getCertificationName();
    }

    @Override
    public List<CertificationDTO> getAllCertifications() {
        List<Certification> getcertificate = certificateRepo.findAll();
        List<CertificationDTO> certificationDTOList = new ArrayList<>();
        for (Certification a : getcertificate) {
            CertificationDTO certificationDTO = new CertificationDTO(
                 a.getCertificationId(),
                    a.getCertificationName(),
                    a.getEmployee()

            );
            certificationDTOList.add(certificationDTO);
        }
        return certificationDTOList;
    }
}
