package com.employee.empregistrywithexceptionhandling.controller;

import com.employee.empregistrywithexceptionhandling.dto.Employee;
import com.employee.empregistrywithexceptionhandling.exception.EmployeeNotFoundException;
import com.employee.empregistrywithexceptionhandling.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/employee")
public class EmployeeRestController {

    private Logger logger = LoggerFactory.getLogger(EmployeeRestController.class);
    @Autowired
    private EmployeeService empService;


    @GetMapping(path = "/get", produces = "application/json")
    public List<Employee> getEmployeeDetails(){
        return empService.getLsEmployee();
    }

    @GetMapping(path = "/getById/{empId}", produces = "application/json")
    public Employee getEmployeeByEmpId(@PathVariable("empId") long empId)throws EmployeeNotFoundException {
        logger.debug("EmployeeRestController->getEmployeeByEmpId() with empId= "+empId);
        return empService.findEmployeeById(empId);
    }
}
