package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Words {
    private List<String> words = new ArrayList<>();
    WordChecker wordChecker = new WordChecker();

    public void addWord(String word) {
        if (wordChecker.wordCheck(word)) {
            words.add(word);
        }
    }

    public boolean isThereAWordTwice() {
        for (String scopedWord : words) {
            if (words.contains(scopedWord)) {
                return true;
            }
        }
        return false;
    }

    public List<String> getWords() {
        return words;
    }
}
