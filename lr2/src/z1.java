import java.util.Scanner;
public class z1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("введите размер массива: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("введите " + size + " чисел:");
        for (int i = 0; i < size; i++)
        {
            array[i] = sc.nextInt();
        }
        int firstElement = array[0];
        int lastDigit = Math.abs(firstElement % 10);
        System.out.println("последняя цифра первого элемента (" + firstElement + "): " + lastDigit);
        System.out.println("индексы элементов, где цифра " + lastDigit + " встречается 2 раза:");

        boolean found = false;
        for (int i = 0; i < size; i++)
        {
            int num = Math.abs(array[i]);
            int count = 0;
            int temp = num;
            if (temp == 0 && lastDigit == 0)
            {
                count = 1;
            } else
            {
                while (temp > 0)
                {
                    int digit = temp % 10;
                    if (digit == lastDigit)
                    {
                        count++;
                    }
                    temp /= 10;
                }
            }
            if (count == 2) {
                System.out.println("индекс " + i + " (значение: " + array[i] + ")");
                found = true;
            }
        }
        if (!found) {
            System.out.println("элементов, где цифра " + lastDigit + " встречается 2 раза, не найдено.");
        }
        sc.close();
    }
}