package models;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GameTest {
  @Test
  public void findAndReplace_replaceAWholeWord_String() {
    Game testGame = new Game();
    String result = "universe";
    assertEquals(result, testGame.findAndReplace("world", "world", "universe"));
  }

  @Test
  public void findAndReplace_replaceAWholeWordInString_String() {
    Game testGame = new Game();
    String result = "hello universe";
    assertEquals(result, testGame.findAndReplace("hello world", "world", "universe"));
  }

  @Test
  public void findAndReplace_replaceAWordWithinAComplexWordInString_String() {
    Game testGame = new Game();
    String result = "dogherine is delidogely domestidoging the dog in the doghedral";
    assertEquals(result, testGame.findAndReplace("catherine is delicately domesticating the cat in the cathedral", "cat", "dog"));
  }

  @Test
  public void findAndReplace_replaceAWordWithinAComplexWordInStringWithCapitalization_String() {
    Game testGame = new Game();
    String result = "dogherine is delidogely domestidoging the dog in the doghedral";
    assertEquals(result, testGame.findAndReplace("Dogherine is Delidogely domEstidoging the doG in The dogheDral", "cat", "dog"));
  }
}