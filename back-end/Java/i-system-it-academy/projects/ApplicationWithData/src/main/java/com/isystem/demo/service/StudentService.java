package com.isystem.demo.service;

import com.isystem.demo.model.Student;
import com.isystem.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public record StudentService(StudentRepository studentRepository) {

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public Student getById(Long id) {
        return studentRepository.getById(id);
    }

    public Student updateInfo(Student requestStudent) {
        return studentRepository.save(requestStudent);
    }

    public Student deleteById(Student id) {
        studentRepository.delete(id);
        return id;
    }
}
