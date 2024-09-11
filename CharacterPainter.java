import org.code.neighborhood.*;

/*
* This subclass will painter the entire character and it's border.
*/

public class CharacterPainter extends BackgroundPainter {

  // This will activate all the methods in one go.
  public void paintCharacter() {
    paintDarkSlateBlue("DarkSlateBlue");
    paintRed("Red");
    paintYellow("Yellow");
    paintLightBlue("LightBlue");
    paintGreen("Green");
    paintBlack("Black");
    paintLightGray("LightGray");
    paintBlue("Blue");
    paintGray("Gray");
}
  // This method will paint the border of the character.
  public void paintDarkSlateBlue(String color) {
    setPaint(48);
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    paint(color);
    move();
    paint(color);
    move();
    move();
    turnRight();
    move();
    turnRight();
    paint(color);
    move();
    paint(color);
    move();
    move();
    move();
    paint(color);
    move();
    paint(color);
    move();
    turnLeft();
    move();
    paint(color);
    turnLeft();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    paint(color);
    move();
    turnRight();
    move();
    paint(color);
    turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    paint(color);
    turnLeft();
    move();
    paint(color);
    turnLeft();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    paint(color);
    move();
    turnRight();
    move();
    paint(color);
    turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    paint(color);
    turnLeft();
    move();
    paint(color);
    turnLeft();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    paint(color);
    turnRight();
    move();
    turnRight();
    move();
    paint(color);
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    paint(color);
    turnLeft();
    move();
    paint(color);
    turnLeft();
    move();
    paint(color);
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    paint(color);
    move();
    paint(color);
    move();
    turnRight();
    move();
    paint(color);
    turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    paint(color);
    move();
    turnLeft();
    move();
    paint(color);
    turnLeft();
    move();
    move();
    move();
    paint(color);
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    paint(color);
    move();
    move();
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
    turnRight();
    move();
    move();
    move();
    paint(color);
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    paint(color);
    move();
    move();
    move();
    paint(color);
    turnLeft();
    move();
    turnLeft();
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    turnRight();
    move();
    turnRight();
    move();
    move();
    paint(color);
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    paint(color);
    turnLeft();
    move();
    turnLeft();
    paint(color);
    move();
    move();
    move();
    paint(color);
    move();
    paint(color);
    move();
    move();
    move();
    paint(color);
    turnRight();
    move();
    turnRight();
    move();
    paint(color);
    move();
    paint(color);
    move();
    move();
    move();
    paint(color);
    move();
    paint(color);
    move();
  }

  //This will paint the hat, which will be red.
  public void paintRed(String color) {
    setPaint(26);
    turnRight();
    moveFast();
    turnRight();
    move();
    move();
    move();
    turnRight();
    move();
    paint(color);
    turnLeft();
    move();
    paint(color);
    move();
    move();
    turnRight();
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    turnLeft();
    move();
    paint(color);
    turnLeft();
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
    turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    paint(color);
    move();
    turnLeft();
    move();
    paint(color);
    turnLeft();
    move();
    paint(color);
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    paint(color);
    move();
    paint(color);
    turnRight();
    move();
    turnRight();
    paint(color);
    move();
    paint(color);
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    paint(color);
    move();
    paint(color);
  }

  //This will paint the skin, which is yellow.
  public void paintYellow(String color) {
    setPaint(22);
    turnRight();
    move();
    move();
    turnRight();
    move();
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    turnRight();
    move();
    turnRight();
    move();
    move();
    paint(color);
    move();
    paint(color);
    turnLeft();
    move();
    turnLeft();
    paint(color);
    move();
    paint(color);
    turnRight();
    move();
    turnRight();
    paint(color);
    move();
    paint(color);
    move();
    turnLeft();
    move();
    turnLeft();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    move();
    move();
    move();
    turnRight();
    move();
    move();
    paint(color);
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    paint(color);
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
  }

  // This code will paint the arms and bandana, which are light blue.
  public void paintLightBlue(String color) {
    setPaint(6);
    move();
    turnRight();
    move();
    paint(color);
    move();
    paint(color);
    move();
    move();
    move();
    paint(color);
    move();
    paint(color);
    move();
    move();
    move();
    paint(color);
    move();
    paint(color);
    move();
  }

  // This method will draw the cheeks and thumbs, which will be green.
  public void paintGreen(String color) {
    setPaint(6);
    turnLeft();
    move();
    move();
    turnLeft();
    move();
    move();
    paint(color);
    move();
    turnLeft();
    move();
    paint(color);
    turnRight();
    move();
    move();
    move();
    move();
    move();
    paint(color);
    move();
    turnRight();
    move();
    paint(color);
    turnLeft();
    move();
    turnLeft();
    move();
    move();
    move();
    paint(color);
    turnLeft();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    paint(color);
  }

  //This method of code will draw the shirt and pupils, which are black.
  public void paintBlack(String color) {
    setPaint(20);
    turnLeft();
    move();
    move();
    move();
    move();
    turnLeft();
    move();
    move();
    move();
    paint(color);
    move();
    move();
    move();
    paint(color);
    turnLeft();
    move();
    turnLeft();
    paint(color);
    move();
    move();
    move();
    paint(color);
    move();
    turnRight();
    move();
    move();
    turnRight();
    paint(color);
    move();
    paint(color);
    move();
    move();
    move();
    paint(color);
    move();
    paint(color);
    turnLeft();
    move();
    turnLeft();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    turnRight();
    move();
    turnRight();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
  }

  //This code paints the belt, which is light gray.
  public void paintLightGray(String color) {
    setPaint(6);
    turnLeft();
    move();
    paint(color);
    turnLeft();
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
  }

  //This code will paint the pants blue.
  public void paintBlue(String color) {
    setPaint(6);
    turnRight();
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
  }

  //This final code will paint the shoes, which are going to be grey.
  public void paintGray(String color) {
    setPaint(4);
    turnLeft();
    move();
    turnLeft();
    paint(color);
    move();
    paint(color);
    move();
    move();
    move();
    paint(color);
    move();
    paint(color);
    move();
  }
}