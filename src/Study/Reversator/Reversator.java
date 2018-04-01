/*
Переворот строки
*/

package Study.Reversator;

public class Reversator {

    public static String reverse1 (String str) {

        if (str != null) {

            String reversStr = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reversStr += str.charAt(i);
            }
            return reversStr;
        }
        return null;
    }

    public static StringBuilder reverse2 (String str) {

        if (str != null) {

            StringBuilder reversStr = new StringBuilder(str);
            int i = 0;
            int j = str.length()-1;

            while (i < j) {
                char temp = str.charAt(i);
                reversStr.setCharAt(i,str.charAt(j));
                reversStr.setCharAt(j,temp);
                i++;
                j--;
            }
            reversStr.toString();
            return reversStr;
        }
        return null;
    }

    public static void main(String[] args) {

        System.out.println(reverse1("0123456789"));
        System.out.println(reverse2("0123456789"));
    }
}