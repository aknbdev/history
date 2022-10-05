package com.isystem.demo.web.rest;

import com.isystem.demo.model.Student;
import com.isystem.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentResource {
    @Autowired

    private StudentService studentService;

    // |- Create a new Student -|
    @PostMapping
    public ResponseEntity<?> newStudent(@RequestBody Student student){
        Student student1 = studentService.save(student);
        return new ResponseEntity<>("A new Student successfully added!", HttpStatus.CREATED);
    }

    // |- Read Student by id -|
    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Long id){
        Student student = studentService.getById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    // |- Update Student information -|
    @PutMapping
    private ResponseEntity<?> updateInfo(@RequestBody Student requestStudent){
        Student student = studentService.updateInfo(requestStudent);
        return new ResponseEntity<>("Ok, Student information is updated.", HttpStatus.OK);
    }

    // |- Delete Student by id -|
    @DeleteMapping("/{id}")
    private ResponseEntity<?> deleteById(@PathVariable("id") Student id){
        Student student = studentService.deleteById(id);
        return new ResponseEntity<>("Ok, Student deleted.", HttpStatus.OK);
    }
}
