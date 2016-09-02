/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear;

import java.util.Scanner;

/**
 *
 * @author jp
 */
public class Leapyear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
   Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   if((n%4==0)&&(n%100!=0)||(n%400==0))
   {
       System.out.println("the number is leap");
   }else
   {
       System.out.println("the number is not leap year");
   }
   
    }
    
}
