package com.javacourse.lesson3.part1;

/**
 * Consider why comparisons below have different/equal results.
 * Consider two last console outputs.
 */
public class Puzzle2 {

    public static void main(String[] args) {

        Integer a = 100500;
        Integer b = 100500;
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println("****************************************");
        Integer aa = 12;
        Integer bb = 12;
        System.out.println(aa == bb);
        System.out.println(aa.equals(bb));
        System.out.println("****************************************");
        String c = "Hyvää huomenta!";
        String d = "Hyvää huomenta!";
        System.out.println(c == d);
        System.out.println(c.equals(d));
        System.out.println("****************************************");
        String e = new String("Hyvää huomenta!");
        String f = new String("Hyvää huomenta!");
        System.out.println(e == f);
        System.out.println(e.equals(f));
        System.out.println(c == e || d == f);
        System.out.println("****************************************");
        char g = '7';
        int h = 1600;
        System.out.println(g + h);
        System.out.println((char) (g + h));
    }
}