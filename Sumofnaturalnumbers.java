/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofnaturalnumbers;

import java.util.Scanner;

/**
 *
 * @author jp
 */
public class Sumofnaturalnumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i=0;
        int n=s.nextInt();
        int sum=0;
        while(i<n)
        {
        sum+=i;
            System.out.println(sum);
            i++;
        }
    }
    
}
