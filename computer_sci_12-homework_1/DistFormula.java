import java.util.Scanner;

public class DistFormula
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Give X position for point 1: ");
        double p1_x = scan.nextDouble();
        System.out.println("Give Y position for point 1: ");
        double p1_y = scan.nextDouble();
        System.out.println("Give X position for point 2: ");
        double p2_x = scan.nextDouble();
        System.out.println("Give Y position for point 2: ");
        double p2_y = scan.nextDouble();
        
        double ans = Math.sqrt(Math.pow((p2_x-p1_x),2) + Math.pow((p2_y-p1_y),2));
        System.out.println("The Dist between p1 and p2 is: "+ans);
    }
}
