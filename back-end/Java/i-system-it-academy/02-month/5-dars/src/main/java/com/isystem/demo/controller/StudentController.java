package com.isystem.demo.controller;
import com.isystem.demo.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/student")
public class StudentController {
    private List<Student> studentList;
    private static Integer index;
    public StudentController(){
        this.studentList = new ArrayList<>();
        index = 1;
    }
    @PostMapping("/newStudent")
    public ResponseEntity newStudent(@RequestBody Student requestStudent){
        final String regEx = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(requestStudent.getEmail());
        if(matcher.matches()){
            requestStudent.setId(index);
            index++;
            studentList.add(requestStudent);
            return ResponseEntity.ok(requestStudent);
        }
        return ResponseEntity.ok("Ups.Something went wrong!");
    }
    @GetMapping("/getAll")
    public ResponseEntity getAll(){
        return ResponseEntity.ok(studentList);
    }
    @GetMapping("/getOne")
    public ResponseEntity getOne(@RequestParam("id")Integer id){
        for(Student student:studentList){
            if(student.getId().equals(id)){
                return ResponseEntity.ok(student);
            }
        }
        return ResponseEntity.ok("Ups.Something went wrong!");
    }
}
