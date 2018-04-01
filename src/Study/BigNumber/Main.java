package Study.BigNumber;

public class Main {

    public static void main(String[] args) {

        BigNumber sum1 = new BigNumber("1");
        BigNumber sum2 = new BigNumber("9999");
        System.out.println((sum1.plus(sum2).getNumber()));



    }
}
