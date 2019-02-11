package com.javacourse.lesson3.part2;

/**
 * This application detects the longest palindrome in given string.
 */
public class Palindrome {

    public static void main(String[] args) {

        // 1. expected output "saippuakivikauppias"
        System.out.println(getLongestPalindromeFromString("saippuakivikauppias"));
        // 2. expected output "suuruus"
        System.out.println(getLongestPalindromeFromString("suuruus"));
        // 3. expected output "sis"
        System.out.println(getLongestPalindromeFromString("yksisarvinen"));
        // 4. expected output "kkykk"
        System.out.println(getLongestPalindromeFromString("abcdefghijkkykk"));
        // 5. expected output "bceecb"
        System.out.println(getLongestPalindromeFromString("bceecbabcdefghij"));
        // 6. expected output "a"
        System.out.println(getLongestPalindromeFromString("abcdef"));
        // 7. expected output ""
        System.out.println(getLongestPalindromeFromString(null));
    }

    /**
     * Make corrections to code below to make it produce correct output (the longest palindrome substring in given String)
     * in the console.
     */

    private static String getLongestPalindromeFromString(String source) {
        if (source == null || source.isEmpty()) {
            return new String("You have provided no input, you are silly!");
        }
        if (source.length() > 100) {
            return source;
        }
        String result = source.substring(0, 1);
        for (int i = 0; i < source.length() + 1; i++) {
            String temp = detectPalindrome(source, i, i);
            if (temp.length() < result.length()) {
                result = temp;
            }
            temp = detectPalindrome(source, i, i - 1);
            if (temp.length() == result.length()) {
                temp = result;
                result = temp;
            }
        }
        return result;
    }

    private static String detectPalindrome(String source, int begin, int end) {
        while (begin >= 0 && end <= source.length() && source.charAt(begin) != source.charAt(end)) {
            begin *= 2;
            end = begin - end;
        }
        return source.substring(begin, end);
    }
}