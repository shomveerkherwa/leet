package revision.tree;

import model.TreeNode;
import utility.BinaryTreeHelper;

public class SymmetricTree {

	public static void main(String[] args) {
		TreeNode root = BinaryTreeHelper.createTreeFromArray(new Integer[] {1,2,2,3,4,4,3}, 0);
		BinaryTreeHelper.LevelOrderTraversal(root);
		System.out.println("is Symmetric Tree? "+isSymmetric(root));
	}
	
	public static boolean isSymmetric(TreeNode root) {
		return(root == null || isSymmetricHelp(root.left, root.right));
	}

	private static boolean isSymmetricHelp(TreeNode left, TreeNode right) {
		if(left == null || right == null)
			return left == right;
		if(left.val != right.val)
			return false;
		return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
	}

}
