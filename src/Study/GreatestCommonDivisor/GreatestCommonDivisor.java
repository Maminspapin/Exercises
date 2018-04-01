package Study.GreatestCommonDivisor;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static int findGreatestCommonDiviser() {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число...");
        int a = in.nextInt();
        System.out.println("Введите второе число...");
        int b = in.nextInt();

        while (a != 0 && b != 0) {
            if (a > b) a %= b;
            else b %= a;
            System.err.println("Вычисляем... a = " + a + ", b = " + b);
        }
        if (a == 0) return b;
        else return a;
    }

    public static void main(String[] args) {

        System.out.println("Наибольший общий делитель: " + findGreatestCommonDiviser());

    }
}
