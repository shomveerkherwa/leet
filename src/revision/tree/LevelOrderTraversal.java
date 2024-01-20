package revision.tree;

import java.util.LinkedList;
import java.util.Queue;

import model.TreeNode;
import utility.BinaryTreeHelper;

public class LevelOrderTraversal {
	public static void main(String[] args) {
		TreeNode root = BinaryTreeHelper.createARandomTree();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			root = queue.poll();
			System.out.print(root.val +" \t");
			if(root.left != null)
				queue.offer(root.left);
			if(root.right != null)
				queue.offer(root.right);
		}
	}
}
