import models.Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
  public static void main(String[] args) {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    Game game = new Game();
    boolean runProgram = true;
    while (runProgram) {
      try {
        System.out.println("Enter a sentence: ");
        String sentence = bufferedReader.readLine();
        System.out.print("Now choose a word from the sentence: ");
        String word = bufferedReader.readLine();
        System.out.print("And now provide a replacement for that word: ");
        String replacement = bufferedReader.readLine();
        String changedWord = game.findAndReplace(sentence, word, replacement);
        System.out.println(changedWord);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
