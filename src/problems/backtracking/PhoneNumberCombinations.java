package problems.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import problems.strings.LetterCombinationsPhoneNumber;

public class PhoneNumberCombinations {

	public static void main(String[] args) {
		String digits = "56";
		List<String> ans = letterCombinations(digits);
		System.out.println(Arrays.toString(ans.toArray()));
	}

	public static List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<String>();
		String[] map = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		backTrack("", digits,map, result);
		return result;
	}

	private static void backTrack(String combination, String digits, String[] map, List<String> result) {
		if(digits.isEmpty()) {
			if(!combination.isEmpty())
				result.add(combination);
		}else {
			String current = map[digits.charAt(0) - '2'];
			for(char c : current.toCharArray()) {
				backTrack(combination+c, digits.substring(1), map, result);
			}
		}
	}

}
