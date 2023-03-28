package Homework16032023.UtilPackage;

import java.util.HashSet;

public class UniqueWordsCounter {

    public static int countUniqueWords(String text) {
        HashSet<String> uniqueWords = new HashSet<>();

        String[] words = text.split("\\W+");
        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }

        return uniqueWords.size();
    }
}
