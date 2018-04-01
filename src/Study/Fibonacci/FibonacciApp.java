package Study.Fibonacci;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciApp {

    public static BigInteger findFibonacci() {

        Scanner in = new Scanner(System.in);

        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger fib = BigInteger.valueOf(0);

        System.out.println("Введите номер числа Фибоначчи...");
        int n = in.nextInt();

        if (n == 1 || n == 2)
            fib = BigInteger.valueOf(1);
        else {
            for (int i = 3; i <= n; i++) {
                fib = a.add(b);
                a = b;
                b = fib;
               // System.err.println("n = " + i + ", fib = " + fib);
            }
        }

        return fib;
    }

    public static int determineLastDigitFibonacci() {

        Scanner in = new Scanner(System.in);

        int lastA = 1;
        int lastB = 1;
        int lastDigFib = 0;

        System.out.println("Введите номер числа Фибоначчи...");
        int n = in.nextInt();

        if (n == 1 || n == 2)
            lastDigFib = 1;
        else {
            for (int i = 3; i <= n; i++) {
                lastDigFib = (lastA + lastB)%10;
                lastA = lastB;
                lastB = lastDigFib;
            }
        }

        return lastDigFib;
    }

    public static void main(String[] args) {

        System.out.println("Число Фибонначи: " + findFibonacci());
        System.out.println("Последняя цифра числа Фибоначчи: " + determineLastDigitFibonacci());
    }
}
