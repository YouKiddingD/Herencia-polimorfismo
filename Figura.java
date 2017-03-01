import java.awt.Graphics;
import java.awt.Graphics2D;

public abstract class Figura
{
 protected float area;
 
 public Figura()
 {
     area=0;
 }
 
 public void getArea()
 {} 
 
 public String darInfo()
 {
     return ""+area;
 }
 
 public String toString()
 {
    return ""+area;
 }
 public abstract void dibuja(Graphics g);
}
