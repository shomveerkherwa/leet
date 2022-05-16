package problems.arrays;

public class SingleNumber {

	public static void main(String[] args) {
		int[] input = {2,7,2,3,3};
		int result = 0;
		for(int i=0; i<input.length; i++) {
			result = input[i] ^ result;
		}
		System.out.println(result);
	}

}
