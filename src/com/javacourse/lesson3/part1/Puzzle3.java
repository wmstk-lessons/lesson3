package com.javacourse.lesson3.part1;

/*
Reasonable uses for labels (goto)

1)Cleanly exiting a function:

often in a function, you may allocate resources and need to exit in multiple places. Programmers can simplify their code by putting the resource cleanup code
at the end of the function all all "exit points" of the function would goto the cleanup label. This way, you don't have to write cleanup code at every "exit point" of the function.

2)Exiting nested loops:

If you're in a nested loop and need to break out of all loops, a goto can make this much cleaner and simpler than break statements and if-checks.

3) Low-level performance improvements:

This is only valid in perf-critical code, but goto statements execute very quickly and can give you a boost when moving through a function.
This is a double-edged sword, however, because a compiler typically cannot optimize code that contains gotos. */
public class Puzzle3 {

    public static void main(String[] args) {

        int[] numbers = new int[]{100, 18, 21, 30};
        OUTER:
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("First thing to do in this loop");
            if (i % 2 == 0) {
                System.out.println("Will now continue OUTER");
                continue OUTER;
            }
            INNER:
            for (int j = 0; j < numbers.length; j++) {

                System.out.println("Will now break INNER");
                break INNER;
            }
        }
        someComplicatedLogic();
    }

    private static void someComplicatedLogic() {

        Integer[] intergers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        for (Integer integer : intergers) {
            String[] strings = new String[]{"Is", "using", "goto", "ever", "worthwhile?"};
            for (int i = 0; i < strings.length; i++) {
                Boolean[] booleans = new Boolean[]{false, false, true, false, true};
                for (int j = 0; j < booleans.length; j++) {
                    if (integer.equals(strings[i].length()) && booleans[j]) {
                        System.out.println("BINGO! integer=" + integer + " ; strings[i]=" + strings[i] + " ; booleans[j]=" + booleans[j]);
                        //TODO exit all loops now and proceed further logic..
                    }
                }
            }
        }
        System.out.println("Big job is now finished..");
    }
}