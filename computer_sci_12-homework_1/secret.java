import java.util.Scanner;

public class secret{
    public static void main(String[] args){

   Scanner scan = new Scanner(System.in);
   String pass = "dragon";
   
   System.out.println("What is the password: ");
   String ans = scan.nextLine();
   if(pass.equals(ans)){
       System.out.println("Correct!");
       System.out.println("My secret is: I am Batman.");
       
       
    }
    else{
        System.out.println("Incorrect Password!");
        
        
    }
}
   
}
