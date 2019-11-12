package com.wiorekmateusz.todolist.repository;

import com.wiorekmateusz.todolist.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("taskRepository")
public interface TaskRepository extends JpaRepository<Task, Integer> {
}
