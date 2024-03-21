package org.example.home1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Note {
    private String text;
    private LocalDateTime timestamp;

    public Note(String text) {
        this.text = text;
        this.timestamp = LocalDateTime.now();
    }

    public String getText() {
        return text;
    }

    public String getTimestamp() {
        return timestamp.format(DateTimeFormatter.ofPattern("dd.MM.yyyy  HH:mm:ss"));
    }
}
