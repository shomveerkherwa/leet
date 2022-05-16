package problems.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class DeleteNthNodeFromEnd {

	public static void main(String[] args) {
		ListNode head = LinkedListHelper.create1To8List();
		LinkedListHelper.display(head);
		removeNthNodeFromEnd(head, 3);
		LinkedListHelper.display(head);
	}

	//TODO need to add more edge case handling scenarios
	private static void removeNthNodeFromEnd(ListNode head, int n) {
		
		//imagine n is 3
		// 1, 2 , 3, 4, 5, 6, 7, 8
		// last 3rd node is 6 
		
		ListNode fast=head;
		
		for(int i=0;i<n;i++)
			fast = fast.next;
		
		//now fast pointer is n steps away from head
		
		//begin with slow counter
		ListNode slow = head;
		while(fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		
		//now fast is at the end , and slow is 'n' steps away from the end
		// so skip the slow node, and adjust its next pointer
		slow.next = slow.next.next;
	}

	
}
