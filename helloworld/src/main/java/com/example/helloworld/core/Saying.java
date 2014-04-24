package com.example.helloworld.core;
import com.fasterxml.jackson.annotation.*;

public class Saying {
    @JsonProperty("hello:id")
    private final long id;
    private final String content;

    public Saying(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

