package com.bascode;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepositry extends JpaRepository<Employee, Integer>{

}
