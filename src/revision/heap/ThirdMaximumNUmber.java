package revision.heap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class ThirdMaximumNUmber {

	public static void main(String[] args) {
		int[] nums = { 2, 2, 3, 1 };
		System.out.println(Arrays.toString(nums));
		System.out.println(thirdMax(nums));
	}

	public static int thirdMax(int[] nums) {
		Set<Integer> seen = new HashSet<Integer>();
		Queue<Integer> pq = new PriorityQueue<Integer>(3);
		pq.offer(nums[0]);
		int i = 1;
		while (i < nums.length) {
			if(seen.add(nums[i])) {
				if (nums[i] > pq.peek()) {
					pq.poll();
					pq.offer(nums[i]);
				}
				i++;	
			}
		}
		return pq.poll();
	}

}
