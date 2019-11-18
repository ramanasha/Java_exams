package packB;
import packA.A;
  public class B extends A{
  public  int y;
  public  B(){
    this.y=100;
    }
  public void gety(){
      super.getx();
      System.out.println("this is B" + this.y);
    }
  }
