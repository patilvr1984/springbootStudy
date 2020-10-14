package com.employee.empregistrywithexceptionhandling.service;

import com.employee.empregistrywithexceptionhandling.dto.Employee;
import com.employee.empregistrywithexceptionhandling.exception.EmployeeNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service(value = "empService")
public class EmployeeService {
    private Logger logger = LoggerFactory.getLogger(EmployeeService.class);
    private List<Employee> lsEmployee;

    @PostConstruct
    public void setEmployeeList(){
        lsEmployee = new ArrayList<>();
        lsEmployee.add(new Employee((long)123, "Vishal Patil", "TPS", 36));
        lsEmployee.add(new Employee((long)124, "Sumeet Nikalje", "EDC", 32));
        lsEmployee.add(new Employee((long)125, "Nitin Dawange", "EDC", 34));

    }

    public Employee findEmployeeById(long empId)throws EmployeeNotFoundException{
        logger.debug("EmployeeService->findEmployeeById with list of Employee = "+lsEmployee);
        if(null != lsEmployee){
            Employee emp =  lsEmployee.stream().filter(employee -> empId == employee.getEmpId()).findFirst().orElse(null);
            logger.debug("EmployeeService->findEmployeeById found Employee = "+emp);
            if(null == emp){
                logger.debug("EmployeeService->findEmployeeById throws EmployeeNotFoundException.");
                throw new EmployeeNotFoundException("Error_cd_1", "Employee not found!");
            }
        }
        throw new EmployeeNotFoundException("Error_cd_1", "Employee not found!");
    }

    public List<Employee> getLsEmployee() {
        return lsEmployee;
    }
}
