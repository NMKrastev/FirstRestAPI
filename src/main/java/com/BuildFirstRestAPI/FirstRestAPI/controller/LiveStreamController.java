package com.BuildFirstRestAPI.FirstRestAPI.controller;

import com.BuildFirstRestAPI.FirstRestAPI.model.LiveStream;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/streams")
public class LiveStreamController {

    //http://localhost:8090/streams
    @GetMapping
    public List<LiveStream> findAll() {
        return null;
    }
}