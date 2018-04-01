package Study.DescendingOrder;

import java.util.Arrays;

public class DescendingOrder {

    private static int sortDesc(final int num) {

        int number = num;
        String[] digitsOfNumber = new String[String.valueOf(num).length()];

        for (int i = 0; i < digitsOfNumber.length; i++) {
            int temp = number % 10;
            number = number / 10;
            digitsOfNumber[i] = String.valueOf(temp);
        }

        Arrays.sort(digitsOfNumber);

        String result = "";

        for (String i: digitsOfNumber) {
            result = i + result;
        }

        return Integer.parseInt(result);

    }

    public static void main(String[] args) {

        System.out.println(sortDesc(135246879));

    }
}
