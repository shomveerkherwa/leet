package problems.tree;

import java.util.ArrayList;
import java.util.List;

import model.TreeNode;
import utility.BinaryTreeHelper;

public class BinaryTreePaths {

	public static void main(String[] args) {
		//TreeNode root = BinaryTreeHelper.createARandomTree();
		TreeNode root = BinaryTreeHelper.testCaseTree();
		List<String> result = binaryTreePaths(root);
		result.stream().forEach(e -> System.out.println(e));
	}

	public static List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        paths(result,root, path);
        return result;
    }

	private static void paths(List<String> result, TreeNode root,  List<Integer> path ) {
		if(root.left == null && root.right == null) {
			StringBuilder sb = new StringBuilder();
			if (path.size() != 0) {
				for(int i : path)
					sb.append(i+" ->");
				sb.append(root.val);
				result.add(sb.toString());
			}else {
				result.add(String.valueOf(root.val));
			}
			return;
		}
		path.add(root.val);
		if (root.left != null) {
			paths(result, root.left, path);
		}
		if (root.right != null) {
			paths(result, root.right, path);
		}
		path.remove(path.size() - 1);
		System.out.println("something");
	}
}
