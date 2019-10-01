import java.util.Scanner;

public class AreaToRadius
{
    // instance variables - replace the example below with your own
  public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.println("Calucale are of circle");
      System.out.println("---------------------------------");
      System.out.println("Please enter the radius of the circle");
      double r = scan.nextDouble();
      double ans = Math.PI *r*r;
      System.out.println("The area of the Cirlce is: "+ans);
      
      
      
      
      
    }
}
