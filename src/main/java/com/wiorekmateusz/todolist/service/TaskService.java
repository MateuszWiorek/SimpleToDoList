package com.wiorekmateusz.todolist.service;

import com.wiorekmateusz.todolist.domain.Task;

import java.util.List;

public interface TaskService {
    void addTask(Task task);
    void removeTask(int id);
    void removeAllTasks();
    List<Task> showTasks();
    Task showTaskById(int id);
}
