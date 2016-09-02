/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddoreven;

/**
 *
 * @author jp
 */
import java.util.Scanner;
public class Oddoreven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner s=new Scanner (System.in);
       int a=s.nextInt();
       if(a%2==0)
       {
           System.out.println("the number is even");
           
       }
       else
       {
       
           System.out.println("the number is odd");
       }
    }
    
}
