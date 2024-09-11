import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    /*
    * The Background and Character painters will instantiate, making the mural image.
    */  

    BackgroundPainter mykel = new BackgroundPainter();

    mykel.paintBackground("White");
    
    CharacterPainter jayden = new CharacterPainter();

    jayden.paintCharacter();
    
  }
}