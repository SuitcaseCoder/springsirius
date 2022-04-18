package com.codeup.springsirius;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    
    @RequestMapping(path = "/posts", method = RequestMethod.GET)
    @ResponseBody
    public String postsIndex() {
        return "posts index page";
    }
    
    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getPost(int postId) {
        return "view an individual post";
    }
    
    @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
    @ResponseBody
    public String postForm() {
        return "view the form for creating a post\n";
    }
    
    @RequestMapping(path = "/posts/create\t", method = RequestMethod.POST)
    @ResponseBody
    public String createPost() {
        return "create a new post";
    }
    
}
