package problems.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextBigRight {

	public static void main(String[] args) {
		//int[] inp = {2,7,4,3,5};
		int[] inp = {1,7,5,9,2,5};
		//System.out.println(Arrays.toString(nextLargerNodes(inp)));
		System.out.println(Arrays.toString(nextLargerNodesMonotone(inp)));
	}

	private static int[] nextLargerNodesMonotone(int[] inp) {
		int size = inp.length;
		int [] result = new int[size];
		Stack<Integer> st = new Stack(); 
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		for(int i : inp) {
			while(!st.isEmpty() && i > st.peek()) {
				mp.put(st.pop(), i);
			}
			st.push(i);
		}
		
		return result;
	}

	public static int[] nextLargerNodes(int[] inp) {
        int[] result = new int[inp.length];
        int size = inp.length - 1;
        int max = inp[size];
        
        for(int i=size; i >= 0; i--) {
        	max = Math.max(max, inp[i]);
        	if(inp[i] != max)
        		result[i] = max;
        }
        
        return result;
    }
}
