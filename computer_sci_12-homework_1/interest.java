import java.util.Scanner;

public class interest
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the amount of money you want to put in bank");
        double mon = scan.nextDouble();
       
        System.out.println("Please enter the interest rate (between 0-1): ");
        
        double rate = scan.nextDouble();
        System.out.println("how many years will "+mon+" be in the bank: ");
        
        double years = scan.nextDouble();
        
        double ans = mon*(1+rate)*years*years;
        
        System.out.println("in "+years+" years with a rate of "+rate+" will be: "+ans);
        
        
    }
}
