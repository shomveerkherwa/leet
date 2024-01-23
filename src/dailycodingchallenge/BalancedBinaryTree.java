package dailycodingchallenge;

import model.TreeNode;
import utility.BinaryTreeHelper;

// 23 Jan 2023
// Given a binary tree, determine whether or not it is height-balanced.
// A height-balanced binary tree can be defined as one in which the heights of the two subtrees of any node never differ by more than one.
public class BalancedBinaryTree {

	public static void main(String[] args) {
		//TreeNode root = BinaryTreeHelper.createARandomTree();
		//TreeNode root = BinaryTreeHelper.createTreeFromArray(new Integer[] {3,9,20,null,null,15,7}, 0);
		TreeNode root = BinaryTreeHelper.createTreeFromArray(new Integer[] {1,2,2,3,null,null,3,4,null,null,4}, 0);
		
		BinaryTreeHelper.LevelOrderTraversal(root);
		System.out.println(isBalanced(root));
	}

	public static boolean isBalanced(TreeNode root) {
		int height = isDFS(root );
		return height != -1;
	}

	private static int isDFS(TreeNode root) {
		System.out.println(root);
		if(root == null)
			return 0;
		
		int leftHeight = isDFS(root.left);
		if(leftHeight == -1)
			return -1;
		int rightHeight = isDFS(root.right);
		if(rightHeight == -1)
			return -1;
		if(Math.abs(rightHeight - leftHeight) > 1)
			return -1;
		return Math.max(leftHeight, rightHeight)+1;
	}

}
