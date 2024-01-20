package twenty23.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] array = {2,7,11,15};
		int target = 9;	
		
		//int[] array = {3,2,4};
		//int target = 6;	
		
		System.out.println(Arrays.toString(array));
		int[] sol = solution2(array, target);
		System.out.println(Arrays.toString(sol));
	}
	
	public static int[] solution(int[] array, int target) {		
		for(int i=0; i<array.length -1; i++) {
			for(int j=i+1; j < array.length; j++) {
				if(array[j] == target - array[i]) {
					return new int[] {array[i],array[j]};
				} 
			}
		}
		return array;
	}
	
	public static int[] solution2(int[] array, int target) {		
		// number and its position
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0; i< array.length; i++) {
			if(map.containsKey(target - array[i])) {
				return new int[] {array[i],array[map.get(target - array[i])]};
			}else {
				map.put(array[i], i);
			}
		}
		return null;
	}

}
