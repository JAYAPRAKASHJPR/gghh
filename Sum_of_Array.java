import java.util.*;
public class Sum_of_Array {
	public static void main(String[] args) 
    {
        int n, k = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you waant to sum");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 1; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int j = 1; j < n; j++) {
        	   k = k + a[j];
        	
        }
     System.out.println(k);
        
 }
}