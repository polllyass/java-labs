package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String fileName = "f.txt";
        Scanner sc = new Scanner(System.in);

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(fileName))) {
            System.out.println("введите 10 целых чисел:");
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + ": ");
                int num = sc.nextInt();
                writer.write(String.valueOf(num));
                writer.newLine();
            }
            System.out.println("записано в файл " + fileName);
        } catch (IOException e) {
            System.out.println("ошибка записи: " + e.getMessage());
            return;
        }

        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(
                new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                numbers.add(Integer.parseInt(line.trim()));
            }
        } catch (IOException e) {
            System.out.println("ошибка чтения: " + e.getMessage());
            return;
        }

        System.out.println("\nчисла из файла:");
        int count = 0;
        for (int n : numbers) {
            System.out.print(n + " ");
            if (n % 10 == 0 && n % 5 != 0) {
                count++;
            }
        }
        System.out.println("\nкратные 10 и не кратные 5: " + count);

        sc.close();
    }
}