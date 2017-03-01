import java.awt.Graphics;
import java.awt.Graphics2D;

public class Triangulo extends Figura
{
  private float base;
  private float altura;
  public Triangulo(float a, float b)
  {
    base=b;
    altura=a;
  }
  public void getArea()
  {
    area=base*altura/2;  
  }
   public String darInfo()
 {
     return "Triangulo "+super.darInfo();
 }
  
 public String toString()
 {
     return "Triangulo con area= " + super.toString();
 }
 
 @Override
 public void dibuja(Graphics g)
 {
     
 }
}
