package problems;

import java.util.TreeMap;

public class _846_Hand_Of_Straights {


	public static void main(String[] args) {
		int[] inp = { 1, 2, 3, 6, 2, 3, 4, 7, 8 };
		int size = 3;
		boolean result = testIfGroupingPossible(inp, size);
		System.out.println(result);
	}

	private static boolean testIfGroupingPossible(int[] inp, int size) {
		TreeMap<Integer, Integer> cards_count = new TreeMap<>();
		// populate the map
		for (int card : inp) {
			if (!cards_count.containsKey(card)) {
				cards_count.put(card, 1);
			} else {
				cards_count.put(card, cards_count.get(card) + 1);
			}
		}
		
		while (cards_count.size() > 0) {
			int first_card = cards_count.firstKey();
			// because we need 3 consecutive cards
			for (int i = first_card; i < first_card + size; i++) {
				if (!cards_count.containsKey(i)) {
					return false; // because the next consecutive number was not found in the map
				} else {
					System.out.print(i+ "\t");
					if (cards_count.get(i) == 1) {
						cards_count.remove(i); // remove if it was the last instance
					} else {
						cards_count.put(i, cards_count.get(i) - 1);
					}
				}
			}
			System.out.println();
		}
		return true;
	}


}
