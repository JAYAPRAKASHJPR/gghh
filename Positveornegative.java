import java.util.Scanner;


public class Positveornegative {

  
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=s.nextInt();
        if(n>0)
        {
            System.out.println("the number is positive");
        }
        else if(n==0)
        {
            System.out.println("the number is zero it is either negative or positive");
        }
        else
        {
            System.out.println("the number is negative");
        }
    }
    
}
