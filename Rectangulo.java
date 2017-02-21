
/**
 * Write a description of class Rectangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
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
}
