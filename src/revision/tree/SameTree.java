package revision.tree;

import java.util.LinkedList;
import java.util.Queue;

import model.TreeNode;
import utility.BinaryTreeHelper;

public class SameTree {

	public static void main(String[] args) {
		TreeNode oneRoot = BinaryTreeHelper.createARandomTree();
		TreeNode twoRoot = BinaryTreeHelper.createARandomTree();
		System.out.println("Same Tree ? "+ isSameTree(oneRoot, twoRoot));
	}
	
	// below method wont work because level order traversal ignores nulls. [1,2] and [1,null,2] will be treated equally.
	public static boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> oneList = new LinkedList<TreeNode>();
        Queue<TreeNode> twoList = new LinkedList<TreeNode>();
        
        populateListLevelOrder(oneList, p);
        populateListLevelOrder(twoList, q);
        
        while(!oneList.isEmpty() && !twoList.isEmpty()) {
        	if(oneList.poll().val != twoList.poll().val)
        		return false;
        }
        return true;
    }

	private static void populateListLevelOrder(Queue<TreeNode> queue, TreeNode root) {
		Queue<TreeNode> temp = new LinkedList<TreeNode>();
		temp.offer(root);
		while(!temp.isEmpty()) {
			root = temp.poll();
			queue.offer(root);
			if(root.left != null)
				temp.offer(root.left);
			if(root.right != null)
				temp.offer(root.right);
		}
	}

}
