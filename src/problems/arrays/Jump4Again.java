package problems.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Jump4Again {

	public static void main(String[] args) {
		int[] arr = {100,-23,-23,404,100,23,23,23,3,404};
		System.out.println(" Max Steps "+minJumps(arr));
	}

	public static int minJumps(int[] arr) {
		int steps = 0;
		int arraySize = arr.length - 1;
		
		if(arraySize == 0) // you are already at the last and only index.
			return steps;
		
		Map<Integer,List<Integer>> map = new HashMap<>();
			for(int i=0; i <= arraySize; i++)
				map.computeIfAbsent(arr[i], f -> new ArrayList<>()).add(i);
				
		Queue<Integer> q = new LinkedList<>();
		q.add(0); // because we are at index 0 initially;
		while(!q.isEmpty()) {
			steps++;
			
			// all the possibilities of this current block of q is a single steps;
			int qSize = q.size();
			
			while(qSize > 0) {
				int currentIndex = q.remove();
				int decrementedIndex = currentIndex - 1;
				int incrementedIndex = currentIndex + 1;
				if(decrementedIndex >= 0 && map.containsKey(arr[decrementedIndex])) {
					q.add(decrementedIndex);
				}
				if(incrementedIndex <= arraySize && map.containsKey(arr[incrementedIndex])) {
					// we reached our destination.
					if(incrementedIndex == arraySize) 
						return steps;
					q.add(incrementedIndex);
				}
				if(map.containsKey(arr[currentIndex]) )// add all the jump possibilites
				{
					for(int jumpIndex : map.get(arr[currentIndex])) {
						if(currentIndex != jumpIndex) { // we dont want to consider same index where we are already standing
							if(jumpIndex == arraySize) //jackpot!! you reached end
								return steps;
							else
								q.add(jumpIndex);
						}
					}
				}
				// decrement the size after checking the current possibility
				qSize--;
				map.remove(arr[currentIndex]);
			}
		}
		return steps;
	}
}












