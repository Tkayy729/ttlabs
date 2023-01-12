package openAndClosed.Calculator;

import java.security.InvalidParameterException;
import openAndClosed.Calculator.Addition;
import openAndClosed.Calculator.Subtraction;

public class Calculator {

    public void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Can not perform operation");
        }

//        if (operation instanceof Addition) {
//            Addition addition = (Addition) operation;
//            addition.setResult(addition.getLeft() + addition.getRight());
//        } else if (operation instanceof Subtraction) {
//            Subtraction subtraction = (Subtraction) operation;
//            subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
//        }
        operation.perform();
    }
}
