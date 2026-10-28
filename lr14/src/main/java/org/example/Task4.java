package org.example;

import java.io.*;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String fileName = "temperature.txt";
        Scanner sc = new Scanner(System.in);

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(fileName))) {
            System.out.println("введите 15 значений температуры (°C):");
            for (int i = 1; i <= 15; i++) {
                System.out.print(i + ": ");
                double t = sc.nextDouble();
                writer.write(String.valueOf(t));
                writer.newLine();
            }
            System.out.println("данные записаны в " + fileName);
        } catch (IOException e) {
            System.out.println("ошибка записи: " + e.getMessage());
            return;
        }

        double sum = 0;
        int count = 0;
        try (BufferedReader reader = new BufferedReader(
                new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                double t = Double.parseDouble(line.trim());
                System.out.println("температура: " + t + " °C");
                sum += t;
                count++;
            }
        } catch (IOException e) {
            System.out.println("ошибка чтения: " + e.getMessage());
            return;
        }

        if (count > 0) {
            double avg = sum / count;
            System.out.printf("\nсредняя температура: %.2f °C%n", avg);
        }

        sc.close();
    }
}