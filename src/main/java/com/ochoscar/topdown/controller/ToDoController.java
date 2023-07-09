package com.ochoscar.topdown.controller;

import com.ochoscar.topdown.model.ToDo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class ToDoController {

    @GetMapping("getAllToDoTask")
    @ResponseStatus(HttpStatus.OK)
    public List<ToDo> getAllToDoTask() {
        List<ToDo> response = new ArrayList<>();
        response.add(ToDo.builder().task("First Task").build());
        response.add(ToDo.builder().task("Second Task").build());
        response.add(ToDo.builder().task("Third Task").build());
        return response;
    }

}
