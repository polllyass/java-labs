package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Psychologist> psychologists = new ArrayList<>();

        psychologists.add(new Psychologist(1, "Анна", "клинический", 3,
                List.of(5, 5, 5)));
        psychologists.add(new Psychologist(2, "Борис", "семейный", 4,
                List.of(4, 5, 5, 4)));
        psychologists.add(new Psychologist(3, "Виктор", "детский", 2,
                List.of(2, 3, 1)));
        psychologists.add(new Psychologist(4, "Галина", "клинический", 5,
                List.of(5, 5, 5)));
        psychologists.add(new Psychologist(5, "Дмитрий", "семейный", 3,
                List.of(3, 3, 4)));

        System.out.println("средний рейтинг > 3");
        for (Psychologist p : psychologists) {
            if (p.getAverageRating() > 3) {
                System.out.printf("%s — %.2f%n", p.getName(), p.getAverageRating());
            }
        }

        System.out.println("\nповышение рейтинга:");
        for (Psychologist p : psychologists) {
            if (p.getAverageRating() >= 4 && p.getRating() < 5) {
                p.setRating(p.getRating() + 1);
                System.out.println(p.getName() + " — новый рейтинг: " + p.getRating());
            }
        }

        printPsychologists(psychologists, 6);

        psychologists.sort(
                Comparator.comparingDouble(Psychologist::getAverageRating)
                        .thenComparing(Psychologist::getName).reversed()
        );

        System.out.println("\nсортировка:");
        for (Psychologist p : psychologists) {
            System.out.println(p);
        }
    }

    public static void printPsychologists(List<Psychologist> psychologists, int rating) {
        System.out.println("\nпсихологи с рейтингом " + rating);
        for (Psychologist p : psychologists) {
            if (p.getRating() == rating) {
                System.out.println(p.getName());
            }
        }
    }
}