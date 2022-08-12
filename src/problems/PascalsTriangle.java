package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		int level = 2;
		List<List<Integer>> parentList = generatePascalsTriagleWithLevel(level);
		for(List<Integer> i : parentList) {
			System.out.println(Arrays.toString(i.toArray()));
		}
	}

	private static List<List<Integer>> generatePascalsTriagleWithLevel(int level) {
			List<List<Integer>> parentList = new ArrayList();
			List<Integer> numbers = new ArrayList<Integer>();
			
			if(level > 0) {
				numbers.add(1);
				parentList.add(numbers);
			}
			while(level > 1) {
				int size = numbers.size();
				ArrayList<Integer> tempList = new ArrayList<Integer>();
				tempList.add(1);
				for(int i=0; i< size-1; i++ ) {
					int added = numbers.get(i)+ numbers.get(i+1);
					tempList.add(added);
				}
				tempList.add(1);
				parentList.add(tempList);
				numbers = tempList;
			level--;
		}
		return parentList;
	}
}
