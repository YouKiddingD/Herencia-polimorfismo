
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Lienzo extends JPanel
{
  private ArrayList <Figura> figuras;
  public void lienzo()
  {
   figuras=new ArrayList<Figura>();
      Triangulo triangulo= new Triangulo(3,8);
      Rectangulo rect= new Rectangulo(2,6);
      Circulo circ = new Circulo(6);
      figuras.add(triangulo);
      figuras.add(rect);
      figuras.add(circ);
   }
  @Override
  public void paintComponent(Graphics g)
    {
          for(Figura f:figuras)
      {
         f.dibuja(g); 
      }
    }
}

