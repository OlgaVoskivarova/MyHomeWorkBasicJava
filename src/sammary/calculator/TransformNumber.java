package sammary.calculator;

import java.util.Scanner;

public class TransformNumber {
    public static void main(String[] args) {
        //перевод чисел в разные системы счичления
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите первоначальную систему счисления =");
        int inNumber = scanner.nextInt();

        System.out.println("Введите число");
        String inStr= scanner.next(); //в 16ричной системе вводится и число и символы (буквы)
        long inStrNumber = Long.parseLong(inStr, inNumber); //метод преобразования числа из 16ричной системы в число типа скаляр(число обычное)

        System.out.println("В какую систему переводить");
        int outNumbers = scanner.nextInt();
        System.out.println(Long.toString(inStrNumber,outNumbers));
    }
}
