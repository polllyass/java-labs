package org.example;

public class Screwdriver implements Useful, Repairable {
    private String name;
    private int size;
    private boolean broken;

    public Screwdriver(String name, int size) {
        this.name = name;
        this.size = size;
        this.broken = false;

    }

    @Override
    public void use() {
        System.out.println("закручиваю винты отверткой " + name + " (размер " + size + ")");
        broken = true;
    }

    @Override
    public String getPurpose() {
        return "закручивание винтов";
    }

    @Override
    public void repair() {
        broken = false;
        System.out.println("отвертка " + name + " отремонтирована");
    }

    @Override
    public boolean isBroken() {
        return broken;
    }
}