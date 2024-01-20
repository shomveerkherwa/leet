package problems.tree;

import java.util.LinkedList;
import java.util.List;

import model.TreeNode;
import utility.BinaryTreeHelper;

public class PathSum2 {

	public static void main(String[] args) {
		TreeNode root = BinaryTreeHelper.createARandomTree();
		int target = 8;
		List<List<Integer>> result = pathSum(root, target);
	}

	public static List<List<Integer>> pathSum(TreeNode root, int sum){
		List<List<Integer>> result  = new LinkedList<List<Integer>>();
		List<Integer> currentResult  = new LinkedList<Integer>();
		//pathSum(root,sum,currentResult,result);
		pathSumOwn(root, sum, currentResult, result);
		return result;
	}

	private static void pathSumOwn(TreeNode root, int sum, List<Integer> currentResult, List<List<Integer>> result) {
		if(root == null)
			return;
		currentResult.add(root.val);
		if(root.left == null && root.right == null && sum-root.val == 0) {
			result.add(new LinkedList<Integer>(currentResult));
			currentResult.remove(currentResult.size() - 1);
			return;
		} else {
			pathSum(root.left, sum-root.val, currentResult, result);
			pathSum(root.right, sum-root.val, currentResult, result);
		}
		currentResult.remove(currentResult.size() - 1);
	}

	public static void pathSum(TreeNode root, int sum, List<Integer> currentResult,
			List<List<Integer>> result) {

		if (root == null)
			return;
		currentResult.add(new Integer(root.val));
		if (root.left == null && root.right == null && sum == root.val) {
			result.add(new LinkedList(currentResult));
			currentResult.remove(currentResult.size() - 1);//don't forget to remove the last integer
			return;
		} else {
			pathSum(root.left, sum - root.val, currentResult, result);
			pathSum(root.right, sum - root.val, currentResult, result);
		}
		currentResult.remove(currentResult.size() - 1);
	}
	
}
