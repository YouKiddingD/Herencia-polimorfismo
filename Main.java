
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
    
}
}
