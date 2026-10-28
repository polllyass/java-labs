package org.example;

public class Goalkeeper extends Athlete {
    public Goalkeeper(String name, String team, int number) {
        super(name, team, number);
    }

    @Override
    public String getPosition() {
        return "Вратарь";
    }
}