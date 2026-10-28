package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task1 {
    public static void main(String[] args) {
        String fileName = "app_info.txt";

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(fileName))) {
            writer.write("моё любимое приложение: Pinterest");
            writer.newLine();
            writer.write("тип: приложение для поиска идей и вдохновения");
            writer.newLine();
            writer.write("платформы: Android, iOS, Web");
            writer.newLine();
            writer.write("владелец: Pinterest Inc.");
            writer.newLine();
            writer.write("год основания: 2010");
            writer.newLine();
            System.out.println("файл создан и заполнен.");
        } catch (IOException e) {
            System.out.println("ошибка записи: " + e.getMessage());
            return;
        }

        File file = new File(fileName);
        System.out.println("\nданные о файле:");
        System.out.println("имя: " + file.getName());
        System.out.println("путь: " + file.getAbsolutePath());
        System.out.println("размер: " + file.length() + " байт");
        System.out.println("существует: " + file.exists());
        System.out.println("можно читать: " + file.canRead());
        System.out.println("можно писать: " + file.canWrite());

        System.out.println("\nсодержимое файла:");
        try (BufferedReader reader = new BufferedReader(
                new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("ошибка чтения: " + e.getMessage());
        }
    }
}