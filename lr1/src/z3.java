import java.util.Scanner;
public class z3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int num = scanner.nextInt();

        if (num == 0) {
            System.out.println("Двоичное представление: 0");
        } else {
            String binary = "";
            int temp = num;

            while (temp > 0) {
                int remainder = temp % 2;
                binary = remainder + binary;
                temp = temp / 2;
            }

            System.out.println("Двоичное представление числа " + num + ": " + binary);
        }

        scanner.close();
    }
}