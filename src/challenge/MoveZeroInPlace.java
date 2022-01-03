package challenge;

import java.util.Arrays;

public class MoveZeroInPlace {

	public static void main(String[] args) {
		int[] input = {0,1,0,3,12};
		
		int start = -1;
		int zeroPointer = -1;
		System.out.println("input "+Arrays.toString(input));
		for(int i=0; i<=input.length-1;i++) {
			if(input[i] == 0 && zeroPointer == -1 ) {
				start = i;
			}
			
			if(input[i] != 0 && start != -1) {
				input[start] = input[i];
				input[i] = 0;
				start = i;
			}
			
		}
		System.out.println("input "+Arrays.toString(input));
	}

}
