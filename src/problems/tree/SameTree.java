package problems.tree;

import java.util.LinkedList;
import java.util.Queue;

import model.TreeNode;
import utility.BinaryTreeHelper;

public class SameTree {

	public static void main(String[] args) {
		TreeNode root1 = BinaryTreeHelper.createARandomTree();
		TreeNode root2 = BinaryTreeHelper.createARandomTree();
		boolean areSame = isSameTree(root1, root2);
		System.out.println("Are Same ? "+areSame);
		

	}

	public static boolean isSameTree(TreeNode root1, TreeNode root2) {
        if(!nullChecks(root1, root2)) {
        	return false;
        }
        
        Queue<TreeNode> q1 = new LinkedList<TreeNode>();
        Queue<TreeNode> q2 = new LinkedList<TreeNode>();
        
        q1.add(root1);
        q2.add(root2);
        
        while(!q1.isEmpty() && !q2.isEmpty()) {
        	TreeNode from1 = q1.poll();
        	TreeNode from2 = q2.poll();
        	
        	if(from1.val != from2.val )
        		return false;
        	
        	if(!nullChecks(from1, from2)) {
            	return false;
            }
        	
        	addNodesToQ(from1, q1);
        	addNodesToQ(from2, q2);
        }
        return q1.size() == q2.size();
    }

	private static boolean nullChecks(TreeNode root1, TreeNode root2) {
		
		if((root1 == null && root2 == null) || (root1 != null && root2 != null)) {
			return true;
		}
		
        if(root1 == null && root2 != null) {
			return false;
		}
        
        if(root1 != null && root2 == null) {
			return false;
		}
        return true;
	}

	private static void addNodesToQ(TreeNode node, Queue<TreeNode> q) {
		if(node.left != null)
			q.add(node.left);
		if(node.right != null)
			q.add(node.right);
	}
}
