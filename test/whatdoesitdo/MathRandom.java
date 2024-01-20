package whatdoesitdo;

import java.util.Random;

public class MathRandom {

	public static void main(String[] args) {
		int n = 5;
		Random r = new Random();	

		for(int i=0; i<n; i++) {
			int rand = (int)(Math.random() * (n - i)) + i;
			System.out.println(rand);
		}

	}

}
