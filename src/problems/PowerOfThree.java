package problems;

import java.util.Random;

public class PowerOfThree {

	public static void main(String[] args) {
		int n = 27;
		System.out.println(n +" is Power of 3 "+isPowerOfThree(n));
		Random random =new Random();
	}
	
	public static boolean isPowerOfThree(int n) {
        if(n == 0)
        	return false;
		System.out.println("value "+n);
		if(n == 1)
			return true;
		
		return (n % 3 == 0) && isPowerOfThree(n/3);
	}
}
