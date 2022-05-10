package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import model.TreeNode;
import utility.BinaryTreeHelper;

public class PostOrder {
	public static void main(String[] args) {
		TreeNode root = BinaryTreeHelper.createARandomTree();
		List<Integer> ans = postOrder(root);
		System.out.println(Arrays.toString(ans.toArray()));
	}

	private static List<Integer> postOrder(TreeNode root) {
		Stack<TreeNode> stk1=new Stack<>();
		Stack<TreeNode> stk2=new Stack<>();
		List<Integer> ans=new ArrayList<>();

		        if(root == null)
		            return ans;

		        stk1.push(root);
		        while(!stk1.empty())
		        {
		            root=stk1.pop();
		            stk2.add(root);
		            if(root.left!=null)
		                stk1.push(root.left);
		            if(root.right!=null)
		                stk1.push(root.right);
		        }
		        while(!stk2.empty())
		        {
		            ans.add(stk2.pop().val);
		        }
		    return ans;
		
	}
}
