package revision.tree;

import model.TreeNode;
import utility.BinaryTreeHelper;

public class MaximumDepthOfBinaryTree {

	public static void main(String[] args) {
		TreeNode root = BinaryTreeHelper.createARandomTree();
		BinaryTreeHelper.LevelOrderTraversal(root);
		System.out.println("Maximm Depth "+maxDepth(root));
	}
	
	public static int maxDepth(TreeNode root) {
        if (root == null)
        	return 0;
        
        int left = 1+maxDepth(root.left);
        int right = 1+maxDepth(root.right);
        
        return Math.max(left, right);
    }

}
