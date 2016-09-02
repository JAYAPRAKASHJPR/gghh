import java.io.*;
import java.util.Scanner;
class Prime
{
public static void main(String args[])
{
Scanner d=new Scanner(System.in);
int n=d.nextInt();
int flag=0;
for(int i=2;i<n;i++)
{
if(n%i==0)
{
flag=1;
break;
}
}
if(flag==0)
System.out.println("it is a prime number");
else
System.out.println("it is not a prime number"); 
}
}
