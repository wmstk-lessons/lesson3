package com.javacourse.lesson3.part1;

public class Puzzle5 {

    public static void main(String[] args) {

        //TODO make the result to print always 'Success' changing only letters "a", "b", etc. to other letter. Change minimum possible number of letters.
        for (int i = 0; i < 10; i++) {
            String result = (i % 2 == 0 ? "a" : i % 3 == 0 ? "b" : i % 5 == 0 ? "c" : i % 7 == 0 && i % 2 == 1 ? "d" : "e").charAt(0) > 97 && (i % 2 == 0 ? "a" : i % 3 == 0 ? "b" : i % 5 == 0 ? "c" : i % 7 == 0 && i % 2 == 1 ? "d" : "e").charAt(0) < 100 ? "Success!" : "Fail!";
            System.out.println(result);
        }
    }
}