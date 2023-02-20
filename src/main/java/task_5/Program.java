package task_5;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя ");
        String inputName = scanner.nextLine();

        System.out.println("Введите текущий час: ");
        int inputTime = scanner.nextInt();

        if (inputTime > 24) {
            System.out.println("Введено неправильное время");
        } else if ((inputTime >= 0 && inputTime < 6) || (inputTime >= 22 && inputTime <= 24)) {
            System.out.println("Доброй ночи, " + inputName);
        } else if (inputTime >= 6 && inputTime < 11) {
            System.out.println("Доброе утро, " + inputName);
        } else if (inputTime >= 11 && inputTime < 17) {
            System.out.println("Добрый день, " + inputName);
        } else if (inputTime >= 17 && inputTime < 22) {
            System.out.println("Добрый вечер, " + inputName);
        } else {
            System.out.println("Не удалось определить время суток");
        }
    }
}