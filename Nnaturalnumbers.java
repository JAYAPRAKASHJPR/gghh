/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nnaturalnumbers;

import java.util.Scanner;

/**
 *
 * @author jp
 */
public class Nnaturalnumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    
    {
        Scanner d=new Scanner(System.in);
        int n=5;
        int count=0;
     
    for(int i=0;i<n;i++)
    {
        count+=i;
        System.out.println(count);
    }
    }
    
}
