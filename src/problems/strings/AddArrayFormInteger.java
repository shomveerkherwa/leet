package problems.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AddArrayFormInteger {

	public static void main(String[] args) {
		int[] num = {1,2,3};
		int k = 11;
		System.out.println(Arrays.toString(num) + k);
		List<Integer> result = addToArrayFormEfficient(num, k);
		System.out.println(Arrays.toString(result.toArray()));
	}

	public static List<Integer> addToArrayForm(int[] num, int k) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = (sum * 10) + num[i];
		}
		System.out.println(sum);
		sum = sum + k;
		String sumStr = Integer.toString(sum);
		System.out.println(sumStr);
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < sumStr.length(); i++) {
			result.add(sumStr.charAt(i) - '0');
		}
		return result;
	}
	
	public static List<Integer> addToArrayFormEfficient(int[] num, int k) {
		LinkedList<Integer> result = new LinkedList<>();
		int size = num.length-1;
		while(size >= 0 || k != 0 ) {
			int n = size < 0 ? 0 : num[size];
			n = n + k ;
			result.addFirst(n%10);
			k = n/10;
			size--;
		}
		return result;
	}
}
