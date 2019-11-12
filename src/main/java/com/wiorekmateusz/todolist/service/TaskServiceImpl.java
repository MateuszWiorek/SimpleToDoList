package com.wiorekmateusz.todolist.service;

import com.wiorekmateusz.todolist.domain.Task;
import com.wiorekmateusz.todolist.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("taskService")
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    TaskRepository taskRepository;

    @Override
    public void addTask(Task task) {
        taskRepository.saveAndFlush(task);
    }

    @Override
    public void removeTask(int id) {
        Optional<Task> t = taskRepository.findById(id);
        if(checkTask(t, id)){
            taskRepository.deleteById(id);
        }

    }
    @Override
    public void removeAllTasks(){
        taskRepository.deleteAll();

    }

    @Override
    public List<Task> showTasks() {
       return taskRepository.findAll();
    }

    @Override
    public Task showTaskById(int id) {
        Task task;
        Optional<Task> t = taskRepository.findById(id);
        if(checkTask(t, id)){
            task = t.get();
            return task;
        }
        return null;
    }

    boolean checkTask(Optional<Task> t, Integer id){
        return id !=null && t.isPresent();
    }
}
