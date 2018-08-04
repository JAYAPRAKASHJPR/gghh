import java.util.Scanner;
public class Armstong_Number 
{
  public static void main(String args[])
    {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Lower Limit");
 	  int min = sc.nextInt();
      System.out.println("Enter the Upper Limit");  
      int max = sc.nextInt();
     	   
	     int diff = get_difference(min, max);
		 
		    for (int i = 1; i <= diff+1 ; i++)
		      {
			   Execute(min);
			   min = min + 1;
		      }
		    

		   }
           static int get_difference(int min,int max)
            {
        	   int diff = 0;
        	if (max > min)
        	   {
        		diff = max - min ;
        	    return diff;
        	   }
        	  else 
        	    {
        		 System.out.println("Enter the correct Limit"); 
        		 return 0;
        	    }
        	  
 	
             }
			static void Execute(int n)
			
			{
				
				  int a,b,sum = 0,temp;
				  temp = n;
				   
				  while (n != 0)
				  {
			    	  a = n % 10;
				      b = a * a * a;
				
				      n = n / 10;
				      sum = sum + b;
				  }
				  boolean check;
			    check =  (temp == sum);
			     
			 if (check)
			   {
				
				 display(temp);
			   }    
			      
			}
			static void display(int temp)
			{
				
				System.out.println(temp);
			}
			
}