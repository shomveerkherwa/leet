package problems.strings;

import java.util.Arrays;
import java.util.Stack;

public class CheckIfStringCanBeValid {

	public static void main(String[] args) {
		String s = "))()))";
		String locked = "010100";
		System.out.println("can Be Valid ? "+ canBeValid(s, locked));
	}

	public static boolean canBeValid(String s, String locked) {
        if(isValid(s)) {
        	return true;
        }
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i< locked.length(); i++) {
        	if(locked.charAt(i) == '0')
			{
				Character inp = s.charAt(i);
				if (inp == '(') {
					sb.setCharAt(i, ')');
				} else {
					sb.setCharAt(i, '(');
				}
				if (isValid(sb.toString())) {
					System.out.println("Valid " + sb.toString());
					return true;
				}
			}
        }
		return false;
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
