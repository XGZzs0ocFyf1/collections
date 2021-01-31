package ru.gurzhiy;

import java.util.*;

/**
 * 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
 * Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
 * Посчитать сколько раз встречается каждое слово.
 */
public class HandleArrayInMainMethod {
    public static void main(String[] args) {
        String[] arrayOfWords = {
                "mousepad", "mouse", "keyboard", "study", "daylight", "display", "pen", "laptop", "notebook",
                "laptop", "keyboard", "pen", "display", "mousepad", "study",
                "laptop", "pen", "study"

        };

        System.out.println("Array of words size " + arrayOfWords.length);

        Map<String, Integer> wordsFrequency = new HashMap<>();
        for (String firstWord : arrayOfWords) {
            var numberOfElementRepeats = 0;

            for (String secondWord : arrayOfWords) {
                if (firstWord.equals(secondWord)) numberOfElementRepeats++;
                wordsFrequency.put(firstWord, numberOfElementRepeats);
            }
        }

        System.out.println();
        System.out.println("Set of unique words below:");
        wordsFrequency.forEach((key, value) -> System.out.print("\"" + key + "\", "));
        System.out.println();

        System.out.println();
        System.out.println("Elements with its frequencies");
        System.out.println(prettyStringFormatter("word") + " frequency");
        wordsFrequency.forEach((key, value) -> System.out.println(prettyStringFormatter(key) + "   " + value));
    }

    private static String prettyStringFormatter(String input) {

        //create empty string
        StringBuilder sb = new StringBuilder(input);
        while (sb.length() < 15) sb.append(" ");
        return sb.length() > 15 ? sb.substring(0, 15) : sb.toString();
    }
}
