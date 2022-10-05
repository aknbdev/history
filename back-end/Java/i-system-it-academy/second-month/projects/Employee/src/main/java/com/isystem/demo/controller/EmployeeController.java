package com.isystem.demo.controller;
import com.isystem.demo.models.Employee;
import com.isystem.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    // |- create method -|
    @PostMapping("/create")
    public ResponseEntity<?> createEmployee(@RequestBody Employee requestEmployee){
        Boolean result = employeeService.createEmployee(requestEmployee);
        if (!result){
            return ResponseEntity.badRequest().body("Employee with this phone and email is already created.");
        }
        return new ResponseEntity<>("Ok, Employee created.", HttpStatus.CREATED);
    }

    // |- get By Id -|
    @GetMapping("/get/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Long id){
        Employee employee = employeeService.getById(id);
        if (employee == null){
            return ResponseEntity.badRequest().body("There is no Employee with this id.");
        }
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    // |- list of employee -|
    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        List<Employee> employeeList = employeeService.getAll();
        if (employeeList.isEmpty()){
            return new ResponseEntity<>("There is no Employee yet.", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }

    // |- delete employee -|
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Long id){
        Boolean result = employeeService.deleteById(id);
        if (!result){
            return ResponseEntity.badRequest().body("There is no employee with this id.");
        }
        return ResponseEntity.ok("Ok employee deleted.");
    }

    // |- update employee info -|
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateById(@PathVariable("id") Long id, @RequestBody Employee requestEmployee){
        Boolean result = employeeService.updateById(id, requestEmployee);
        if (!result){
            return ResponseEntity.badRequest().body("There is no employee with this id.");
        }
        return ResponseEntity.ok("Ok, Employee info updated!");
    }

    // |- find by email -|
    @GetMapping("/get/email")
    public ResponseEntity<?> getByEmail(@RequestParam("email") String requestEmail){
        Employee result = employeeService.getByEmail(requestEmail);
        if (result == null){
            return ResponseEntity.badRequest().body("There is no employee with this email.");
        }
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    // |- find by job title -|
    @GetMapping("/get/job")
    public ResponseEntity<?> getByJob(@RequestParam("job") String requestJob){
        List<Employee> employeeList = employeeService.getByJob(requestJob);
        if (employeeList == null){
            return ResponseEntity.badRequest().body("There is no employee with this job title.");
        }
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    } 
}
