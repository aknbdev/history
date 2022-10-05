package com.isystem.demo.tgramBot.bot;
import com.isystem.demo.db.TaskRepository;
import com.isystem.demo.models.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BotTaskService {
    @Autowired
    private TaskRepository taskRepository;

    public void saveTask(Task toDoItem) {
        taskRepository.save(toDoItem);
    }

    public List<Task> findAllByUser_id(Long id) {
        return taskRepository.findAllByUser_id(id);
    }

    public void deleteTask(Long i) {
        Task task = taskRepository.findByTask_id(i);
        task.setStatus(false);
        task.setDeleted_date(new Date());
        taskRepository.save(task);
    }

    public Task findByTask_id(Long task_id) {
        return taskRepository.findByTask_id(task_id);
    }
}