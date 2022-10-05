package com.isystem.demo.taskWeb;
import com.isystem.demo.models.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task")
public class WebTaskResource {
    @Autowired
    private WebTaskService taskService;

    // |-to do Create Method resource -|
    @PostMapping
    public ResponseEntity<?> newTask(@RequestBody Task requestTask){
        taskService.save(requestTask);
        return new ResponseEntity<>("Ok, a new Task made!", HttpStatus.OK);
    }

    // |- to do Read Method resource -|
    @GetMapping
    public ResponseEntity<?> getById(@RequestParam("id") Long id){
        List<Task> task = taskService.findById(id);
        return new ResponseEntity<>(task, HttpStatus.OK);
    }

    // |- to do Update Method resource -|
    @PutMapping
    public ResponseEntity<?> updateTask(@RequestBody Task requestTask){
        taskService.update(requestTask);
        return new ResponseEntity<>("Ok, Task updated!", HttpStatus.OK);
    }

    // |- to do Delete Method resource -|
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Long id){
        taskService.delete(id);
        return new ResponseEntity<>("Ok, Student deleted.", HttpStatus.OK);
    }
}
