package com.BuildFirstRestAPI.FirstRestAPI.repository;

import com.BuildFirstRestAPI.FirstRestAPI.model.LiveStream;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class LiveStreamRepository {

    List<LiveStream> streams = new ArrayList<>();

    public LiveStreamRepository() {
        streams.add(new LiveStream(
                UUID.randomUUID().toString(),
                "Building REST APIs with Spring Boot",
                """
                        Spring Boot is very convenient to use when
                        building REST APIs;
                     """,
                "https://github.com/NMKrastev/FirstRestAPI.git",
                LocalDateTime.of(2022, 6, 20, 19, 30),
                LocalDateTime.of(2022, 6, 20, 21, 30)
        ));
    }

    public List<LiveStream> findAll() {
        return streams;
    }

    public LiveStream findById(String id) {
        return streams.stream().filter(stream -> stream.id().equals(id)).findFirst().orElse(null);
    }

    public LiveStream create(LiveStream stream) {
        streams.add(stream);
        return stream;
    }

    public void update(LiveStream stream, String id) {
        LiveStream existing = streams.stream().filter(s -> s.id().equals(id))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("Stream not found"));
        int i = streams.indexOf(existing);
        streams.set(i, stream);
    }

    public void delete(String id) {
        streams.removeIf(stream -> stream.id().equals(id));
    }
}
