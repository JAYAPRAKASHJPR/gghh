/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rev_order;

import java.util.Scanner;

class Rev_order
 {
  public static void main(String jp[])
  {
      Scanner sc=new Scanner(System.in);
      String original,orev="";
   System.out.println("Enter a string :");
  
   original=sc.nextLine();
   String[] Arr=original.split(" ");
   for(int i=Arr.length-1;i>=0;i--)
     {
       orev=orev+" "+Arr[i];
     }
     System.out.println("Reverse order is:\n"+orev);
  }
 } 
