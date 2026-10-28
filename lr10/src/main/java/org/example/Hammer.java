package org.example;

public class Hammer implements Useful, Repairable {
    private String name;
    private double weight;
    private boolean broken;

    public Hammer(String name, double weight) {
        this.name = name;
        this.weight = weight;
        this.broken = false;
    }

    @Override
    public void use() {
        System.out.println("забиваю гвозди молотком " + name);
        broken = true;
    }

    @Override
    public String getPurpose() {
        return "забивание гвоздей";
    }

    @Override
    public void repair() {
        broken = false;
        System.out.println("молоток " + name + " отремонтирован");
    }

    @Override
    public boolean isBroken() {
        return broken;
    }
}