package revision.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class CycleInLinkedList {

	public static void main(String[] args) {
		ListNode head = LinkedListHelper.create1To8List();
		LinkedListHelper.display(head);
		System.out.println(detectCycle(head));
	}

	private static boolean detectCycle(ListNode head) {
		
		if(head == null)
			return false;
		
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast)
				return true;
		}
		
		return false;
	}

}
