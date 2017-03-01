import java.awt.Graphics;
import java.awt.Graphics2D;

public class Rectangulo extends Figura
{
  private float base;
  private float altura;
  public Rectangulo(float a, float b)
  {
    base=b;
    altura=a;
  }
    public void getArea()
  {
    area=base*altura; 
  }
   public String darInfo()
 {
     return "Rectangulo "+super.darInfo();
 }
  
 public String toString()
 {
     return "Rectangulo con area= " + super.toString();
 }
 
  @Override
 public void dibuja(Graphics g)
 {
     
 }
}
