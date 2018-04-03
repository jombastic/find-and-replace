package models;

public class Game {
  public String findAndReplace(String sentence, String word, String replacement) {
    //String changeling;
    if (sentence.equals(word)) {
      word = replacement;
    }
    return word;
  }
}
