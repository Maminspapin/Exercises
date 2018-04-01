package Study.Equalizer;

public class Equalizer {

    private static boolean isArraysEquals(int[] a, int[] b) {

        if (a == b) return true;

        else if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == b[i]);
                else return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] one = {1, 2, 3};
        int[] two = {1, 2, 3};
        int[] three = one;
        int[] four = {1, 2, 3, 4};
        int[] five = {1, 2, 4};

        System.out.println(isArraysEquals(one,one));
        System.out.println(isArraysEquals(one,two));
        System.out.println(isArraysEquals(one,three));
        System.out.println(isArraysEquals(one,four));
        System.out.println(isArraysEquals(one,five));
    }
}
