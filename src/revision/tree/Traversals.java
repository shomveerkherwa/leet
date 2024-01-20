package revision.tree;

import java.util.Stack;

import model.TreeNode;
import utility.BinaryTreeHelper;

public class Traversals {

	public static void main(String[] args) {
		TreeNode root = BinaryTreeHelper.createARandomTree();
		System.out.print("\n Inorder ");
		inOrderTraversal(root);
		System.out.print("\n PreOrder ");
		preOrderTraversal(root);
		System.out.print("\n PostOrder ");
		postOrderTraversal(root);
	}
	
	private static void postOrderTraversal(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		Stack<TreeNode> pathStack = new Stack<TreeNode>();
		s.push(root);
		
		while(root != null && !s.isEmpty()) {
			root = s.peek();
			if(!pathStack.isEmpty() && root == pathStack.peek()) {
				System.out.println(s.pop());
			} else {
				pathStack.push(root);
				if(root.right != null)
					s.push(root.right);
				if(root.left != null)
					s.push(root.left);
			}
		}
		
	}
	
	private static void preOrderTraversal(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		while(root != null || !s.isEmpty()) {
			while(root != null) {
				System.out.print(root.val+ "\t");
				s.push(root);
				root = root.left;
			}
			root = s.pop().right;
		}
	}
	
	private static void inOrderTraversal(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		while (root != null || !s.isEmpty()) {
			while (root != null) {
				s.push(root);
				root = root.left;
			}
			root = s.pop();
			System.out.print(root.val +"\t");
			root = root.right;	
		}
	}

}
