package revision.linkedlist;

import model.ListNode;

public class StartOfLinkedListCycle {

	public static void main(String[] args) {
		
	}

	public ListNode detectCycle(ListNode head) {
		if(head == null)
			return null;
		ListNode slow = head; ListNode fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(fast == slow) {
				//1. reset slow to head and move both at 1 step each.
				slow = head;
				while(slow.next != fast.next) {
					slow = slow.next;
					fast = fast.next;
				}
				return slow;
			}
		}
		return null;
	}
}
