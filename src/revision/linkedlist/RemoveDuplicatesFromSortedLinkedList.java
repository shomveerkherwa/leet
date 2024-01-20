package revision.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class RemoveDuplicatesFromSortedLinkedList {

	public static void main(String[] args) {
		//ListNode head = LinkedListHelper.createCustomeList(new int[]{1,2,3,3,4,4,5});
		//ListNode head = LinkedListHelper.createCustomeList(new int[]{1,2,3,4,5});
		//ListNode head = LinkedListHelper.createCustomeList(new int[]{1,1,1,1,1});
		ListNode head = LinkedListHelper.createCustomeList(new int[]{1,1,1,2,3,4,5});
		//ListNode head = null;
		LinkedListHelper.display(head);
		LinkedListHelper.display(deleteDuplicatesAgain(head));
		
	}
	// READ THOROUGHLY AGAIN
	public static ListNode deleteDuplicatesAgain(ListNode head) {
		ListNode dummy = new ListNode(0);
		dummy.next=head;
		ListNode prev = dummy;
		while(head != null) {
			if(head.next != null && head.val == head.next.val) {
				while(head.next != null && head.val == head.next.val) {
					head=head.next;
				}
				prev.next=head.next;
			} else {
				prev = prev.next;
			}
			head = head.next;
		}
		return dummy.next;
	}
	
}
