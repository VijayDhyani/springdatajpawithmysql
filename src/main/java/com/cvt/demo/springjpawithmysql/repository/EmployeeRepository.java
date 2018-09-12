package com.cvt.demo.springjpawithmysql.repository;

import com.cvt.demo.springjpawithmysql.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


   }
