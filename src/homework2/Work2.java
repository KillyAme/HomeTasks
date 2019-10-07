package homework2;

import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {
        System.out.println("Введите 1-е целое число");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            System.out.println("Введите 2-е целое число");
            VvodChisla(scanner, a);
        }
        else {
            System.out.println("Вы ввели не целое число");
        }
    }

    public static void VvodChisla(Scanner scanner, int a) {
        if (scanner.hasNextInt()) {
            int b = scanner.nextInt();
            System.out.println("Сумма чисел равна "+(a+b));
        }
        else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
