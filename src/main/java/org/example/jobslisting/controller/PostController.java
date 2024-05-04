package org.example.jobslisting.controller;


import org.example.jobslisting.model.Post;
import org.example.jobslisting.repository.PostRepository;
import org.example.jobslisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class PostController {
    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository searchRepo;



    @GetMapping(value = "/posts")
    public List<Post> getAllPosts() {
        return repo.findAll();
    }

    @PostMapping(value = "/post")
    public Post addPost(@RequestBody Post post) {
        return repo.save(post);
    }

    @GetMapping(value = "/post/{name}")
    public List<Post> getPost(@PathVariable String name) {
        return searchRepo.findByText(name);
    }
    }


