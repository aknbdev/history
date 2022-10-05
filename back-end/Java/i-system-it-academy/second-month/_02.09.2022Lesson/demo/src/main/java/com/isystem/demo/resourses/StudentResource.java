package com.isystem.demo.resourses;

import com.isystem.demo.models.Student;
import com.isystem.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentResource {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<?> newStudent(@RequestBody Student student){
        studentService.newStudent(student);
        return new ResponseEntity<>("Ok added", HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        List<Student> studentList = studentService.getAll();
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestParam("id") Long id, @RequestBody Student student){
        student.setId(id);
        studentService.update(student);
        return new ResponseEntity<>("Ok...", HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> delete(@RequestParam("id") Long id){
        Boolean result = studentService.delete(id);
        if(!result){
            return new ResponseEntity<>("error", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Ok.", HttpStatus.OK);
    }
}
