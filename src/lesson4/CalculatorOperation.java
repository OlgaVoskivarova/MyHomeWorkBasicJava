package lesson4;

public class CalculatorOperation {
    public static void main(String[] args) {
    NewCalculator calc1 = new NewCalculator();

        double result = calc1.add(45.15, 15 );
        System.out.println("a + b =" + result);


        double result2 = calc1.mult(5.5, 6);
        System.out.println("a * b =" + result2);

        double result3 = calc1.div(60.8, 2.5);
        System.out.println("a / b = " + result3);

        double result4 = calc1.sub(842.1, 1020.4);
        System.out.println("a - b = " + result4);
    }
}
