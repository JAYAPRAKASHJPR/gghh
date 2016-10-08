import java.util.Scanner;
public class Palindromers {
  
  
  public static void main(String args[]) {
    int no,an=0,am=0,t,i=0,t1;
    
    
    Scanner s=new Scanner(System.in);
    no=s.nextInt();
    while(n>0)
    {
      t=no%10;
      am=am*10+(t*t*t);
      no=no/10;
    }
    if(am==no)
    {
      System.out.println("palindrome");
    }
    else
    {
      System.out.println("not palindrome");  
    }
    
  }
  }
