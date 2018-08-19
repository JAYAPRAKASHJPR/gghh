
public class Balanced_paranthesis {
	
public static void main(String args[])
 {
 	int open_store = 0;
	int close_store = 0;
	char[] ch = {'(' , ')', '(' , ')' };
	
	for (int i= 0 ; ch.length > i ; i++)
	{
		if ( ch[i] == '(' ) 
			
			open_store = open_store + 1;
		
		else if  ( ch[i] == ')' )
			
			close_store = close_store + 1;
	   	
		
	}

	if (close_store == open_store )
		System.out.println("The given Expression is balanced");
	else
		System.out.println("The given Expression is not  balanced");
  }

}
