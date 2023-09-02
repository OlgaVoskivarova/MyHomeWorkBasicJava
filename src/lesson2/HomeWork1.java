package lesson2;

public class HomeWork1 {
    public static void main(String[] args) {
        char a = 'G';
        int b = 89;
        byte c = 4;
        short d = 56;
        float e = 4.7333436f;
        double f = 4.355453532;
        long g = 12121;


        System.out.println("Character: "+ a);
        System.out.println("Integer: " + b);
        System.out.println("Byte: " + c);
        System.out.println("Short: " + d);
        System.out.println("Float: " + e);
        System.out.println("Double: " + f);
        System.out.println("Long:" + g);

        int x = 345;

        int num1 = x- 342;
        int num2 =x % 100/10;
        int num3 = x-340;

        System.out.println("Число:" + x +">" + num1 + ","+ num2 + "," + num3);
    }
}
