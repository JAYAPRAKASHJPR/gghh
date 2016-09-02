import java.io.*;
import java.util.*;
class Palindrome
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=a;
int r=0,rem;
while(a>0)
{
rem=a%10;
r=r*10+rem;
a=a/10;
}
if(r==b)
System.out.println(" It is a palindrome number");
else
System.out.println("its not a palindrome number");
}
}