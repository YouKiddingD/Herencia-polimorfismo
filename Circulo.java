
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circulo extends Figura
{
  private float radio;
  public Circulo(float r)
  {
    radio=r;
  }
  public void getArea()
  {
    area=(float)3.1416*(radio*radio); 
  }
     public String darInfo()
 {
     return "Circulo "+super.darInfo();
 }
 
 public String toString()
 {
     return "Circulo con area= " + super.toString();
 }
 
 @Override
 public void dibuja(Graphics g)
 {
 
 }
}
