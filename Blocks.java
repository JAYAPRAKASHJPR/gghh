import java.util.Scanner;

class Blocks{
public static void main(String argn[]){
Scanner d = new Scanner(System.in);
int sum, i, temp, max;

System.out.print("Enter sumber you want to enter:");
sum = d.nextInt();
System.out.println("Enter " +sum+ " sumber");

max = d.nextInt();

for (i=1; i < sum; i++) { temp = d.nextInt();
 if(temp < max)
continue;
else

max = temp;
}
System.out.println("Largest sumber is "+max);
}
}