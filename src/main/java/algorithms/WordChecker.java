package algorithms;

public class WordChecker {
    public boolean wordCheck(String word) {
        boolean isValid = false;
        char currentLetter;
        for (int i = 0; i < word.length(); i++) {
            currentLetter = word.charAt(i);
            if (Character.isSpaceChar(currentLetter)) {
                throw new IllegalArgumentException("It should be one word!");
            }
            if (!Character.isLowerCase(currentLetter)) {
                throw new IllegalArgumentException("Word should be lower case!");
            }
        }
        isValid = true;
        return isValid;
    }
}