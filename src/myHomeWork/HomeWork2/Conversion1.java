package myHomeWork.HomeWork2;

public class Conversion1 {
    public static void main(String[] args) {

        //int num1 = Integer.parseInt("333", 16);
        String str = "333";
        int num2 = 819;
        String str2 = "101101";
        //int num3 = Integer.parseInt("101101", 2);
        int num4 = 124;

        //System.out.println(num1);
        System.out.println("Число" + " " + str + " " + "перевести из 16-чной системы в 10-чную систему" + " " + Integer.parseInt(str, 16));
        System.out.println("Число" + " " + num2 + " " +  "перевести из 10-чной системы в 16-чную систему" + " " + Integer.toHexString(num2));

        //System.out.println(num3);
        System.out.println("Число" + " " + str2 + " " + "перевести из 2-чной системы в 10-чную систему" + " " + Integer.parseInt(str2, 2));

        System.out.println("Число" + " " + num4 + " " +  "перевести из 10-чной системы в 2-чную систему" + " " + Integer.toBinaryString(num4));

    }
}
