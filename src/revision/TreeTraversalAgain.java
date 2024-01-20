package revision;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import model.TreeNode;
import utility.BinaryTreeHelper;

public class TreeTraversalAgain {

	public static void main(String[] args) {
		TreeNode root = BinaryTreeHelper.createARandomTree();
		//inOrder(root);
		preOrder(root);
		
	}

	private static void preOrder(TreeNode root) {
		Stack<TreeNode> s = new Stack<>();
		while(!s.isEmpty() || root != null) {
			while(root != null) {
				System.out.println(root.val);
				s.push(root);
				root = root.left;
			}
			root = s.pop().right;
		}
	}

	private static void inOrder(TreeNode root) {
		Stack<TreeNode> s = new Stack<>();
		
		while(!s.isEmpty() || root != null) {
			while(root != null) {
				s.push(root);
				root = root.left;
			}
			if(root == null && !s.isEmpty())
				root = s.pop();
			System.out.print(root.val+ "\t");
			root = root.right;
		}
		
	}

}
