package com.employee.empregistrywithexceptionhandling.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class EmployeeExceptionHandler extends ResponseEntityExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(EmployeeExceptionHandler.class);

    @ExceptionHandler(value = EmployeeNotFoundException.class)
    public ResponseEntity<Object> handleEmployeeNotFoundException(EmployeeNotFoundException e){
        logger.debug("EmployeeExceptionHandler->handleEmployeeNotFoundException with exception = "+e.getErrorMessage());
        return new ResponseEntity(e.getErrorCode()+"  :  "+e.getErrorMessage(), HttpStatus.NOT_FOUND);
    }
}
