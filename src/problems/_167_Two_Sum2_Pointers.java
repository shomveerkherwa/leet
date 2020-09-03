package problems;

public class _167_Two_Sum2_Pointers {


	public static void main(String[] args) {

		int[] inp = { 2, 7, 11, 15 };
		int target = 9;
		int[] indicies = getIndiciesThatSumUpToTarget(inp, target);
		if (indicies[0] != -1) {
			System.out.println(target + "-> " + inp[indicies[0]] + " + " + inp[indicies[1]]);
		} else {
			System.out.println("-1");
		}
	}

	private static int[] getIndiciesThatSumUpToTarget(int[] inp, int target) {
		int[] indicies = { -1, -1 };
		int left = 0;
		int right = inp.length-1;
		
		while(left < right) {
			int currentSum = inp[left]+inp[right];
			if(currentSum == target) {
				indicies[0] = left;
				indicies[1] = right;
				return indicies;
			}
			if(currentSum < target) {
				left +=1;
			} else if( currentSum > target) {
				right -=1;;
			} 
		}
		return indicies;
	}


}
