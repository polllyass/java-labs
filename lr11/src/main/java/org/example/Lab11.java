package org.example;

public class Lab11 {
    public static void main(String[] args) {
        Athlete forward = new Forward("Леонид", "Динамо", 10);
        Athlete goalkeeper = new Goalkeeper("Алина", "Динамо", 1);
        Athlete simple = new Athlete("Евгений", "Динамо", 5);

        forward.train();
        forward.train(2);
        forward.train("бег");

        Athlete[] athletes = {
                new Forward("Александр", "Динамо", 9),
                new Goalkeeper("Сергей", "Динамо", 1),
                new Forward("Дмитрий", "Динамо", 7)
        };
        for (Athlete a : athletes) {
            System.out.println(a.getName() + " — " + a.getPosition());
        }
    }
}