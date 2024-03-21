package org.example.home1;

import java.io.FileWriter;
import java.io.IOException;

public class NoteWriter {
    public void writeToFile(Note note, String filePath) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(note.getTimestamp() + " -> " + note.getText() + "\n");
            System.out.println("Заметка успешно добавлена в файл");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
