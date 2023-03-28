package com.assessment.employee.Repositories;

import com.assessment.employee.Entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@EnableJpaRepositories
@Repository

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
Employee findById(long id);



}
