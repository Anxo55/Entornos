import java.awt.Color

abstract class Raquet{
  protected float x;
  protected float y=height/2;
  protected int w = 10;
  protected int h = 100;
  private float vy = 0;
  private Color c=Color.WHITE;
  protected final static int WALL_SEPARATION=50;
  public int points=0;
  public Raquet() {}
  public void draw() {
  }
  public void updatePosition(){
  }
  public void limitOutScreen() {
  }
  publiv void moveUp() {
  }
  public void stop() {
  }
}

class RaquetI extends Raquet{
  public RaquetI(){
    x=0+WALL_SEPARATION;
  }
}
class RaquetD extends Raquet{
  public RaquetD(){
    X=
  }
}
