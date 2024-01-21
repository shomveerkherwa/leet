package dailycodingchallenge;

import model.TreeNode;

// 21 Jan 2024
public class FloorAndCeilBST {

	// Given a binary search tree, find the floor and ceiling of a given integer. 
	// The floor is the highest element in the tree less than or equal to an integer, 
	// while the ceiling is the lowest element in the tree greater than or equal to an integer.
	public static void main(String[] args) {
		//TreeNode node = BinaryTreeHelper.createARandomTree();
		TreeNode node = new TreeNode(12, new TreeNode(7), new TreeNode(14));
		int inp = 7;
		int ceil = findCeilRecursive(node, inp);
		int floor = findFloorRecursive(node, inp);
		System.out.println("ceil -> "+ceil+"       floor -> "+floor);
	}

	private static int findCeilRecursive(TreeNode node, int inp) {
		if(node == null)
			return -1;
		if(node.val == inp) {
			return node.val;
		}
		if(node.val < inp) {
			return findCeilRecursive(node.right, inp);
		}
		
		int ceil = findCeilRecursive(node.left, inp);
		ceil = ceil <= inp ? ceil : node.val;
		return ceil;
	}
	
	private static int findFloorRecursive(TreeNode node, int inp) {
		if(node == null)
			return -1;
		
		if(node.val == inp) {
			return node.val;
		}
		
		if(node.val > inp) {
			return findFloorRecursive(node.left, inp);
		}
		int floor = findFloorRecursive(node.right, inp);
		// check base case
		floor = (floor <= inp && floor != -1) ? floor : node.val;

		return floor;
	}
}
