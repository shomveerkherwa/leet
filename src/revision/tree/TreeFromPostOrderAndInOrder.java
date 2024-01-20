package revision.tree;

import java.util.HashMap;
import java.util.Map;

import model.TreeNode;
import utility.BinaryTreeHelper;

public class TreeFromPostOrderAndInOrder {

	public static void main(String[] args) {
		int[] postOrder = {9,15,7,20,3};
		int[] inOrder = {9,3,15,20,7};
		TreeNode root = buildTree(inOrder, postOrder);
		BinaryTreeHelper.LevelOrderTraversal(root);
	}
	
	public static TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<inorder.length; i++) {
        	map.put(inorder[i], i);
        }
        map.forEach((key,val) -> System.out.println(key +" -> "+val));
        
        return helper(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1, map);
    }

	private static TreeNode helper(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd,
			Map<Integer, Integer> map) {
		if(inStart > inEnd || postStart>postEnd) {
			return null;
		}
		TreeNode root = new TreeNode(postorder[postEnd]);
		int rootIndex = map.get(postorder[postEnd]);
		int leftLen = rootIndex-inStart;
		int rightLen = inEnd-rootIndex;
		root.left = helper(inorder, inStart, rootIndex-1, postorder, postStart, postStart+leftLen-1,map);
		root.right = helper(inorder,rootIndex+1, inEnd, postorder, postEnd-rightLen, postEnd-1, map);
		return root;
	}

}
