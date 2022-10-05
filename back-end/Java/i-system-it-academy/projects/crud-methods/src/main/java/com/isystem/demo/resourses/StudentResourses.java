package com.isystem.demo.resourses;
import com.isystem.demo.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/student")

public class StudentResourses {
    @GetMapping("/students")
    public ResponseEntity getAll(){
        Student student = new Student(1, "Abdulazizxon", "Karimbayev", "3-kurs");
        Student student1 = new Student(2, "Axrorbek", "Abduxamidov", "3-kurs");
        Student student2 = new Student(3, "Asadbek", "Baxriddinov", "3-kurs");

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        return ResponseEntity.ok(students);
    }
    @GetMapping("/getOne/{id}")
    public ResponseEntity getOne(@PathVariable Integer id){
        Student student2 = new Student(id, "Asadbek", "Baxriddinov", "3-kurs");
        return ResponseEntity.ok(student2);
    }
    @PostMapping("/newStudent")
    public ResponseEntity newStudent(@RequestBody Student requestStudent){
        return ResponseEntity.ok(requestStudent);
    }
    @PutMapping("/updateStudent/{id}")
    public ResponseEntity updateStudent(@PathVariable Integer id,
                                        @RequestBody Student requestStudent
    ){
        Student student2 = new Student(3, "Asadbek", "Baxriddinov", "3-kurs");
        student2.setId(id);
        student2.setName(requestStudent.getName());
        student2.setLastName(requestStudent.getLastName());
        student2.setCourse(requestStudent.getCourse());
        return ResponseEntity.ok(student2);
    }
    @DeleteMapping("/deleteStudent")
    public ResponseEntity deleteStudent(@RequestParam("id") Integer id){
        return ResponseEntity.ok("Student was deleted!");
    }
}
