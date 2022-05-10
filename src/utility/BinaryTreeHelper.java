package utility;

import java.util.Stack;

import model.TreeNode;

public class BinaryTreeHelper {

	public static TreeNode createARandomTree() {
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		
		TreeNode six = new TreeNode(6);
		TreeNode seven = new TreeNode(7);
		
		//  4 	<----- 2 ----->  5
		TreeNode two = new TreeNode(2, four, five);
		//  6 	<----- 3 ----->  7
		TreeNode three = new TreeNode(3, six, seven);
		//  2 	<----- 1 -----> 3
		TreeNode one = new TreeNode(1, two, three);
		
		return one;
	}
	
	public static TreeNode createRightDominatTree() {
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		
		//  null 	<----- 2 ----->  null
		TreeNode two = new TreeNode(2);
		//  4 	<----- 3 ----->  5
		TreeNode three = new TreeNode(3, four, five);
		//  2 	<----- 1 -----> 3
		TreeNode one = new TreeNode(1, two, three);
		
		return one;
	}
	
	public static void inOrderTraverse(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(root != null || !stack.isEmpty()) {
			while(root != null) {
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			System.out.println(root.val +"\t");
			root = root.right;
		}
	}
	
	public static void preOrderTraverse(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		while(root != null || !stack.isEmpty()) {
			
			while(root != null) {
				System.out.println(root.val);
				stack.push(root);
				root = root.left;
			}
			
			root = stack.pop().right;
			
		}
		
	}

	public static void postOrderTraverse(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		Stack<TreeNode> pathStack = new Stack<TreeNode>();
		
		stack.push(root);
		
		while(root != null && !stack.isEmpty()) {
				root = stack.peek();
				
				if (!pathStack.isEmpty() && pathStack.peek() == root) {
					System.out.println(stack.pop().val);
					pathStack.pop();
				} else {
					pathStack.push(root);
					if (root.right != null)
						stack.push(root.right);
	
					if (root.left != null)
						stack.push(root.left);
				}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
