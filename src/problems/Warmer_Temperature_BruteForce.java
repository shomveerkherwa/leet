package problems;

import java.util.Arrays;

public class Warmer_Temperature_BruteForce {

	public static void main(String[] args) {
		int[] temperatures = {73,74,75,71,69,72,76,73};
		System.out.println(Arrays.toString(temperatures));
		int[] output = dailyTemperatures(temperatures);
		System.out.println(Arrays.toString(output));
		//[1,1,4,2,1,1,0,0]
	}

	public static int[] dailyTemperatures(int[] temperatures) {
        int[] output = new int[temperatures.length];
        
        for(int i=0; i< temperatures.length; i++) {
        	int nextMax = 0;
        	
        	for(int j = i+1; j< temperatures.length; j++) {
        		if(temperatures[j] > temperatures[i]) {
        			output[i] = ++nextMax;
        			break;
        		}
        		nextMax++;
        	}
        }
        
        return output;
    }
}
