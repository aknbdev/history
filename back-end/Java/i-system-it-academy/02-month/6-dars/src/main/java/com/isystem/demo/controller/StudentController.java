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
    @GetMapping("/getByEmail")
    public ResponseEntity getByEmail(@RequestParam("email") String email){
        for (Student student : studentList) {
            if(student.getEmail().equals(email)){
                return ResponseEntity.ok(student);
            }
        }
        return ResponseEntity.ok("There is no student with this E-mail!");
    }
    @GetMapping("/getByLevel")
    public List<Student> getByLevel(
            @RequestParam("level") Integer level
    ){
        List<Student> students = new ArrayList<>();
        for (Student student : studentList) {
            if(student.getLevel().equals(level)){
                students.add(student);
            }
        }
        return students;
    }
    @GetMapping("/getByMajor")
    public List<Student> getByMajor(@RequestParam("major") String major){
        List<Student> students = new ArrayList<>();
        for (Student student : studentList) {
            if(student.getMajor().equals(major)){
                students.add(student);
            }
        }
        return students;
    }
}
