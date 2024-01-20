package problems.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class DeleteMiddleOfLinkedListNode {

	public static void main(String[] args) {
		ListNode head = LinkedListHelper.createCustomeList(new int[]{1,2,3,4});
		head = deleteMiddle(head);
		LinkedListHelper.display(head);

	}

	public static ListNode deleteMiddle(ListNode head) {
        if(head == null)
        	return null;
        
        if(head.next == null)
        	return null;
		
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast.next != null) {
        	slow = slow.next;
        	fast = fast.next.next;
        }
        slow.next = slow.next.next;
		return head;
    }
}
