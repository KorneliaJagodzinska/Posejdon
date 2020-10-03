package com.example.module.blog;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Scope("singleton")
public class PostMemoryStorageService {
    //dto data transfer object

    private static final List<PostDto> STORAGE = new ArrayList<>();

    static {
        STORAGE.add(new PostDto("1", "Lorem", "Lorem..."));
        STORAGE.add(new PostDto("2", "Lorem", "Lorem..."));
        STORAGE.add(new PostDto("3", "Lorem", "Lorem..."));
    }

    public Optional<PostDto> getPost(String uuid) {
        return STORAGE.stream()
                .filter(post -> post.getUuid().equalsIgnoreCase(uuid))
                .findFirst();
    }

    public List<PostDto> getPosts() {
        return STORAGE;
    }

    public PostDto create(String title, String text) {
        PostDto post = new PostDto(title, text);
        STORAGE.add(post);
        return post;
    }
}
