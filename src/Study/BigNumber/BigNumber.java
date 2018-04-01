package Study.BigNumber;

public class BigNumber {

    private String number = "";

    public BigNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    private int getDigitNumber(int idx, String number) {
        if (idx > number.length()) return 0;
        int digit = Integer.parseInt(number.substring(number.length()-idx, number.length()-idx+1));
        return digit;
    }

    public BigNumber plus (BigNumber secondNumber) {

        int firstDigit = -1; // Полученное число первого слагаемого
        int secondDigit = -1; // Полученное число второго слагаемого
        int shift = 0; // Сдвиг: 1 или 0
        int digitSum; // Сумма firstDigit, secondDigit, shift
        int lastDigitSum; // Последняя цифра digitSum
        int idx = 1;
        String result = "";

        while (number.length() >= idx || secondNumber.getNumber().length() >= idx) {

            firstDigit = getDigitNumber(idx, number);
            secondDigit = getDigitNumber(idx, secondNumber.getNumber());

            digitSum = firstDigit + secondDigit + shift;

            lastDigitSum = digitSum%10;
            shift = (digitSum - lastDigitSum)/10;

            result = lastDigitSum + result;

            idx++;
        }

        if (shift == 1) result = ("1" + result);

        return (new BigNumber(result));
    }
}