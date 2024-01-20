package revision.tree;

import model.TreeNode;
import utility.BinaryTreeHelper;

public class TreeFromInorderAndPreorderTraversals {

	public static void main(String[] args) {
		int[] preOrder = {3,9,20,15,7};
		int[] inOrder = {9,3,15,20,7};
		TreeNode root = buildTree(preOrder, inOrder);
		BinaryTreeHelper.LevelOrderTraversal(root);
		
	}
	
	public static TreeNode buildTree(int[] preOrder, int[] inOrder) {
        return helper(0, 0, inOrder.length-1, preOrder, inOrder);
    }

	private static TreeNode helper(int preStart, int inStart, int inEnd, int[] preOrder, int[] inOrder) {
		if(preStart > preOrder.length-1 || inStart > inEnd) {
			return null;
		}
		TreeNode root = new TreeNode(preOrder[preStart]);
		int inIndex = 0; // just initializing
		for(int i = inStart; i <= inEnd; i++) { // search for current preorder element in the inorder array
			if(inOrder[i] == preOrder[preStart]) {
				inIndex=i;
			}
		}
		//elements on the left of current element in inorder array , go to the left of root.
		root.left = helper(preStart+1, inStart, inIndex-1, preOrder, inOrder);
		// element on right of current element go to the right
		root.right = helper(preStart+inIndex-inStart+1, inIndex+1,inEnd, preOrder, inOrder);
		
		return root;
	}

}
