package com.todolist.todolist.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.todolist.todolist.entity.Todo;
import com.todolist.todolist.repository.TodoRepository;

@Service
public class TodoService {
    
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo){
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> list(){
       
        return todoRepository.findAll(org.springframework.data.domain.Sort.by("prioridade").descending().and(org.springframework.data.domain.Sort.by("nome").ascending()));

    
    }

    public List<Todo> update(Todo todo){
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return list();
    }
}
