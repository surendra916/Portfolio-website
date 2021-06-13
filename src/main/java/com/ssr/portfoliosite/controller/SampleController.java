package com.ssr.portfoliosite.controller;

import com.ssr.portfoliosite.model.LoremImage;
import com.ssr.portfoliosite.model.Todo;
import com.ssr.portfoliosite.service.LoremService;
import com.ssr.portfoliosite.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/api")
public class SampleController {


    private final LoremService loremService;
    private final TodoService todoService;

    public SampleController(LoremService loremService, TodoService todoService) {
        this.loremService = loremService;
        this.todoService = todoService;
    }


    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @RequestMapping("/profile")
    public String showProfile(){
        return "profile";
    }

    @RequestMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/todos")
    public String hello(Model model){

        List<Todo> todos = todoService.getAllTodos();

        model.addAttribute("todos",todos);
        return "sample";
    }

    @GetMapping("/images")
    public String renderAllImages(Model model){
        List<LoremImage> imgs = loremService.getAllImages();
        model.addAttribute("images",imgs);
        return "gallery";
    }

    @GetMapping(value = "/**/{path:[^\\.]*}")
    public String forward() {
        return "redirect:/api/home";
    }
}
