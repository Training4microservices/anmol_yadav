package com.training.springboot;

import com.training.springboot.model.Employee;
import com.training.springboot.repository.EmployeeRepository;
//import com.training.springboot.utils.HelperUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

@SpringBootApplication
@EnableMongoRepositories
public class SpringbootDemoApplication {

	private final Logger LOGGER = LoggerFactory.getLogger(getClass());
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}
//	@Autowired
//	private EmployeeRepository employeeRepository;
//
//	@Bean
//	CommandLineRunner runner() {
//		return args -> {
//			List<Employee> employees = employeeRepository.findAll();
//			if (employees.size() == 0) {
//				LOGGER.info("******* Inserting Employees to DB *******");
//				employeeRepository.saveAll(HelperUtil.employeeSupplier.get());
//			} else {
//				LOGGER.info("******* Employees stored in DB Size :: {}", employees.size());
//				LOGGER.info("******* Employees stored in DB :: {}", employees);
//			}
//		};
//	}
}
