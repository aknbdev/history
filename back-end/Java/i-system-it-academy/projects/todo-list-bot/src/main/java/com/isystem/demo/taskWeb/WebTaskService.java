package com.isystem.demo.taskWeb;
import com.isystem.demo.db.TaskRepository;
import com.isystem.demo.models.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WebTaskService {
    @Autowired
    private TaskRepository todoRepository ;

    // |-to do Create Method service -|
    public void save(Task requestTask) {
        requestTask.setStatus(true);
        todoRepository.save(requestTask);
    }

    // |- to do Read Method service -|
    public List<Task> findById(Long id){
        return todoRepository.findAllByUser_id(id);
    }

    // |- to do Update Method service -|
    public void update(Task requestTask) {
        todoRepository.save(requestTask);
    }

    // |- to do Delete Method service -|
    public void delete(Long id){
        Task task = todoRepository.getById(id);
        todoRepository.delete(task);
    }

}
