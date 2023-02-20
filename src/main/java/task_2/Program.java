package task_2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число n");
        int n = scanner.nextInt();
        System.out.println("Введите число m: ");
        int m = scanner.nextInt();

        System.out.println("Вы ввели " + n + " и " + m);

        int[][] arrInt = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                arrInt[i][j] = (int) (Math.random() * 100);

                if (arrInt[i][j] % 2 == 0) {
                    arrInt[i][j] += 1;
                }

                System.out.print(arrInt[i][j] + " ");

            }
            System.out.println(" ");
        }


    }
}
