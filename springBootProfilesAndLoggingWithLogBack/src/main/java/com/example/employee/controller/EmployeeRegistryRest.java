package com.example.employee.controller;

import com.example.employee.dto.Employee;
import com.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeRegistryRest {

    @Autowired
    private EmployeeService employeeService;

    @PutMapping(path = "/register")
    public boolean register(@RequestBody Employee employee){
        System.out.println(employee);
        employeeService.addEmployee(employee);
        return true;
    }

    @GetMapping(path = "/getEmployees", produces = "application/json")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployeeList();
    }

    @PostMapping(path = "/update")
    public Employee updateEmployeeDetails(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }
  }
