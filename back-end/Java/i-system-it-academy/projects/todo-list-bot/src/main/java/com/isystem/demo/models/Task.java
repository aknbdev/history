package com.isystem.demo.models;
import com.isystem.demo.enums.TodoItemType;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Generated
@Entity
@Table(name = "task")
public class Task implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "task_id") private Long task_id;

    @Column(name = "user_id", nullable = false) private Long user_id;

    @Column(name = "title") private String title;

    @Column(name = "content") private String content;

    @Column(name = "deadline") private LocalDateTime deadline;

    @Column(name = "status") private boolean status;

    @Column(name = "created_date") private Date created_date;

    @Column(name = "updated_date") private Date updated_date;

    @Column(name = "deleted_date") private Date deleted_date;

    @Column(name = "todoItemType") private TodoItemType todoItemType;
}