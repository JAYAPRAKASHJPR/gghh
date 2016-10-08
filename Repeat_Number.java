
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repeat;

import static java.lang.System.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author biznet
 */
public class Repeat_Number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int registrationNumbers[],noofRegistration,iteration,duplicateCount;
        Scanner sc=new Scanner(in);
        out.println("Enter no of Registration numbers : ");
        registrationNumbers=new int[sc.nextInt()];
        for(iteration=0;iteration<registrationNumbers.length;iteration++){
            out.print("Enter Registration number "+(iteration+1)+" : ");
            registrationNumbers[iteration]=sc.nextInt();
        }
        Arrays.sort(registrationNumbers);
       for(iteration=0;iteration<registrationNumbers.length-1;){
              duplicateCount=0;
              int temp=registrationNumbers[iteration];
              while(temp==registrationNumbers[++iteration]){
                  duplicateCount++;
              }
              if(duplicateCount!=0){
                  out.println("Duplicate Entry of Registration Numbers "+temp+" as it is repeated "+duplicateCount+" more times");
             }
        
           }
    }}
    
