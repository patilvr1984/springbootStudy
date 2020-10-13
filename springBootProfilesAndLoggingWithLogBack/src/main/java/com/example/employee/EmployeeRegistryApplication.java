package com.example.employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeRegistryApplication implements ApplicationRunner {
    Logger logger = LoggerFactory.getLogger(EmployeeRegistryApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRegistryApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
	    if(logger.isDebugEnabled()) {
            logger.debug("\n\n Application Employee Regisrty Started with Application Runner ......");
        }
	}
}
