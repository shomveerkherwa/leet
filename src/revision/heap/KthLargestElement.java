package revision.heap;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElement {

	public static void main(String[] args) {
		//int[] nums = { 3, 2, 1, 5, 6, 4 }; int k = 2;
		int[] nums = { 1,2,2,3,3,4,5,5,6 }; int k = 4;
		System.out.println(Arrays.toString(nums));
		System.out.println(findKthLargest(nums, k));
	}

	public static int findKthLargest(int[] nums, int k) {
		Queue<Integer> pq = new PriorityQueue<Integer>(k);
		int i=0;
		while(i < k) {
			pq.offer(nums[i]);
			i++;
		}
		while(i < nums.length) {
			if(nums[i] > pq.peek()) {
				pq.poll();
				pq.offer(nums[i]);
			}
			i++;
		}
		return pq.poll();
	}

}
