package myHomeWork;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double dollar;
        double euro;

        euro = scanner.nextFloat();
        System.out.println("Enter the amount of funds" + euro);

        dollar = euro * 1.08;

        System.out.println("To playoff " + dollar);
    }
}
