package org.example.LongestCollatzSequence;

public class LongestCollatzSequence {
    private static int longestCollatzSequence(int number, int counter){
        counter++;
        if (number > 1){

            if (number % 2 == 0){
                System.out.print(number / 2 + " ");
                return longestCollatzSequence(number / 2, counter);
            }
            else {
                System.out.print(3 * number + 1 + " ");
                return longestCollatzSequence(3 * number + 1, counter);
            }
        }
        else {
            return counter;
        }
    }
    public static int longestCollatzSequence(int number){
        int counterCollateSequence = 0;

        for (int counter = 1; counter <= number; counter++) {
            System.out.println(System.lineSeparator() + "Number: " + counter);
            int numberSequence = longestCollatzSequence(counter, 0);

            counterCollateSequence = numberSequence > counter ? counter : counterCollateSequence;
        }

        return counterCollateSequence;
    }

}
