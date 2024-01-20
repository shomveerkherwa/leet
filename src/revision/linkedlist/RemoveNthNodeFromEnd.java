package revision.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class RemoveNthNodeFromEnd {

	public static void main(String[] args) {
		//ListNode head = LinkedListHelper.create1To5List();
		int[] inp = {1};
		ListNode head = LinkedListHelper.createCustomeList(inp);
		LinkedListHelper.display(head);
		head = removeNthFromEnd(head, 1);
		LinkedListHelper.display(head);
	}
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode slow = head;
		ListNode fast = head;
		while(n-- > 0) {
			fast = fast.next;
		}
		if(fast == null) 
			return head.next;
		while(fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;
		return head;
    }
	
	public static ListNode removeNthFromEnd2(ListNode head, int n) {
	     ListNode fast = head, slow = head;
	        for (int i = 0; i < n; i++) fast = fast.next;
	        if (fast == null) return head.next;
	        while (fast.next != null) {
	            fast = fast.next;
	            slow = slow.next;
	        }
	        slow.next = slow.next.next;
	        return head;
	    }
}
