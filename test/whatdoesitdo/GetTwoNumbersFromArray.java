package whatdoesitdo;

public class GetTwoNumbersFromArray {

	public static void main(String[] args) {
		int nums[] = {3,3,4,4,6,4};
		
		int diff = 0;
		
		for(int i : nums)
			diff = diff ^ i;
		
		System.out.println(diff);

		int firstSet = diff & -diff;
		
		System.out.println(firstSet);
		
		for(int i : nums)
			System.out.println(i ^ firstSet);
		
	}

}
