package controller;

import java.util.List;

import model.Calculate;
import view.printOutput;
import view.readInput;

public class CalculatorController {
    private static final printOutput output = new printOutput();
    private static final readInput input = new readInput();
    private static final Calculate calculate = new Calculate();
    public void run() {
        String read = input.readString();
        int result = 0;
        if (!read.isEmpty()) {
            result=calculate.calculateNum(read);
        }
        output.printResult(result);
    }

}
