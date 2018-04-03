package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
  public String findAndReplace(String sentence, String word, String replacement) {
    List<String> listOfWords = new ArrayList<>();
    String[] words = sentence.split(" ");
    String[] wordCharacters;
    String joinWord;

    for (String eachWord : words) {
      if (eachWord.equals(word)) {
        listOfWords.add(replacement);
      } else if (eachWord.contains(word)) {
        wordCharacters = eachWord.split(word);
        if (eachWord.endsWith(word)) {
          for (int i = 0; i < wordCharacters.length; i++) {
            wordCharacters[i] += replacement;
          }
        } else {
          for (int i = 0; i < wordCharacters.length - 1; i++) {
            wordCharacters[i] += replacement;
          }
        }
        joinWord = String.join("", wordCharacters);
        listOfWords.add(joinWord);
      } else {
        listOfWords.add(eachWord);
      }
    }

    String result = String.join(" ", listOfWords);
    return result;
  }
}
