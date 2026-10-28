import java.util.Random;
import java.util.Scanner;

public class z2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите длину строк: ");
        int rows = scanner.nextInt();
        System.out.print("введите длину столбцов: ");
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        System.out.println("введите элементы матрицы " + rows + "x" + cols + ":");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }

        System.out.println("\nваша матрица:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nэлементы, равные сумме своих индексов (i + j):");

        boolean found = false;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int sumIndex = i + j;
                if (matrix[i][j] == sumIndex) {
                    System.out.println("[" + i + "][" + j + "] = " + matrix[i][j] + " (i+j=" + sumIndex + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("таких элементов нет.");
        }

        scanner.close();
    }
}