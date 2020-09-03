package problems;

public class _167_Two_Summ_2 {

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
		for (int i = 0; i < indicies.length - 1; i++) {
			// can add a check if inp[i] > target, then break because there is no point in
			// checking furthur.
			for (int j = i + 1; j < indicies.length; j++) {
				if (inp[i] + inp[j] == target) {
					indicies[0] = i;
					indicies[1] = j;
				}
			}
		}
		return indicies;
	}

}
