package revision.tree;

import model.TreeNode;
import utility.BinaryTreeHelper;

public class ReviseTree {
	
	public static void main(String[] args) {
		TreeNode root = BinaryTreeHelper.createARandomTree();
		TreeNode root2 = BinaryTreeHelper.createARandomTree();
		//System.out.println("Max Depth of binary tree "+maxDepth(root));
		//System.out.println("Is root and root1 same Tree ?"+isSameTree(root, root2));
		//BinaryTreeHelper.LevelOrderTraversal(root);System.out.println(); BinaryTreeHelper.LevelOrderTraversal(invertTree(root));
		//TreeNode pathSumRoot = BinaryTreeHelper.createTreeFromArray(new Integer[] {5,4,8,11,null,13,4,7,2,null,null,null,1}, 0);
		//BinaryTreeHelper.LevelOrderTraversal(pathSumRoot); System.out.println("has path to Sum "+22+ " ? "+hasPathSum(pathSumRoot, 22));
		TreeNode sumRootToLeaf = BinaryTreeHelper.createTreeFromArray(new Integer[] {1,2,3}, 0);
		BinaryTreeHelper.LevelOrderTraversal(sumRootToLeaf); System.out.println("has root to leaf Sum "+sumNumbers(sumRootToLeaf));
	}
	
	public static int sumNumbers(TreeNode root) {
		int sum=0;
		if(root == null)
			return sum;
		return sumNumberHelp(root,sum);
    }
	
	public static int sumNumberHelp(TreeNode root, int sum) {
		if(root == null)
			return 0;
		if(root.left == null && root.right == null)
			return sum*10 + root.val;
		return sumNumberHelp(root.left, sum*10 + root.val) + sumNumberHelp(root.right, sum*10 + root.val);
	}

	public static boolean hasPathSum(TreeNode root, int targetSum) {
		if(root == null)
			return false;
		if(root.left == null && root.right==null && targetSum-root.val == 0)
			return true;
		return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);
	}
	
	public static int maxDepth(TreeNode root) {
        if(root==null)
        	return 0;
        int left = 1 + maxDepth(root.left);
        int right = 1 + maxDepth(root.right);
        return Math.max(left, right);
    }
	
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if((p == null && q != null) || (p != null && q==null))
			return false;
		if(p == null && q== null)
			return true;
		if(p.val != q.val)
			return false;
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}
	
	public static TreeNode invertTree(TreeNode root) {
		if(root == null)
			return null;
	
		TreeNode left = root.left;
		TreeNode right = root.right;
		root.left=invertTree(right);
		root.right=invertTree(left);
		return root;
	}
	
}
