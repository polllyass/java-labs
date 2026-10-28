package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        String fFile = "f3.txt";
        String gFile = "g3.txt";
        String hFile = "h3.txt";
        Random rnd = new Random();

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(fFile))) {
            for (int i = 0; i < 20; i++) {
                writer.write(String.valueOf(rnd.nextInt(100)));
                writer.newLine();
            }
            System.out.println("файл " + fFile + " создан (20 случайных чисел)");
        } catch (IOException e) {
            System.out.println("ошибка записи: " + e.getMessage());
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fFile));
             BufferedWriter gWriter = new BufferedWriter(new FileWriter(gFile));
             BufferedWriter hWriter = new BufferedWriter(new FileWriter(hFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                int n = Integer.parseInt(line.trim());
                if (n % 12 == 0 && n % 4 != 0) {
                    gWriter.write(String.valueOf(n));
                    gWriter.newLine();
                } else {
                    hWriter.write(String.valueOf(n));
                    hWriter.newLine();
                }
            }
            System.out.println("числа распределены в " + gFile + " и " + hFile);
        } catch (IOException e) {
            System.out.println("ошибка: " + e.getMessage());
        }

        System.out.println("\nфайл " + gFile + " (кратные 12, не кратные 4):");
        printFile(gFile);
        System.out.println("\nфайл " + hFile + " (остальные):");
        printFile(hFile);
    }

    static void printFile(String name) {
        try (BufferedReader reader = new BufferedReader(new FileReader(name))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.print(line + " ");
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("ошибка чтения: " + e.getMessage());
        }
    }
}