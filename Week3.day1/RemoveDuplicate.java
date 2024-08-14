package week3.day1;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate   {
	 public static void main(String[] args) {
        String input = "We learn Java basics as part of java sessions in java week1";

        String result = removeDuplicateWords(input);

        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicateWords(String input) {
        String[] words = input.split("\\s+");
        Set<String> wordSet = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!wordSet.contains(word)) {
                wordSet.add(word);
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }

}

