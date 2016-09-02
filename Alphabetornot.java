/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabetornot;

import java.util.Scanner;

/**
 *
 * @author jp
 */
public class Alphabetornot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
     Scanner s=new Scanner(System.in);   
 String q=s.next();
 int i;
     char ch[]=q.toCharArray();
     for( i=0;i<ch.length;i++)
     {
         System.out.println(ch[i]);
     }
     if(Character.isDigit(ch[0]))
     {
         System.out.println("is digit");
     }
     
     else
     {
         System.out.println("is char");
     }
    }
    
}
