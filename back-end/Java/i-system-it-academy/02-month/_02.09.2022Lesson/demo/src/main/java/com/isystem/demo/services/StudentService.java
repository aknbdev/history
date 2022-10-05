package com.isystem.demo.services;
import com.isystem.demo.models.Student;
import com.isystem.demo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void newStudent(Student student) {
        studentRepository.save(student);
    }

    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    public void update(Student student) {
        studentRepository.save(student);
    }

    public Boolean delete(Long id) {
        Optional<Student> student = Optional.of(studentRepository.getById(id));
        if (student.isEmpty()){
            return false;
        }
        studentRepository.deleteById(id);
        return true;
    }
}
