package calculator;

public class Calculator {
    public static void main(String[] args) {
        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Multiplication mul = new Multiplication();

        System.out.println("CALCULATOR MODE: SUBTRACTION");
        System.out.println("Subtraction: " + sub.subtract(10, 5));
        System.out.println("Multiplication: " + mul.multiply(10, 5));
    }
}
