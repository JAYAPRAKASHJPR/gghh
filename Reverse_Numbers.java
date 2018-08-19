
public class Reverse_Numbers {
	public static void main(String args[]) {
	
	
		int n = 42321;
		 int k = 0;
		 int rev = 0;
        while (n != 0) {
        	
            
            k = n % 10;
            rev = (rev + k ) * 10;
            n  /= 10;
        	
        }
	 
        System.out.println(rev /  10);
	
	
	}

}
