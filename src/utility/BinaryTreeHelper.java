package utility;

import java.util.LinkedList;
import java.util.Queue;
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
	
	public static TreeNode testCaseTree() {
		TreeNode five = new TreeNode(5);
		
		//  4 	<----- 2 ----->  5
		TreeNode two = new TreeNode(2, null, five);
		//  6 	<----- 3 ----->  7
		TreeNode three = new TreeNode(3);
		//  2 	<----- 1 -----> 3
		TreeNode one = new TreeNode(1, two, three);
		
		return one;
	}
	
	public static TreeNode createTreeFromArray(Integer[] nums) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		TreeNode root = new TreeNode(nums[0]);
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		int i = 1;
		while (i < nums.length) {
			TreeNode curr = q.remove();
			if (i < nums.length) {
				curr.left = new TreeNode(nums[i++]);
				q.add(curr.left);
			}
			if (i < nums.length) {
				curr.right = new TreeNode(nums[i++]);
				q.add(curr.right);
			}
		}
		return root;
	}
	
	
	public static TreeNode createTreeFromArray(Integer[] arr, int i) {
		    TreeNode root = null;
		    // Base case for recursion
	        if (i < arr.length) {
				if (arr[i] != null)
				{
					root = new TreeNode(arr[i]);
				} else
					return null;
	  
				if(root != null) {
				// insert left child
				root.left = createTreeFromArray(arr, 2 * i + 1);
				// insert right child
				root.right = createTreeFromArray(arr, 2 * i + 2);
				}
	  }
	        return root;
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
	
	public static void LevelOrderTraversal(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			root = queue.poll();
			System.out.print(root.val + " \t");
			if (root.left != null)
				queue.offer(root.left);
			if (root.right != null)
				queue.offer(root.right);
		}
	}
	
}
