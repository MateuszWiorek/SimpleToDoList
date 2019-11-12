package com.wiorekmateusz.todolist.controller;


import com.wiorekmateusz.todolist.domain.Task;
import com.wiorekmateusz.todolist.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class RestController {
    TaskService taskService;

    @GetMapping("/getTasks")
    public List<Task> getTasks(){
        return taskService.showTasks();
    }
    @GetMapping("/hello")
    public String hi(){
        return "Hello";
    }
    @GetMapping("/getTask/{id}")
    public Task getTask(@PathVariable int id){
        return taskService.showTaskById(id);
    }

    @PostMapping("/addTask/")
    public void addTask(@RequestBody Task task){
        taskService.addTask(task);
    }

    @PostMapping("/deleteTask/{id}")
    public void deleteTask(@PathVariable int id){
        taskService.removeTask(id);
    }

    @PostMapping("/deleteTasks/")
    public void deleteTasks(){
        taskService.removeAllTasks();
    }
}
