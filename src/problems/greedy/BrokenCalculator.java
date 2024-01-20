package problems.greedy;

public class BrokenCalculator {

	public static void main(String[] args) {
		 // int startValue = 2, target = 3; // ans = 2
		// int startValue = 5, target = 8; // ans = 2
		int startValue = 3, target = 10; // ans = 3
		System.out.println(brokenCalc(startValue, target));
	}

	public static int brokenCalc(int startValue, int target) {
		int ops = 0;
		
		while(target != startValue) {
			if(target < startValue) {
				target++;
				ops++;
			} else {
				if(target / 2 > 0 ) {
					target = target/2;
					ops++;
				}else if(target > startValue) {
					target--;
					ops++;
				}
			}
		}
		return ops;
	}

}
