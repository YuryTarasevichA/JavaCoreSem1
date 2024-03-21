package org.example.home1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Основной класс программы реализующий логику записи заметки в файл
 *
 */
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите заметку: ");
        String noteText = scanner.nextLine();
        Note note = new Note(noteText);
        System.out.println("Укажите путь к файлу, чтобы программа записывала туда заметки");

//        System.out.println("Ошибка не указан путь к файлу!");
//        System.out.println("Укажи уже путь к файлу, чтобы программа записывала туда заметки:");

        String filePath = scanner.nextLine();

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(note.getTimestamp() + "->" + note.getText());
            System.out.println("Заметка успешно записана в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи заметки в файл: " + e.getMessage());
        }
    }
}
