package problems;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Warmer_Temperature_MonotonicStack {

	public static void main(String[] args) {
		int[] temperatures = {73,74,75,71,69,72,76,73};
		System.out.println(Arrays.toString(temperatures));
		int[] output = dailyTemperatures(temperatures);
		System.out.println(Arrays.toString(output));
		//[1,1,4,2,1,1,0,0]

	}
	
	public static int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<Integer>();
        
        for(int currentDay = 0; currentDay < temperatures.length; currentDay++) {
        	while(!stack.isEmpty() && temperatures[currentDay] > temperatures[stack.peek()]) {
        		int prevDay = stack.pop();
        		answer[prevDay] = currentDay - prevDay;
        	}
        	stack.push(currentDay);
        }
        return answer;
    }
}
