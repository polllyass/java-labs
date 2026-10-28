package org.example;

import java.io.*;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String fileName = "f5.txt";
        Scanner sc = new Scanner(System.in);

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(fileName))) {
            System.out.println("введите 10 целых чисел:");
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + ": ");
                int n = sc.nextInt();
                writer.write(String.valueOf(n));
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("ошибка записи: " + e.getMessage());
            return;
        }

        int count = 0;
        try (BufferedReader reader = new BufferedReader(
                new FileReader(fileName))) {
            String line;
            System.out.println("\nчисла из файла:");
            while ((line = reader.readLine()) != null) {
                int n = Integer.parseInt(line.trim());
                System.out.print(n + " ");
                if (n > 80) {
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println("ошибка чтения: " + e.getMessage());
            return;
        }

        System.out.println("\nчисел больше 80: " + count);

        sc.close();
    }
}