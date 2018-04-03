package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
  public String findAndReplace(String sentence, String word, String replacement) {
    List<String> listOfWords = new ArrayList<>();
    String[] words = sentence.split(" ");

    for (String eachWord : words) {
      if (eachWord.equals(word)) {
        listOfWords.add(replacement);
      } else {
        listOfWords.add(eachWord);
      }
    }

    String result = String.join(" ", listOfWords);
    return result;
  }
}
