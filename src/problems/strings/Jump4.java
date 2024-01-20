package problems.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Jump4 {

	public static void main(String[] args) {
		//int[] arr = {100,-23,-23,404,100,23,23,23,3,404};
		int[] arr = {7,6,9,6,9,6,9,7};
		System.out.println("Minimum jumps --> "+minJumps(arr));

	}

	public static int minJumps(int[] arr) {
		Map<Integer, List<Integer>> map = new HashMap<>();
		int steps = 0;
		int size = arr.length;
		
		if(size == 1)
			return steps;
		
		for(int i=0; i< arr.length; i++ )
			map.computeIfAbsent(arr[i], v -> new ArrayList<>()).add(i);
		
		Queue<Integer> q = new LinkedList<>();
		q.add(0);
		
		while(!q.isEmpty()) {
			//take the size of queue. This size limit is 1 step with different combinations.
			int currentStepSize = q.size();
			steps++;
			while(currentStepSize > 0) {
				int index = q.remove();
				
				//decrementing condition
				if(index-1 >= 0 && map.containsKey(arr[index-1])) {
					q.add(index-1);
				}
				
				//incrementing condition
				if(index +1 < arr.length && map.containsKey(arr[index+1])) {
					if( index+1 == arr.length -1)
						return steps;
					q.add(index+1);
				}
				
				//same number condition
				if(map.containsKey(arr[index])) {
					for(int repeatIndex : map.get(arr[index])) {
						//we do not want to check possibilities from same index
						if(repeatIndex != index) 
						{
							if(repeatIndex == arr.length -1)
								return steps;
							else
								q.add(repeatIndex);
						}
					}
				}
					
				map.remove(arr[index]);
				currentStepSize--;
			}
		}
		return steps;    
    }
}
