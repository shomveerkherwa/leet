package problems.strings;

import java.util.Stack;

public class RemoveAdjacentDuplicatesInAString {

	public static void main(String[] args) {
		String s = "abbaca";
		System.out.println(removeDuplicates(s));
	}

	public static String removeDuplicates(String s) {
		Stack<Character> st = new Stack();
		
		for(Character c : s.toCharArray()) {
			if(!st.isEmpty() && st.peek() == c)
				st.pop();
			else
				st.push(c);
		}
		
		StringBuilder sb = new StringBuilder();
		while(!st.isEmpty()) {
			sb.append(st.pop());
		}
		
		return sb.reverse().toString();
    }
}
