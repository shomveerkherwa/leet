package revision.tree;

import model.TreeNode;
import utility.BinaryTreeHelper;

public class SubTree {

	public static void main(String[] args) {
		TreeNode root = BinaryTreeHelper.createTreeFromArray(new Integer[] { 1, null, 1, null, 1, null, 1, null, 1,
				null, 1, null, 1, null, 1, null, 1, null, 1, null, 1, 2 }, 0);
		TreeNode subRoot = BinaryTreeHelper.createTreeFromArray(
				new Integer[] { 1, null, 1, null, 1, null, 1, null, 1, null, 1, 2 }, 0);
		System.out.println(isSubtree(root, subRoot));
	}

	public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
		if (root == null && subRoot == null)
			return true;
		if (isSubTreeHelp(root, subRoot))
			return true;
		return isSubTreeHelp(root.left, subRoot) || isSubTreeHelp(root.right, subRoot);

	}

	private static boolean isSubTreeHelp(TreeNode root, TreeNode subRoot) {
		if (root == null && subRoot == null) {
			return true;
		}
		if (root == null || subRoot == null) {
			return false;
		}
		if (root.val != subRoot.val) {
			return false;
		}
		return isSubTreeHelp(root.left, subRoot.left) && isSubTreeHelp(root.right, subRoot.right);
	}

}
