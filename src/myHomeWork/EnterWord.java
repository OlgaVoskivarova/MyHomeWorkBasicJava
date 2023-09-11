package myHomeWork;

import java.util.Scanner;

public class EnterWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.next();
        String str2 = scanner.next();

        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println(str1.substring(0,3) + str2.substring(3,6));

    }
}
