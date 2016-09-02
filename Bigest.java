/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigest;

import java.util.Scanner;

/**
 *
 * @author jp
 */
public class Bigest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b, c;
        Scanner j=new Scanner(System.in);
        System.out.println("enter the value of a");
        a=j.nextInt();
        System.out.println("enter the value of b");
        b=j.nextInt();
        System.out.println("enter the value of c");
        c=j.nextInt();
        
        if((a>b)&&(a>c))
        {
            System.out.println("the greatest number is"+a);
        
        }
        else if(b>c)
        {
            System.out.println("the greatest number is"+b);
        }
        else
        {
            System.out.println("the greatest number is"+c);
        }
    }
    
}
