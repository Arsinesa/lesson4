package homework2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello! Давайте посчитаем!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();

        System.out.printf("Сумма a=%d and b=%d %d: \n", a, b, a + b);
        System.out.printf("Вычитание a=%d and b=%d %d: \n", a,b,a-b);
        System.out.printf("Деление a=%d and b=%d %d:\n", a,b,a/b);
        System.out.printf("Умножение a=%d and b=%d %d: \n",a,b,a*b );

    }
}

