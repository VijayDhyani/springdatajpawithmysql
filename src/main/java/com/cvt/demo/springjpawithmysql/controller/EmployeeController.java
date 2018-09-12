package com.cvt.demo.springjpawithmysql.controller;

import com.cvt.demo.springjpawithmysql.model.Employee;
import com.cvt.demo.springjpawithmysql.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(value = "/all")
    public List<Employee> getAll(){
       return employeeRepository.findAll();
    }

    @PostMapping(value = "/add")
    public List<Employee> persist(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return employeeRepository.findAll();
    }

    @PutMapping(value = "/update")
    public String update(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return " Employee with " + employee + " Updated ";
    }

    @DeleteMapping(value = "/delete")
    public String delete(@RequestBody Employee employee){
        employeeRepository.delete(employee);
        return " Employee with " + employee + " Deleted ";
    }


}
