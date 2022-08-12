package problems.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		int[] inp = {1,1,1,2,3,3,3,4,4,5};
		ListNode head = LinkedListHelper.createCustomeList(inp);
		LinkedListHelper.display(head);
		head = deleteDuplicates(head);
		LinkedListHelper.display(head);
	}

	public static ListNode deleteDuplicates(ListNode head) {
		ListNode curr = head;
		while(curr != null) {
			if( (curr.next != null) && (curr.val == curr.next.val) ) {
				curr.next = curr.next.next;
				continue;
			}
			curr = curr.next;
		}
		return head;
    }
}
