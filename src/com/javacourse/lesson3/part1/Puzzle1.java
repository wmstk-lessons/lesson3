package com.javacourse.lesson3.part1;

/**
 * Make the program below compile and run fine WITHOUT:
 * changing number of variables and their scope
 * deleting or commenting any line of code
 * argument order and variable names in calculate() calls should remain the same (casts allowed)
 */
public class Puzzle1 {

    private static final int CONSTANT = 10;
    private static int a;
    private int b;

    public static void main(String[] args) {

        short c = 10;
        byte d;
        long l;
        int e;
        calculate(a, b);
        calculate(d, c);
        calculate(d, a);
        calculate(c, b);
        if (CONSTANT == 10) {
            e = 1;
        }
        calculate(e, e);
    }

    private static void calculate(int a, byte b) {

        System.out.println("Calculation result is: " + (a + b));
    }
}