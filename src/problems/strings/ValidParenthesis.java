package problems.strings;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		String s = "(())[";
		System.out.println("is Valid ? "+ isValid(s));
	}
	
	public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
	for(Character inp : s.toCharArray()) {
		if(inp == '(') 
			stack.push(')');
		else if(inp == '[')
			stack.push(']');
		else if(inp == '{')
			stack.push('}');
		else if(stack.isEmpty() || inp != stack.pop())
			return false;
		}
		return stack.isEmpty();
    }
	
}
