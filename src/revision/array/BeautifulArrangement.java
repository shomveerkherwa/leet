package revision.array;

public class BeautifulArrangement {

	public static void main(String[] args) {
		int[] customers = { 1, 0, 1, 2, 1, 1, 7, 5 };
		int[] grumpy = { 0, 1, 0, 1, 0, 1, 0, 1 };
		int minutes = 3;
		System.out.println(maxSatisfied(customers, grumpy, minutes));
	}

	// 0 is when owner is not grumpy
	public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
		int total = 0;
		int size = customers.length;
		int nonGrumpyServed = 0;
		
		// 1. first count the number of customers that will be any ways served without and special needs
		for(int i=0; i< size; i++) {
			if(grumpy[i] != 1) {
				nonGrumpyServed +=customers[i];
			}
		}
		
		// 2. if power minutes are used initially , how many customers will be served?
		int bonus = 0;
		for(int i=0; i< minutes; i++) {
			if(grumpy[i] == 1) {
				bonus += customers[i];
			}
		}
		
		// 3. slid the window till end and check where the max bonus is available;
		int left =0;
		int right = minutes;
		int currentBonus = bonus;
		while(right < size) {
			if(grumpy[left] == 1) {
				currentBonus -= customers[left];
			}
			left++;
			if(grumpy[right] == 1) {
				currentBonus += customers[right];
			}
			right++;
			bonus = Math.max(currentBonus, bonus);
		}
		
		return total = nonGrumpyServed + bonus;
	}

}
