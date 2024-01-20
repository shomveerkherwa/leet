package revision.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class ReverseLinkedList2 {

	public static void main(String[] args) {
		//ListNode head = LinkedListHelper.create1To8List();
		ListNode head = new ListNode(5, new ListNode(6));
		LinkedListHelper.display(head);
		reverseBetween(head, 1, 2);
		LinkedListHelper.display(head);
	}
	
	private static void reverseBetweenAgain(ListNode head, int left, int right) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		// first part 
		ListNode cur1 = dummy;
		ListNode pre1 = null;
		for(int i=0; i<left; i++) {
			pre1 = cur1;
			cur1 = cur1.next;
		}
		
		// reverse
		ListNode cur2 = cur1;
		ListNode pre2 = pre1;
		ListNode next = null;
		for(int i=left; i<=right;i++) {
			next = cur2.next;
			cur2.next= pre2;
			pre2 = cur2;
			cur2 = next;
		}
		
		//connect
		pre1.next = pre2;
		cur1.next = cur2;
		
	}

	private static void reverseBetween(ListNode head, int left, int right) {
		ListNode prev1 = null;
		ListNode next = null;
		ListNode curr = head;
		int i=1;
		while(i < left) {
			prev1 = curr;
			curr = curr.next;
			i++;
		}
		
		ListNode end1 = curr;
		
		ListNode prev2 = null;
		while(i < right) {
			next = curr.next;
			curr.next = prev2;
			prev2 = curr;
			curr = next;
			i++;
		}
		ListNode end2 = curr;
		if(prev1 != null)
			prev1.next = curr;
		end1.next = curr.next;
		curr.next = prev2;
		
	}

}
