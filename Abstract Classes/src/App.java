
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
       
       Cubit cub = new Cubit(3,4,5);

       System.out.println("Volume of the cub is "+cub.volume());

       
      byte a=100;
      byte b=120;
      byte sum=(byte) (b+a);
      
      System.out.println(sum);
      
      int c = 10;
      float d = 10.0f + c ;
      
      System.out.println(d);
      

   
}
    
  
}