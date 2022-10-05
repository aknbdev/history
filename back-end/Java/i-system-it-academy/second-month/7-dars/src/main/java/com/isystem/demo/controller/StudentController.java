package com.isystem.demo.controller;
import com.isystem.demo.model.Student;
import org.springframework.http.HttpStatus;
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

    // |- New student -|
    @PostMapping("/newStudent")
    public ResponseEntity<?> responseEntity(@RequestBody Student requestStudent){
        final String regEx = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(requestStudent.getEmail());
        if(matcher.matches()){
            requestStudent.setId(index);
            index++;
            studentList.add(requestStudent);
            return new ResponseEntity<>(requestStudent, HttpStatus.CREATED );
        }
        return new ResponseEntity<>("E-mail is invalid.", HttpStatus.BAD_REQUEST);
    }



    // |- Get all students -|
    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        if(studentList.isEmpty()){
            return new ResponseEntity<>("There is no Student in the list", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }
    @GetMapping("/getOnePath{id}")
    public ResponseEntity<?> getOne(@PathVariable("id")Integer id){
        for(Student student:studentList){
            if(student.getId().equals(id)){
                return new ResponseEntity<>(student, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("There is no Student with this id.", HttpStatus.BAD_REQUEST);
    }

    // |- get by E-mail -|
    @GetMapping("/getByEmail")
    public ResponseEntity<?> getByEmail(@RequestParam("email") String email){
        for (Student student : studentList) {
            if(student.getEmail().equals(email)){
                return new ResponseEntity<>(student, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("There is no student with this E-mail!", HttpStatus.BAD_REQUEST);
    }

    // |- Get by major -|
    @GetMapping("/getByMajor")
    public ResponseEntity<?>getByMajorPath(@RequestParam("major") String major){
        List<Student> students = new ArrayList<>();
        for (Student student : studentList) {
            if(student.getMajor().equals(major)){
                students.add(student);
            }
        }
        if (students.isEmpty()){
            return new ResponseEntity<>("There is no Student with " + major + " major",HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(students,HttpStatus.OK);
    }

    // |- Get by level -|
    @GetMapping("/getByLevelPath/{level}")
    public ResponseEntity<?>getByLevelPath(@PathVariable("level") Integer level){
        List<Student> students = new ArrayList<>();
        for (Student student : studentList) {
            if(student.getLevel().equals(level)){
                students.add(student);
            }
        }
        if(students.isEmpty()){
            return new ResponseEntity<>(level + " - with that level doesn't have any students." , HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(students,HttpStatus.OK);
    }
}
