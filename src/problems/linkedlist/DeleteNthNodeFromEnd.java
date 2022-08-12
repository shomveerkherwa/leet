package problems.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class DeleteNthNodeFromEnd {

	public static void main(String[] args) {
		ListNode head = LinkedListHelper.create1To8List();
		LinkedListHelper.display(head);
		head = removeNthNodeFromEnd(head, 3);
		LinkedListHelper.display(head);
	}

	//TODO need to add more edge case handling scenarios
	private static ListNode removeNthNodeFromEnd(ListNode head, int n) {
		if(head == null)
			return null;
		
		int size = 0;
		ListNode temp = head;
		
		while(temp != null) {
			size = size + 1;
			temp = temp.next;
		}
		
		ListNode fast = null;
		//maintain a distance of n nodes 
		for(int i=0;i<n;i++) {
			fast = (fast == null) ? head : fast.next;
		}
		ListNode slow = null;
		
		if(fast.next == null)
			slow = head;
		
		while(fast.next != null) {
			fast = fast.next;
			slow = (slow == null) ? head : slow.next;
		}
		
		if(size == n) {
			return slow.next;	
		}else {
			slow.next = slow.next.next;
		}
		return head;
		}

	
}
