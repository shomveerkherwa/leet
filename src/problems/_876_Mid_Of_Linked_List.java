package problems;

import model.ListNode;
import utility.LinkedListHelper;

public class _876_Mid_Of_Linked_List {

	public static void main(String[] args) {
		ListNode head = LinkedListHelper.create1To15List();
		LinkedListHelper.display(head);
		ListNode middleNode = findLinkedListMidNode(head);
		System.out.println(" Middle Node "+ middleNode.getVal());
	}

	private static ListNode findLinkedListMidNode(ListNode head) {
		if(head == null) {
			return null;
		}
		
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

}
