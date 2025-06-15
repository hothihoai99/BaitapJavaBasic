package Bai2;

public class Calculator {
    int a = 10;
    int b = 80;
    int s = a + b;

    double c = 9.7;
    double d = 7.9;
    double x = c * d;

    public static void main(String[] agrs) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.s);
        System.out.println(calculator.x);
    }
}
