package com.isystem.demo.web.rest;

import com.isystem.demo.model.Employee;
import com.isystem.demo.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeResource {
    private final EmployeeService employeeService;

    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employees")
    public ResponseEntity<?> create(@RequestBody Employee employee){
        Employee employee1 = employeeService.save(employee);
        return new ResponseEntity<>(employee1, HttpStatus.CREATED);
    }

    @GetMapping("/employees")
    public ResponseEntity<?> findAll(){
        List<Employee> employeeList = employeeService.findAll();
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }

    @GetMapping("/employee/getByName")
    public ResponseEntity<?> getByName(@RequestParam("name") String name){
        List<Employee> employeeList = employeeService.findByName(name);
        if (employeeList.isEmpty()){
            return new ResponseEntity<>("404 not found, Please check and try again!", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }

    @GetMapping("/employee/getByNameParam")
    public ResponseEntity<?> getByNameParam(@RequestParam("name") String name){
        List<Employee> employeeList = employeeService.findByNameParam(name);
        if (employeeList.isEmpty()){
            return new ResponseEntity<>("404 not found, Please check and try again!", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }
}
