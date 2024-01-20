package revision.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class PartitionList {

	public static void main(String[] args) {
		ListNode head = LinkedListHelper.createCustomeList(new int[]{1,4,3,2,5,2}); int x = 3;
		LinkedListHelper.display(head);
		partition(head,x);
		LinkedListHelper.display(head);
	}

	public static ListNode partition(ListNode head, int x) {
		ListNode smallHead = new ListNode(-1);
		ListNode bigHead = new ListNode(-1);
		ListNode curr = head;
		ListNode smallTail = smallHead;
		ListNode bigTail = bigHead;
		
		while(curr != null) {
			if(curr.val < x) {
				smallTail.next = curr;
				smallTail = smallTail.next;
			} else {
				bigTail.next = curr;
				bigTail = bigTail.next;
			}
			curr = curr.next;
		}
		smallTail.next=bigHead.next;
		bigTail.next=null;
		return smallHead.next;
	}
}
