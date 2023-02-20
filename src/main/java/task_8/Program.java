package task_8;

import java.io.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите местоположение первого файла: ");
        String inputLocation1= scanner.nextLine();

        System.out.println("Введите местоположение второго файла: ");
        String inputLocation2= scanner.nextLine();

        System.out.println("Вы ввели: " + inputLocation1 + " и " + inputLocation2);

        try (FileInputStream is = new FileInputStream(inputLocation1);
             OutputStream os = new FileOutputStream(inputLocation2)) {

            while (is.available() != 0){
                int data = is.read();
                os.write(data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Не найден файл!");
        } catch (IOException e){
            System.out.println("Ошибка при считывании данных!");
        }








    }
}
