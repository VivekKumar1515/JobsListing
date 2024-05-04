package org.example.jobslisting.repository;

import org.example.jobslisting.model.Post;

import java.util.List;


public interface SearchRepository {
    public List<Post> findByText(String text);
}

