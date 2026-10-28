import java.util.Scanner;
public class z2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Число: ");
        int num = sc.nextInt();

        if (num % 3 == 0 || num % 7 == 0)
            System.out.println("Кратно 3 или 7");
        else
            System.out.println("Не кратно 3 или 7");
    }
}