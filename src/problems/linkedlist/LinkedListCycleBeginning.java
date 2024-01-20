package problems.linkedlist;

import model.ListNode;

public class LinkedListCycleBeginning {

	public static void main(String[] args) {
		
	}

	public ListNode detectCycle(ListNode head) {
		ListNode cycleStart = null;
		if (head == null)
				return cycleStart;
		
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
				slow = head;
				break;
			}
		}
		
		while(fast != null && fast.next != null) {
			if(slow == fast) {
				return slow;
			}
			slow = slow.next;
			fast = fast.next;
		}
		
		return cycleStart;
    }
}
