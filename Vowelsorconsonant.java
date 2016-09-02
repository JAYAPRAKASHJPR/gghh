/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vowelsorconsonant;

/**
 *
 * @author jp
 */
import java.util.*;
public class Vowelsorconsonant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner check=new Scanner(System.in);
        System.out.println("enter a characters");
        char ch=check.next().charAt(0);
        System.out.println(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("the given character is vowels");
        }
        else 
        {
            System.out.println("the number is consonants");
        }
        
    }
    
    
    
    
}
