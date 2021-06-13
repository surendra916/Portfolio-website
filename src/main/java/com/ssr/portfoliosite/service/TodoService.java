package com.ssr.portfoliosite.service;



import com.ssr.portfoliosite.model.Todo;
import com.ssr.portfoliosite.utils.JsonFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TodoService {
    @Autowired
    public JsonFeignClient jsonFeignClient;

    public List<Todo> getAllTodos(){
        System.out.println("fetching all todo items");
        return jsonFeignClient.getAllTodos();
    }
    public Todo getSingleTodo(String number){
        System.out.println("fetching todo item {} "+ number);
        return jsonFeignClient.getSingleTodo(number);
    }
    public Todo createTodo(Todo item){
        System.out.println("creating todo item {}"+ item);
        return jsonFeignClient.createTodo(item);
    }
}
