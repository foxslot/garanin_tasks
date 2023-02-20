package task_4;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите слово на букву А: ");
            String inputStr = scanner.nextLine();

            if ((inputStr.indexOf("А") == 0) || (inputStr.indexOf("а") == 0)) {
                System.out.println("Спасибо за введенное слово!");
                break;

            }
        }
    }
}