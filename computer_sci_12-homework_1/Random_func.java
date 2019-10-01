

public class Random_func
{
    public static void main(String[] args){
        int max = 6;
        int min = 1;
        int index = 0;
        while (index < 10){
        double r = (Math.random()*((max-min)+1))+min;
        int ans = (int) r;
        System.out.println(ans);
        index = index +1;
    }
        
    }
}
