/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author student
 */import java.io.*;
public class Factorial {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException
    {
    DataInputStream s=new DataInputStream(System.in);    
    int fact=1;
        System.out.println("enter the factorial of a number");
        int n=Integer.parseInt(s.readLine());
        for(int i=1;i<=n;i++)
        {
        fact=fact*i;
        }
        System.out.println("the factorial of a number is "+fact);
    }
    
    
}
