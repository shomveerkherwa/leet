package problems;

import model.TreeNode;
import utility.BinaryTreeHelper;

public class MaxDepthRecursive {
	private static int max = 0;
	
	public static void main(String[] args) {
		TreeNode root = BinaryTreeHelper.createRightDominatTree();
		int depth = findMaxDepth(root);
		System.out.println(depth);
	}

	private static int findMaxDepth(TreeNode root) {
		if(root == null)
			return 0;
		else {
			return maxDepthRecursive(root);
		}
	}

	private static int maxDepthRecursive(TreeNode root) {
		
		if(root == null)
			return 0;
		
		int left = maxDepthRecursive(root.left);
		int right = maxDepthRecursive(root.right);
		
		return Math.max(left,  right) + 1;
	}

}
