package main;

public class Calculator {

    public double sum(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }

    public double div(double dividendo, double divisor) {
        return dividendo / divisor;
    }
}
