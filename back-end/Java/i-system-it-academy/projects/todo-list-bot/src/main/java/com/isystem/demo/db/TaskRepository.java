package com.isystem.demo.db;

import com.isystem.demo.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    @Query(value = "SELECT * FROM task t WHERE t.user_id = :user_id and t.status = 1", nativeQuery = true)
    List<Task> findAllByUser_id(@Param("user_id") Long user_id);

    @Query(value = "UPDATE task SET status = :status Where id = :id", nativeQuery = true)
    Task softDelete(@Param("status") Boolean status, @Param("id") Long id);

    @Query(value = "SELECT * FROM task t WHERE t.task_id = :task_id", nativeQuery = true)
    Task findByTask_id(@Param("task_id") Long task_id);
}
