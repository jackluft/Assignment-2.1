import java.util.Scanner;

public class GradeBot
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the test out of: ");
        double test_out = sc.nextInt();
        System.out.println("What mark did you get: ");
        System.out.println("Between(0-"+test_out+")");
        double test_in = sc.nextInt();
        double ans = (test_in/test_out)*100;
        int an2 = (int) ans;
        System.out.println("Your percentage is "+an2);
        if( ans >= 86){
            
            System.out.println("You got an A");
            
            
        }
        else if(ans >=73){
            
            System.out.println("You got a B");
            
            
            
        }
        else if(ans >= 67){
            
            System.out.println("You got a C+");
            
            
            
        }
        else if(ans >= 60){
            
            System.out.println("You got a C");
            
            
        }
        else if(ans >= 50){
            
            System.out.println("You got a C-");
            
            
            
            
        }
        else{
            System.out.println("You got an F");
            System.out.println("Better luck next time");
            
            
            
            
            
        }
        
            
            
            
            
        
        
        
        
        
    }
}
