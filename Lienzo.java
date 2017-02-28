
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Lienzo extends JPanel
{
  private ArrayList<Figura> figuras;
  //figuras=new ArrayList<Figura>;
  @Override
  public void paintComponent(Graphics g)
  {
      Graphics2D g2 = (Graphics2D)g;
      g2.drawString("Hola Mundito feliz, no soy Tony", 210, 240);
      g2.drawRoundRect(50, 50, 50, 50, 50,50);
  }
}
