
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
public static void main(String []args)
{
    Triangulo t1= new Triangulo(6,4);
    t1.getArea();
    System.out.println(t1.area);
    Rectangulo r1= new Rectangulo(6,4);
    r1.getArea();
    System.out.println(r1.area);
    Circulo c1= new Circulo(6);
    c1.getArea();
    System.out.println(c1.area);
    Figura[] figuras= new Figura[3];
    figuras[0]=t1;
    figuras[1]=r1;
    figuras[2]=c1;
    for(int i=0;i<figuras.length;i++)
    {
    figuras[i].getArea();
    }
    for(int i=0;i<figuras.length;i++)
    {
    System.out.println(figuras[i].area);
    }
    for (Figura f: figuras)
    {
    f.getArea();
    }
      for (Figura f: figuras)
    {
    System.out.println(f.area);
    }
}
}
