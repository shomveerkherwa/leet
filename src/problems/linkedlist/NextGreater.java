package problems.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import model.ListNode;
import utility.LinkedListHelper;

public class NextGreater {

	public static void main(String[] args) {
		ListNode head = LinkedListHelper.createCustomeList(new int[] {1,7,5,9,2,5});
		LinkedListHelper.display(head);
		System.out.println(Arrays.toString(nextLargerNodes(head)));
	}

	public static int[] nextLargerNodes(ListNode head) {
		List<Integer> list = new ArrayList<>();
		
		while(head != null) {
			list.add(head.val);
			head = head.next;
		}
		
		int[] result = new int[list.size()];
		
		Stack<Integer> st = new Stack<>();
		
		for (int i = 0; i < list.size(); i++) {
			while(!st.isEmpty() && list.get(i) > list.get(st.peek())) {
				result[st.pop()] = list.get(i);
			}
			st.push(i);
		}
		
		return result;
		
	}
}
