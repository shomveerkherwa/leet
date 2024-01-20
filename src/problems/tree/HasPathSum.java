package problems.tree;

import model.TreeNode;
import utility.BinaryTreeHelper;

public class HasPathSum {

	public static void main(String[] args) {
		
		TreeNode root = BinaryTreeHelper.createARandomTree();
		int target = 8;
		System.out.println(hasPathSum(root, target));
		
	}

	public static boolean hasPathSum(TreeNode root, int targetSum) {
        
		if(root == null)
			return false;
		
		if(root.left == null && root.right == null && (targetSum-root.val == 0))
			return true;
		
		
		return	hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);
		
    }
}
