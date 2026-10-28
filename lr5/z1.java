package org.example.task1;

public class z1
{
    public static void main(String[] args)
    {
        Ticket t = new Ticket("Концерт", 15, 120.0);
        System.out.println("До скидки: " + t.price);
        t.applyDiscount();
        System.out.println("После скидки: " + t.price);
        System.out.println(t);
    }
}
