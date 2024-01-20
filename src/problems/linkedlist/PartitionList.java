package problems.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class PartitionList {

	public static void main(String[] args) {
		//ListNode head = LinkedListHelper.createCustomeList(new int[] {4,3,2,5,2}); int x = 3;
		//ListNode head = LinkedListHelper.createCustomeList(new int[] {2,1}); int x = 2;
		ListNode head = LinkedListHelper.createCustomeList(new int[] {1,4,3,0,2,5,2}); int x = 3;
		LinkedListHelper.display(head);
		head = partition(head, x);
		LinkedListHelper.display(head);
	}
	
	public static ListNode partition(ListNode head, int x) {
        
		if(head == null || head.next == null)
			return head;
		
		ListNode smallHead = new ListNode();
		ListNode bigHead = new ListNode();
		ListNode smallTail = smallHead;
		ListNode bigTail = bigHead;
		
		while(head != null) {
			if(head.val < x) {
				smallTail.next = head;
				smallTail = head;
			} else {
				bigTail.next = head;
				bigTail = head;
			}
			head = head.next;
		}
		
		bigTail.next = null;
        smallTail.next = bigHead.next;
		return smallHead.next;
    }
}
