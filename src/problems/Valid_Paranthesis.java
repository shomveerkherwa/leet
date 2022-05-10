package problems;

import java.util.Stack;

public class Valid_Paranthesis {

	static final char OPEN_BRAC = '(';
	static final char CLOSE_BRAC = ')';
	static final char OPEN_FLOWER = '{';
	static final char CLOSE_FLOWER = '}';
	static final char OPEN_SQUARE = '[';
	static final char CLOSE_SQUARE = ']';
	
	public static void main(String[] args) {
		String input = "()[]{}";
		boolean result = checkValidtidy(input);
		System.out.println("valid ? "+result);
	}

	private static boolean checkValidtidy(String input) {
		
		if(input == null || input.length() == 0) {
			return false;
		}
		
		Stack<Character> stack = new Stack<Character>();
		char[] inpArray = input.toCharArray();
		
		for(Character c : inpArray) {
			if(c.equals(OPEN_BRAC) || c.equals(OPEN_FLOWER) || c.equals(OPEN_SQUARE)) {
				stack.push(c);
			} else if(! stack.isEmpty()){
				Character peeked = stack.peek();
				if(c.equals(CLOSE_BRAC) && peeked.equals(OPEN_BRAC)) {
					stack.pop();
				}
				else if(c.equals(CLOSE_FLOWER) && peeked.equals(OPEN_FLOWER)) {
					stack.pop();
				}
				else if(c.equals(CLOSE_SQUARE) && peeked.equals(OPEN_SQUARE)) {
					stack.pop();
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
		
		if(stack.isEmpty())
			return true;
		
		return false;
	}

}
