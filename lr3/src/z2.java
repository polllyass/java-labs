import java.util.Scanner;
public class z2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("введите email: ");
        String email = sc.nextLine();

        int pos = email.indexOf('@');

        if (pos == -1)
        {
            System.out.println("это не email, нет @");
        } else
        {
            String name = email.substring(0, pos);
            System.out.println("имя пользователя: " + name);
        }
        sc.close();
    }
}