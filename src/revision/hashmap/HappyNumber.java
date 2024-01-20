package revision.hashmap;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static void main(String[] args) {
		int n = 19;
		//int n = 2;
		System.out.println(n +"is happy number ?"+isHappyNewApproach(n));

	}

	public static boolean isHappy(int n) {
		Set<Integer> set = new HashSet<Integer>();
		return isHappyHelp(n,set);
	}
	public static boolean isHappyHelp(int n, Set<Integer> set) {
		if(n == 1)
			return true;
		if(set.contains(n))
			return false;
		int newNum = 0;
		set.add(n);
		while(n > 0) {
			int left = n%10;
			n = n/10;
			newNum = newNum + (left*left);
		}
		return isHappyHelp(newNum, set);
	}
	
	public static boolean isHappyNewApproach(int n) {
		int slow = n;
		int fast = n;
		do {
			 slow = square(slow);
			 System.out.println(slow);
			 fast = square(square(fast));
			 System.out.println(fast);
		}while(slow != fast);
		return slow == 1;
	}
	
	public static int square(int n) {
		int newNum = 0;
		while(n > 0) {
			int left = n%10;
			n = n/10;
			newNum = newNum + (left*left);
		}
		return newNum;
	}
}
