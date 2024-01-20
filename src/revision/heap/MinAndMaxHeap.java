package revision.heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinAndMaxHeap {

	public static void main(String[] args) {
		int[] inp = {12,4,25,36,9};
		
		Queue<Integer> minHeap = new PriorityQueue<Integer>();
		for(int n : inp) {
			minHeap.offer(n);
		}
		System.out.println(Arrays.toString(inp));
		while(!minHeap.isEmpty()) {
			System.out.print(minHeap.poll() + "\t");
		}
		System.out.println();
		Queue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int n : inp) {
			maxHeap.offer(n);
		}
		while(!maxHeap.isEmpty()) {
			System.out.print(maxHeap.poll() + "\t");
		}
	}

}
