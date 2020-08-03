package com.twu.refactoring;

public class NumberCruncher {
    private final int[] numbers;

    public NumberCruncher(int... numbers) {
        this.numbers = numbers;
    }

    public int countEven() {
        return count((number) -> number % 2 == 0);
    }

    public int countOdd() {
        return count((number -> number % 2 == 1));
    }

    public int countPositive() {
        return count(number -> number >= 0);
    }

    public int countNegative() {
        return count(number -> number < 0);
    }

    private int count(Action action) {
        int count = 0;
        for (int number : numbers) {
            if (action.action(number)) {
                count++;
            }
        }
        return count;
    }

    @FunctionalInterface
    private interface Action{
        boolean action(int number);
    }
}
