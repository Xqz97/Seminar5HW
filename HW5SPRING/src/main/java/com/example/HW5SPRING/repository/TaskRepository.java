package com.example.HW5SPRING.repository;

import com.example.HW5SPRING.model.Task;
import com.example.HW5SPRING.model.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findAllTasksByStatus(TaskStatus status);
}