package com.training.springboot.service;


import com.training.springboot.model.Employee;
import com.training.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List getAllEmployees() {
        List employees = new ArrayList();
        employeeRepository.findAll().forEach(employee -> employees.add(employee));
        return employees;
    }
//    public double avgSalary(){
//        double sum=0;
//      for (int i=0;i<5;i++){
//          Employee emp=employeeRepository.findById(i).get();
//          sum= sum+emp.getSalary();
//      }
//      double avg = sum/5;
//      return avg;
//    }
//    public double getSalaryById(int id){
//        Employee emp=employeeRepository.findById(id).get();
//        double sal =emp.getSalary();
//        return sal;
//
//    }
public double avgSalary(){
        double salaryTotal = employeeRepository.findAll().stream().mapToDouble(Employee::getSalary).sum();
        System.out.println(salaryTotal/employeeRepository.count());
        return salaryTotal/employeeRepository.count();
}

    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).get();
    }

    public void saveOrUpdate(Employee employee) {
        employeeRepository.save(employee);
    }

    public void delete(int id) {
        employeeRepository.deleteById(id);
    }
    public Employee updateEmployee(String name, Integer id) {
        Optional<Employee> originalEmployee = employeeRepository.findById(id);
        Employee employee = originalEmployee.get();
        employee.setName(name);
        return employeeRepository.save(employee);
    }
}
