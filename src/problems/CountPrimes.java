package problems;

public class CountPrimes {

	public static void main(String[] args) {
		int n = 20;
		int count = countPrimes(n);
		System.out.println("Total prime numbers until "+ n +" is "+count);
	}

	private static int countPrimes(int n) {
		boolean[] primes = new boolean[n];
		int count = 0;
		int upper = (int) Math.sqrt(n);
		for(int i = 2; i < upper; i++) {
			if(primes[i] == false) {
				count++;
				for(int j = i; j < upper; j++) {
					primes[i*j] = true;
				}
			}
		}
		
		for(int i = 2; i< upper; i++) {
			if(primes[i] == false) {
				System.out.println(i+ "\t");
			}
		}
		return count;
	}

}
