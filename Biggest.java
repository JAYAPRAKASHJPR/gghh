/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biggest;



/**
 *
 * @author student
 */
import java.util.*;
import java.io.*;
class Biggest
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter the numbers of n");
        DataInputStream s=new DataInputStream(System.in);
        int n;
        n = Integer.parseInt(s.readLine());
        String[] a=new String[n];
        System.out.println("ENTER THE ELEMENTS");
        Scanner sc=new Scanner(System.in);
        for(int x=0;x<n;x++)
        {
         a[x]=sc.next();
        }
        for(int k=0;k<a.length;k++)
        {
          String temp=a[k];
          for(int i=0;i<a.length;i++)
          {
           String temp1=a[i];
           for(int j=0;j==0;)
            {
              if(temp.charAt(j)>temp1.charAt(j))
               {
                   String swap=a[k];
                   a[k]=a[i];
                   a[i]=swap;
                   break;
               }
                else
                break;
            }
        }
        }
        //StringBuilder StrNum=new StringBuilder();
        System.out.println("Biggest number possible is:");
        
        for(String out:a)
        {
            //StrNum.append(out);
            System.out.print(out);
        }
        //int finalInt=Integer.parseInt(StrNum.toString());
        //System.out.println("LARGEST NUMBER IS : "+finalInt);
    }
} 

