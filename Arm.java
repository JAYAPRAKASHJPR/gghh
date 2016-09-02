/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arm;

import java.util.Scanner;

/**
 *
 * @author jp
 */
public class Arm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
        System.out.println("enter the value of number");
    int n=s.nextInt();
    int k=n;
    int sum;
    int t=0;
    
   while(n!=0)
   {
    sum=n%10;
    t=t+(sum*sum*sum);
    n=n/10;
    
    }
   if(k==t)
   {
       System.out.println("the number is armstrong");
   }else
   {
       System.out.println("the no is not armstrong");
   }
    
}}
