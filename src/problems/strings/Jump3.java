package problems.strings;

import java.util.LinkedList;
import java.util.Queue;

public class Jump3 {

	public static void main(String[] args) {
		//int[] inp = {4,2,3,0,3,1,2}; int start = 5;
		int[] inp = {3,0,2,1,2}; int start = 2;
		System.out.println(canReach(inp, start));
		
	}

	 public static boolean canReach(int[] arr, int start) {
		 Queue<Integer> list = new LinkedList<>();
		 list.add(start);
		 
		 while(!list.isEmpty()) {
			 int currentIndex = list.remove();
			 if(arr[currentIndex] == 0)
				 return true;
			 if(arr[currentIndex] < 0)
				 continue;
			 if(currentIndex - arr[currentIndex] >= 0) {
				 list.add(currentIndex - arr[currentIndex]);
			 }
			 if(currentIndex + arr[currentIndex] < arr.length) {
				 list.add(currentIndex + arr[currentIndex]);
			 }
			 arr[currentIndex] = arr[currentIndex] * -1;
		 }
		 
		 return false;
	 }
}
