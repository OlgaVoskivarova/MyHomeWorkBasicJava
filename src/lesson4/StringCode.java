package lesson4;

import java.util.Locale;

public class StringCode {
    public static void main(String[] args) {
        String text = "I study Basic Java";
        System.out.println(text);
        int textLength = text.length();
        System.out.println(textLength);
        System.out.println(text.charAt(textLength-2));
        System.out.println(text.contains("Java"));

        String text2 = text.substring(13,18);
        System.out.println(text2);

        char charOld = 'a';
        char charNew = 'o';
        System.out.println(text.replace(charOld, charNew));
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());


    }
}
