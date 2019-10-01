import java.util.Scanner;

public class Magic8Ball{

    public static void main(String[] args){
        int max = 20;
        int min = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Magic8Ball");
        System.out.println("-------------");
        System.out.println("Press q to quite");
        System.out.println("------------------");
        String user;
        while(true){
            System.out.println("ask a yes or no question");
            
            user = scan.nextLine();
            
            double r = (Math.random()*((max-min)+1))+min;
            int ans = (int) r;
            if (user.equals("q")){
                break;
                
                
            }
            
            
             if(ans == 1){
                
                System.out.println(" As I see it, yes.");
                
                
                
            }
            else if(ans == 2){
                
                System.out.println("Ask again later.");
                
                
                
            }
            else if(ans == 3){
                
                System.out.println("Better not tell you now.");
                
                
                
            }
            else if(ans == 4){
                
                System.out.println("Cannot predict now.");
                
                
                
            }
            else if(ans == 5){
                
                System.out.println("Concentrate and ask again.");
                
                
                
            }
            else if(ans == 6){
                
                System.out.println("Don’t count on it.");
                
                
                
            }
            else if(ans == 7){
                
                System.out.println("It is certain.");
                
                
                
            }
            else if(ans == 8){
                
                System.out.println("It is decidedly so.");
                
                
                
            }
            else if(ans == 9){
                
                System.out.println("Most likely.");
                
                
                
            }
            else if(ans == 10){
                
                System.out.println("My reply is no.");
                
                
                
            }
            else if(ans == 11){
                
                System.out.println("My sources say no.");
                
                
                
            }
            else if(ans == 12){
                
                System.out.println("Outlook not so good.");
                
                
                
            }
            else if(ans == 13){
                
                System.out.println("Outlook good.");
                
                
                
            }
            else if(ans == 14){
                
                System.out.println("Reply hazy, try again.");
                
                
                
            }
            else if(ans == 15){
                
                System.out.println("Signs point to yes.");
                
                
                
            }
            else if(ans == 16){
                
                System.out.println("Very doubtful.");
                
                
                
            }
            else if(ans == 17){
                
                System.out.println("Without a doubt.");
                
                
                
            }
            else if(ans == 18){
                
                System.out.println("Yes.");
                
                
                
            }
            else if(ans == 19){
                
                System.out.println("Yes – definitely.");
                
                
                
            }
            else if(ans == 20){
                
                System.out.println("You may rely on it.");
                
                
                
            }
            
            
            
            
            
            
            
            
        }
        
        
        
    }
}
