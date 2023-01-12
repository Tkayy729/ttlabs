package openAndClosed.Calculator;

public class Demo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        CalculatorOperation add = new Addition(5, 8);
        CalculatorOperation mul = new Multiplication(5, 8);
        Division div = new Division(0, 8);
        calc.calculate(add);
        calc.calculate(mul);
        calc.calculate(div);

    }
}
