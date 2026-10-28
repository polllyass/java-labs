public class lab6_1 {
    public static void main(String[] args) {
        Phone phone = new Phone("Samsung", "Galaxy S24", 1000.0);
        System.out.println("телефон: " + phone.getBrand() + " " + phone.getModel());
        System.out.println("цена до скидки: " + phone.getPrice());
        phone.applyDiscount(15);
        System.out.println("цена после скидки: " + phone.getPrice());
    }
}
