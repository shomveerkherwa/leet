package problems;

import java.util.Stack;

public class Evaluate_Polish_Notation {

	public static void main(String[] args) {
		//String[] tokens = {"2","1","+","3","*"}; // 9
		String[] tokens = { "4","13","5","/","+"}; // 6
		int result = evaluateExpression(tokens);
		System.out.println(result);
	}

	private static int evaluateExpression(String[] tokens) {
		Stack<Integer> stack = new Stack<Integer>();
		for(String c : tokens) {
			if (c.equalsIgnoreCase("*") || c.equalsIgnoreCase("/") ||
					c.equalsIgnoreCase("+") || c.equalsIgnoreCase("-")) {
				popAndOperate(c, stack);
			} else {
				stack.push(new Integer(c));
			}
		}
		return stack.pop();
	}

	private static void popAndOperate(String c, Stack<Integer> stack) {
		int op1 = stack.pop();
		int op2 = stack.pop();
		int result = 0;
		switch(c) {
		case "+":
				result = op2 + op1;
				break;
		case "-":
				result = op2 - op1;
				break;
		case "*":
				result = op2 * op1;
				break;
		case "/":
				result = op2 / op1;
				break;
		}
		stack.push(result);
	}
	
}
