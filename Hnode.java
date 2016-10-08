import java.io.*;
import java.util.*;
class Hnode
{
	public static void main(String args[])
	{
		int arr[]=new int[50];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<50;i++)
		{
			arr[i]=s.nextInt();
		}
		int r=s.nextInt();
		for(int j=0;j<50;j++)
		{
			for(int k=j+1;k<50;k++)
			{
				if(arr[j]<arr[k])
				{
					int t=arr[j];
					arr[j]=arr[k];
					arr[k]=t;
				}
			}
		}
      System.out.println(arr[3]);
      System.out.println(arr[r]);
	}
}
