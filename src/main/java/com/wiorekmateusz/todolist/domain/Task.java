package com.wiorekmateusz.todolist.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Task {
    @GeneratedValue
    @Id
    private int id;

    private String name;
    private String description;

}
