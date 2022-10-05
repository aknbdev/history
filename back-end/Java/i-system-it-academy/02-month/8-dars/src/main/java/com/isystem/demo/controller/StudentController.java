package com.isystem.demo.controller;
import com.isystem.demo.model.Student;
import com.isystem.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired

    private  StudentService studentService;

    private List<Student> studentList;
    private static Integer index;
    public StudentController(){
        this.studentList = new ArrayList<>();
        index = 1;
    }
    @PostMapping("/createStudents")
    public void createStudents(){
        studentList.add(new Student(index++, "Bob", "bob@mail",19, 1, "math"));
        studentList.add(new Student(index++, "George", "george@mail",21, 1, "programming"));
        studentList.add(new Student(index++, "Mike", "mike@mail",18, 1, "sport"));
        studentList.add(new Student(index++, "Emily", "emily@mail",20, 2, "math"));
        studentList.add(new Student(index++, "Emma", "emma@mail",19, 2, "programming"));
        studentList.add(new Student(index++, "Ron", "ron@mail",21, 1, "math"));
        studentList.add(new Student(index++, "Bob", "bob21@mail",18, 2, "history"));
    }

    // |- New student -|
    @PostMapping("/newStudent")
    public ResponseEntity<?> responseEntity(@RequestBody Student requestStudent){
        ResponseEntity<?> Result = studentService.newStudent(requestStudent);
        return Result;
    }

    // |- Get all students -|
    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        ResponseEntity<?> Result = studentService.getAll();
        return Result;
    }

    // |- Get One -|
    @GetMapping("/getOnePath{id}")
    public ResponseEntity<?> getOne(@PathVariable("id")Integer id){
        ResponseEntity<?> Result = studentService.getOne(id);
        return Result;
    }

    // |- get by E-mail -|
    @GetMapping("/getByEmail")
    public ResponseEntity<?> getByEmail(@RequestParam("email") String email){
        ResponseEntity<?> Result = studentService.getByEmail(email);
        return Result;
    }

    // |- Get by major -|
    @GetMapping("/getByMajor")
    public ResponseEntity<?>getByMajorPath(@RequestParam("major") String major){
        ResponseEntity<?> Result = studentService.getByMajor(major);
        return Result;
    }

    // |- Get by level -|
    @GetMapping("/getByLevelPath/{level}")
    public ResponseEntity<?>getByLevelPath(@PathVariable("level") Integer level){
        ResponseEntity<?> Result = studentService.getByLevel(level);
        return Result;
    }
}
