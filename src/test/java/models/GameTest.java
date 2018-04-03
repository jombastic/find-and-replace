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
}