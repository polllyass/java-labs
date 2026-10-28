package org.example;

public class Lab10 {
    public static void main(String[] args) {
        Useful[] tools = new Useful[5];

        tools[0] = new Hammer("молоток 1", 2.5);
        tools[1] = new Hammer("молоток 2", 3.0);
        tools[2] = new Hammer("молоток 3", 1.5);

        tools[3] = new Screwdriver("отвертка 1", 10);
        tools[4] = new Screwdriver("отвертка 2", 15);

        for (Useful t : tools) {
            t.use();
            System.out.println("назначение: " + t.getPurpose());

            if (t instanceof Repairable) {
                Repairable r = (Repairable) t;
                System.out.println("сломан? " + r.isBroken());
                if (r.isBroken()) {
                    r.repair();
                    System.out.println("после ремонта сломан? " + r.isBroken());
                }
            }
        }
    }
}