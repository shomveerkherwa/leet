package problems.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class ReOrderList {

	public static void main(String[] args) {
		ListNode head = LinkedListHelper.create1To5List();
		LinkedListHelper.display(head);
		reorderList(head);
		LinkedListHelper.display(head);
	}

	public static  void reorderList(ListNode head) {
		if (head == null || head.next == null)
	          return;
		
		ListNode prev = null, slow = head, fast = head, l1 = head;
		
		//get to the middle of the list
		while (fast != null && fast.next != null) {
	        prev = slow;
	        slow = slow.next;
	        fast = fast.next.next;
	      }
		
		//ideally this is going to be the end
		prev.next = null;
		
		//reverse the second half of list
		ListNode reverseHead = reverse(slow);
		
		// step 3. merge the two halves
	    merge(l1, reverseHead);
	}

	private static void merge(ListNode l1, ListNode reverseHead) {
		ListNode oneNext = null;
		ListNode secondNext = null;
		
		while(l1 != null && reverseHead != null) {
			oneNext = l1.next;
			secondNext = reverseHead.next;
			
			l1.next = reverseHead;
			
			if(oneNext == null)
				break;
			
			reverseHead.next = oneNext;
			
			l1 = oneNext;
			reverseHead = secondNext;
		}
		
		
	}

	private static ListNode reverse(ListNode head) {
		
		if(head == null)
			return head;
		
		ListNode prev = null, next = null, current = head;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
}
