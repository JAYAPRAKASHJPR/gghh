/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poweer;

/**
 *
 * @author jp
 */
import java.io.*;
import java.math.*;
import java.util.Scanner;
public class Poweer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
     Scanner s=new Scanner(System.in);
     int a=s.nextInt();
     int b=s.nextInt();
        System.out.println(Math.pow(a,b));    
     
    }
    
}
