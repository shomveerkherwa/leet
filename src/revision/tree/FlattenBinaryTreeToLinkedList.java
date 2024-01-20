package revision.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import model.TreeNode;
import utility.BinaryTreeHelper;

public class FlattenBinaryTreeToLinkedList {

	public static void main(String[] args) {
		TreeNode root = BinaryTreeHelper.createTreeFromArray(new Integer[] {1,2,5,3,4,null,6}, 0);
		BinaryTreeHelper.LevelOrderTraversal(root); 
		flatten(root);
		System.out.println();
		BinaryTreeHelper.LevelOrderTraversal(root); 
	}
	
	public static void flatten(TreeNode root) {
		List<TreeNode> preOrder = new ArrayList<>();
		Stack<TreeNode>stack = new Stack<>();
		
		while(root != null || !stack.isEmpty()) {
			while(root != null) {
				preOrder.add(root);
				stack.push(root);
				root = root.left;
			}
			root = stack.pop().right;
		}
		
		for(int i=0; i<preOrder.size()-1;i++) {
			TreeNode node = preOrder.get(i);
			node.left=null;
			node.right=preOrder.get(i+1);
			
		}
	}

}
