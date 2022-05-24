package task3;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //*****************************PART1****************************************************************************

       /* String[] inputSentence = scanner.nextLine().trim().split(" ");

        int lengthOfLongestWord = 0;
        int indexOfLongestWord = 0;
        for (int i = 0; i < inputSentence.length; i++) {
            if (lengthOfLongestWord < inputSentence[i].length()) {
                lengthOfLongestWord = inputSentence[i].length();
                indexOfLongestWord = i;
            }
        }

        System.out.println("The Longest word of in the sentence: " + inputSentence[indexOfLongestWord]);
        System.out.println("Number of letters in the longest word: " + lengthOfLongestWord);
        System.out.println("The second word of the sentence in reverse order: " + new StringBuilder(inputSentence[1]).reverse());*/

        //*****************************PART2****************************************************************************

        /*String sentence = scanner
                .nextLine()
                .trim()
                .replaceAll("\\s+", " ");

        System.out.println(sentence);*/

        //*****************************PART3****************************************************************************

        /*String text = scanner.nextLine();

        Matcher matches = Pattern.compile("\\$\\d+?\\.\\d{2}").matcher(text);

        List<String> currencies = new ArrayList<>();
        while (matches.find()) {
            currencies.add(text.substring(matches.start(), matches.end()));
        }
        System.out.println(currencies);*/

    }
}
