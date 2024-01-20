package twenty23.array;

public class MinimumPenalty {

	public static void main(String[] args) {
		String customers = "YYNY";
		System.out.println("customers : {}"+ customers);
		System.out.println(bestClosingTime(customers));

	}

	public static int bestClosingTime(String customers) {
		int max = 0;
		int sum = 0;
		int hour = 0;
		for(int i=0; i<customers.length(); i++) {
			char c = customers.charAt(i);
			int toAdd = c == 'Y' ? 1 : -1;
			sum = sum +  toAdd;
			if(sum > max) {
				max = sum;
				hour = i;
			}
		}
		
		return hour+1;
	}

}
