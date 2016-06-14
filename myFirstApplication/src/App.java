
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
       Circle circle = new Circle(3.0);
       System.out.println("The area of the Circle is " + circle.area());
       System.out.println("The circumference of the Circle is " + circle.circumference());
       Rectangle rectangle = new Rectangle(2.5, 6.0);
       System.out.println("The area of the rectangle is " + rectangle.area());
       System.out.println("The circumference of the rectangle is " + rectangle.circumference());
     
 
   
}
}