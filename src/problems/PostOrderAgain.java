package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import model.TreeNode;
import utility.BinaryTreeHelper;

public class PostOrderAgain {

	public static void main(String[] args) {
		TreeNode root = BinaryTreeHelper.createARandomTree();
		List<Integer> ans = postOrder(root);
		System.out.println(Arrays.toString(ans.toArray()));
	}

	private static List<Integer> postOrder(TreeNode root) {
		Stack<TreeNode> resultStack = new Stack<>();
		Stack<TreeNode> processingStack = new Stack<>();
		List<Integer> result = new ArrayList<Integer>();
		
		if(root == null) {
			return Collections.EMPTY_LIST;
		}
		
		processingStack.push(root);
		
		while(!processingStack.isEmpty()) {
			root = processingStack.pop();
			resultStack.push(root);
			
			if(root.left != null)
				processingStack.push(root.left);
			
			if(root.right != null)
				processingStack.push(root.right);
			
		}
		
		while(!resultStack.isEmpty())
			result.add(resultStack.pop().val);
		
		return result;
	}

}
