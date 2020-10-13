package com.example.employee.service;

import com.example.employee.dto.Employee;
import com.example.employee.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public boolean addEmployee(Employee emp){
        Employee employee = employeeRepo.save(emp);
        if(null != employee){
            return true;
        }
        return false;
    }

    public List<Employee> getAllEmployeeList(){
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee empForUpdation){
        Optional<Employee> emp = employeeRepo.findById(empForUpdation.getEmployeeId());
        if(null != emp && emp.isPresent()){
            Employee employee = emp.get();
            employee.setEmployeeName(empForUpdation.getEmployeeName());
            employee.setEmployeeDepartment(empForUpdation.getEmployeeDepartment());
            employee.setEmployeeAge(empForUpdation.getEmployeeAge());

            return employeeRepo.save(employee);
        }
        return employeeRepo.save(empForUpdation);
    }
}
