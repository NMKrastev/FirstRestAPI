package com.BuildFirstRestAPI.FirstRestAPI.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.util.UUID;
import static junit.framework.TestCase.assertEquals;
import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LiveStreamTest {

    @Test
    void createNewMutableLiveStream() {
        MutableLiveStream stream = new MutableLiveStream();
        stream.setId(UUID.randomUUID().toString());
        stream.setTitle("Building REST APIs with Spring Boot");
        stream.setDescription("""
                Spring Boot is very convenient to use when
                building REST APIs;
                """);
        stream.setUrl("https://github.com/NMKrastev/FirstRestAPI.git");
        stream.setStartDate(LocalDateTime.of(2022, 6, 20, 19, 30));
        stream.setEndDate(LocalDateTime.of(2022, 6, 20, 21, 30));

        assertNotNull(stream);
        assertEquals("Title is incorrect", "Building REST APIs with Spring Boot", stream.getTitle());

    }

    @Test
    void createNewImmutableLiveStream() {
        ImmutableLiveStream stream = new ImmutableLiveStream(
                UUID.randomUUID().toString(),
                "Building REST APIs with Spring Boot",
                """
                        Spring Boot is very convenient to use when
                        building REST APIs;
                     """,
                "https://github.com/NMKrastev/FirstRestAPI.git",
                LocalDateTime.of(2022, 6, 20, 19, 30),
                LocalDateTime.of(2022, 6, 20, 21, 30));

        assertNotNull(stream);
        Assertions.assertEquals("Building REST APIs with Spring Boot", stream.getTitle(), "Title is incorrect");

    }

    @Test
    void createNewRecordLiveStream() {
        LiveStream stream = new LiveStream(
                UUID.randomUUID().toString(),
                "Building REST APIs with Spring Boot",
                """
                        Spring Boot is very convenient to use when
                        building REST APIs;
                     """,
                "https://github.com/NMKrastev/FirstRestAPI.git",
                LocalDateTime.of(2022, 6, 20, 19, 30),
                LocalDateTime.of(2022, 6, 20, 21, 30));

        assertNotNull(stream);
        Assertions.assertEquals("Building REST APIs with Spring Boot", stream.title());
        assertTrue(stream.getClass().isRecord());
        Assertions.assertEquals(6, stream.getClass().getRecordComponents().length);

    }
}