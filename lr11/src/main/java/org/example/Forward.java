package org.example;

public class Forward extends Athlete {
    public Forward(String name, String team, int number) {
        super(name, team, number);
    }

    @Override
    public String getPosition() {
        return "нападающий";
    }
}