package Study.Shifrator;

public class Shifrator {

    private static String encrypt(final String text, final int n) {

        int l = n;

        if (text == null) return null;
        else if (text.length() == 0 || n <= 0) return text;
        else {
            StringBuilder firstPartEncryptedText = new StringBuilder();
            StringBuilder secondPartEncryptedText = new StringBuilder();
            StringBuilder encryptedText = new StringBuilder();
            String result;

            for (int i = 1; i <= text.length(); i++) {
                if (i % 2 == 0)
                    firstPartEncryptedText.append(text.substring(i-1,i));
                else
                    secondPartEncryptedText.append(text.substring(i-1,i));
            }

            encryptedText.append(firstPartEncryptedText).append(secondPartEncryptedText);
            result = encryptedText.toString();

            if (l != 1) return encrypt(result, --l);

            return result;
        }
    }

    private static String decrypt(final String encryptedText, final int n) {

        int l = n;

        if (encryptedText == null) return null;
        else if (encryptedText.length() == 0 || n <= 0) return encryptedText;
        else {
            char[] letters = new char[encryptedText.length()];

            int k = -1;
            for (int i = 0; i < encryptedText.length(); i++) {
                if (i == encryptedText.length() / 2) k = -2;
                letters[k + 2] = encryptedText.charAt(i);
                k = k + 2;
            }

            String decryptedText = new String(letters);

            if (l != 1) return decrypt(decryptedText, --l);

            return decryptedText;
        }
    }

    public static void main(String[] args) {

        String eText = "Соня";

        System.out.println(encrypt(eText,-1) + " <--- text = " + eText + " n = -1");
        System.out.println(encrypt(eText,0) + " <--- text = " + eText + " n = 0");
        System.out.println(encrypt(eText,1) + " <--- text = " + eText + " n = 1");
        System.out.println(encrypt(eText,2) + " <--- text = " + eText + " n = 2");
        System.out.println(encrypt(eText,3) + " <--- text = " + eText + " n = 3");
        System.out.println(encrypt(eText,4) + " <--- text = " + eText + " n = 4");
        System.out.println(encrypt(eText,5) + " <--- text = " + eText + " n = 5");
        System.out.println(encrypt(null,6) + " <--- text = null" + " n = 6");
        System.out.println(encrypt(null,-3) + " <--- text = null" + " n = -3");
        System.out.println(encrypt("",7) + " <--- text = " + " n = 7");
        System.out.println(encrypt("",-3) + " <--- text = " + " n = -3");
        System.out.println(encrypt("Зашифрованный длинный текст для проверки", 2));

        String dText = "ивылые  вишонднттяокарн н слррЗфайийкдпе";
        System.out.println(decrypt(dText,2));
    }
}
