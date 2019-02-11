package com.javacourse.lesson3.part1;

/**
 * Consider console output this application produces.
 */
public class Puzzle4 {

    enum IceCreamFlavours {

        VANILLA, CHOCOLATE, FRUIT, CHERRY;
    }

    public static void main(String[] args) {

        //TODO repair method printResult() to print only one suitable output for each case.
        printResult("Some old fellow");
        String String = "String";
        printResult(String);
        String A = "A";
        String C = "C";
        String fun = A = C = "Y";
        printResult(fun);
        printResult(C);
        printResult(A);
        printResult("B");
        //TODO repair method printSomeNumberResult() to print correct output corresponding to the input parameter and make a call here for each case.
        //TODO Avoid NullPointerException keeping printSomeNumberResult(null) call
        printSomeNumberResult(null);
        IceCreamFlavours myFavoruteIceCream = IceCreamFlavours.VANILLA;
        switch (myFavoruteIceCream) {

            case VANILLA:
                System.out.println("Vanilla ice cream is the best one!");
                break;
            default:
                System.out.println("Your favorite ice cream is " + myFavoruteIceCream);
        }
        for (IceCreamFlavours iceCreamFlavour : IceCreamFlavours.values()) {
            System.out.println(iceCreamFlavour.ordinal());
        }
    }

    private static void printResult(String input) {

        switch (input) {
            default:
                System.out.println("Hello, I am the default case!");
            case "A":
            case "B":
                System.out.println("Guess who am I, A or B?");
            case "C":
                System.out.println("Hello, C is CHOCOLATE!");
            case "D":
                System.out.println("Hello, D is DONUT!");
            case "Y":
                System.out.println("Hello, Y is for sure Yksisarvinen!");
            case "String":
                System.out.println("I am just a String, don't bother me!");
        }
    }

    private static void printSomeNumberResult(Integer input) {

        switch (input) {

            case 1:
                System.out.println("I am number one!");
            case 2:
            default: {
                System.out.println("Nothing special, I am just default number!");
                System.out.println("I am number two!");
            }
            case Integer.MAX_VALUE:
                System.out.println("You can't go higher!");
            case 100500:
                System.out.println("This is some magic number!");
        }
    }
}