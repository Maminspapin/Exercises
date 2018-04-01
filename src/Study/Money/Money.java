package Study.Money;

public class Money {

    private static int calculateYears(double principal, double interest,  double tax, double desired) {

        int year = 0;

        while (principal < desired) {
            double temp = principal + principal * interest;
            principal = temp - (temp - principal) * tax;
            year++;
            }

        return year;
    }

    public static void main(String[] args) {

        System.out.println(calculateYears(1000.00,0.05,0.18,1100.00));

    }

}
