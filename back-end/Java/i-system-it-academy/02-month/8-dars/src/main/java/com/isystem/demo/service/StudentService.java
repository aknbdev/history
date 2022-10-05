package com.isystem.demo.service;

import com.isystem.demo.model.Application;
import com.isystem.demo.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class StudentService {
    private List<Student> studentList;
    private static Integer index;
    public StudentService(){
        this.studentList = new ArrayList<>();
        index = 1;
    }

    public ResponseEntity<?> newStudent(Student requestStudent){
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

    public ResponseEntity<?> getAll(){
        if(studentList.isEmpty()){
            return new ResponseEntity<>("There is no Student in the list", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }

    public ResponseEntity<?> getOne(Integer id){
        for(Student student:studentList){
            if(student.getId().equals(id)){
                return new ResponseEntity<>(student, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("There is no Student with this id.", HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<?> getByEmail(String email) {
        for (Student student : studentList) {
            if(student.getEmail().equals(email)){
                return new ResponseEntity<>(student, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("There is no student with this E-mail!", HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<?> getByMajor(String major) {
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

    public ResponseEntity<?> getByLevel(Integer level) {
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
