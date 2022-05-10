package utility;

import model.TreeNode;

public class TreeOperations {

	public static void main(String[] args) {
		TreeNode root = BinaryTreeHelper.createARandomTree();
		
		//BinaryTreeHelper.inOrderTraverse(root);
		
		//BinaryTreeHelper.preOrderTraverse(root);
		
		BinaryTreeHelper.postOrderTraverse(root);
	}

}
