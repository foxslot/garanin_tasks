package task_3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число n");
        int n = scanner.nextInt();

        showNumber(n);

    }

    public static void showNumber(int n){

        System.out.println(n);

        if (n > 1) {
            n -= 1;
            showNumber(n);
        }

    }
}
