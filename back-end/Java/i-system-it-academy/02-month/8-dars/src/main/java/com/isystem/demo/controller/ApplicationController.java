package com.isystem.demo.controller;
import com.isystem.demo.model.Application;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/application")
public class ApplicationController {
   private List<Application> applicationList;
   private static Integer index;

    public ApplicationController() {
        this.applicationList = new ArrayList<>();
        index = 1;
    }
    @PostMapping
    public ResponseEntity<?> newApplication(@RequestBody Application application){
        application.setId(index);
        index++;
        applicationList.add(application);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(applicationList, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateApplication(
            @PathVariable("id") Integer id,
            @RequestBody Application requestApplication
            ){
        for (Application application : applicationList ) {
            if (application.getId().equals(id)){
                application.setStudentId(requestApplication.getStudentId());
                application.setBookId(requestApplication.getBookId());
                application.setForDays(requestApplication.getForDays());
                return new ResponseEntity<>("Ok Application updated!", HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("Ups.Something went wrong! Please check and try again!", HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteApplication(@PathVariable("id") Integer id){
        for (Application application : applicationList ) {
            if (application.getId().equals(id)){
                applicationList.remove(application);
                return new ResponseEntity<>("Ok.Application successfully deleted!", HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("Ups.Something went wrong! Please check and try again!", HttpStatus.BAD_REQUEST);
    }
}
