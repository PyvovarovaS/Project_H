package homework11;

import java.util.HashMap;
import java.util.Map;

public class LetterCount {
    public static void main(String[] args) {
        String sentence = args[0]; // Беремо речення з параметрів
        Map<Character, Integer> letterCounts = new HashMap<>();

        for (char letter : sentence.toCharArray()) {
            if (Character.isLetter(letter)) {
                letter = Character.toLowerCase(letter);
                if (letterCounts.containsKey(letter)) {
                    letterCounts.put(letter, letterCounts.get(letter) + 1);
                } else {
                    letterCounts.put(letter, 1);
                }
            }
        }
        for (char letter : letterCounts.keySet()) {
            System.out.println("'" + letter + "' : " + letterCounts.get(letter));
        }
    }
}