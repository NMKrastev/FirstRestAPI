package com.BuildFirstRestAPI.FirstRestAPI.controller;

import com.BuildFirstRestAPI.FirstRestAPI.model.LiveStream;
import com.BuildFirstRestAPI.FirstRestAPI.repository.LiveStreamRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/streams")
public class LiveStreamController {

    private final LiveStreamRepository repository;

    public LiveStreamController(LiveStreamRepository repository) {
        this.repository = repository;
    }

    // GET http://localhost:8090/streams
    @GetMapping
    public List<LiveStream> findAll() {
        return repository.findAll();
    }
}