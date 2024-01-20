package revision;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import model.TreeNode;
import utility.BinaryTreeHelper;

public class TreeTraversal {

	public static void main(String[] args) {
		TreeNode root = BinaryTreeHelper.createARandomTree();
		// in other words this is breadth first search.
		//levelOrderTraversal(root);
		
		//in order traversal
		//inOrderTraversal(root);
		
		// pred-order traversal
		//preOrderTraversal(root);
		
		//postorder traversal
		postOrderTraversal(root);
		BinaryTreeHelper.postOrderTraverse(root);
	}

	private static void postOrderTraversal(TreeNode root) {
		System.out.println("post-order Traversal");
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(root != null || !stack.isEmpty()) {
			while(root != null) {
				stack.push(root);
				if(root.right != null) {
					stack.push(root.right);
				}
				root = root.left;
			}
			// only hope , get what we added and decide your next action
			root = stack.pop();
			if(root.right != null && !stack.isEmpty() && root.right == stack.peek()) {
				stack.pop( );
                stack.push( root );
                root = root.right;
			} else {
				System.out.print(root.val+" ");
                root = null;
			}
		}
	}

	private static void preOrderTraversal(TreeNode root) {
		System.out.println("Pre-Order Traversal");
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

	private static void inOrderTraversal(TreeNode root) {
		System.out.println("In-Order Traversal");
		// the idea is to get to the left most node , so keep adding all the left nodes 
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while(root != null || !stack.isEmpty()) {
			while(root != null) {
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			System.out.println(root.val);
			root = root.right;
		}
		
	}

	private static void levelOrderTraversal(TreeNode root) {
		System.out.println("Level Order Traversal");
		if(root == null)
			return ;
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();
			q.add(root);
			while(!q.isEmpty()) {
				TreeNode temp = q.poll();
				if(temp.left != null)
					q.add(temp.left);
				if(temp.right != null)
					q.add(temp.right);
				System.out.println(temp.val);
			}
	}

}
