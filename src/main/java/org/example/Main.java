package org.example;

import org.example.LongestCollatzSequence.LongestCollatzSequence;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int number = 1000000;
        int longest = LongestCollatzSequence.longestCollatzSequence(number);
        System.out.println("The longestCollatzSequence of " + number + " is " + longest);
    }
}