package problems;

import model.TreeNode;
import utility.BinaryTreeHelper;

public class isSymmetric {
	
	public static void main(String[] args) {
		TreeNode root = BinaryTreeHelper.createARandomTree();
		System.out.println(validateEqualDepth(root));
	}

	private static boolean validateEqualDepth(TreeNode root) {
		return (root == null || checkRecursively(root.left, root.right));
	}

	private static boolean checkRecursively(TreeNode left, TreeNode right) {
		
		if(left == null && right == null)
			return true;
		if(left == null || right == null)
			return false;
		if(left.val != right.val)
			return false;
		return ( checkRecursively(left.left, right.right) ||
				 checkRecursively(left.right, right.left));
	}

	
}
