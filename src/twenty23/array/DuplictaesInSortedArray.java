package twenty23.array;

import java.util.Arrays;

public class DuplictaesInSortedArray {

	public static void main(String[] args) {
		int[] array = {0,0,1,1,1,2,2,3,3,4};
		
		System.out.println(Arrays.toString(array));
		
		for(int i=0,j=0; j<array.length; j++) {
			if(array[i] != array[j]) {
				array[++i]=array[j];
			} 
		}

		System.out.println(Arrays.toString(array));
		
	}

}
