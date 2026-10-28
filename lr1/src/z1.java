import java.util.Scanner;

public class z1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("задание:");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.print("выбор: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("катет a: ");
                double a = sc.nextDouble();
                System.out.print("катет b: ");
                double b = sc.nextDouble();
                System.out.println("гипотенуза: " + Math.sqrt(a * a + b * b));
                break;

            case 2:
                System.out.print("число: ");
                int num = sc.nextInt();
                if (num % 3 == 0 || num % 7 == 0)
                    System.out.println("кратно 3 или 7");
                else
                    System.out.println("не кратно 3 или 7");
                break;

            case 3:
                System.out.print("введите целое число: ");
                int n = sc.nextInt();

                if (n == 0) {
                    System.out.println("двоичное представление: 0");
                } else {
                    String binary = "";
                    int temp = n;

                    while (temp > 0) {
                        int remainder = temp % 2;
                        binary = remainder + binary;
                        temp = temp / 2;
                    }

                    System.out.println("двоичное представление числа " + n + ": " + binary);
                }
                break;
            default:
                System.out.println("введите 1, 2 или 3.");
        }
        sc.close();
    }
}