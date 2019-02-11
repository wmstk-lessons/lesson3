package com.javacourse.lesson3.part2;

/**
 * This application detects the word with maximum number of vowels in given sentence.
 */
public class MaxVowelsInSentence {

    private static final String[] FINNISH_VOWELS = {"a", "e", "i", "o", "u", "y", "ä", "ö"};

    public static void main(String[] args) {

        // 1. expected output - "viheltäen"
        String[] strings1 = new String[]{"Mikä", "laulaen", "tulee", "se", "viheltäen", "menee"};
        System.out.println(getWordWithMaxNumberOfVowels(strings1));
        // 2. expected output - "huudetaan"
        String[] strings2 = new String[]{"Niin", "metsä", "vastaa", "kuin", "sinne", "huudetaan"};
        System.out.println(getWordWithMaxNumberOfVowels(strings2));

    }

    private static String getWordWithMaxNumberOfVowels(String[] sentence) {

        return "Sorry, this is not implemented yet :-(";
    }
}