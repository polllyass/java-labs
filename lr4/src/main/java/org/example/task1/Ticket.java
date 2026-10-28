package org.example.task1;

public class Ticket {
    String event;
    int seatNumber;
    double price;

    public Ticket(String event, int seatNumber, double price) {
        this.event = event;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    @Override
    public String toString(){
        return event + seatNumber + price;
    }
    public void applyDiscount() {
        price = price * 0.9;
    }
}
