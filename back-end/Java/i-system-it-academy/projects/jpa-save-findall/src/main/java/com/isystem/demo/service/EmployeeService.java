package com.isystem.demo.service;

import com.isystem.demo.model.Employee;
import com.isystem.demo.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record EmployeeService(EmployeeRepository employeeRepository) {

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee findById(Long id) {
        return employeeRepository.findById(id).get();
    }

    public List<Employee> findByName(String name) {
        return employeeRepository.findByNameQueryNative(name);
    }

    public List<Employee> findByNameParam(String name) {
        return employeeRepository.findAllByNameLike(name);
    }
}
