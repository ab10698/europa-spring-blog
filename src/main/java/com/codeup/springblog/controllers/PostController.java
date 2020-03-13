package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String getPosts(@PathVariable int id){
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String getPost(@PathVariable int id){
        return "View and individual post, id="+id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String getCreatePostForm(){
        return "View the form for creating a post";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "Create a new post";
    }
}
