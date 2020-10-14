package com.employee.empregistrywithexceptionhandling.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class EmployeeServiceInterceptorAppConfig extends WebMvcConfigurerAdapter {
    @Autowired
    private EmployeeHandlerInterceptor employeeHandlerInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(employeeHandlerInterceptor);
    }
}
