package problems.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class ReverseLinkedListCustom {

	public static void main(String[] args) {
		//ListNode head = LinkedListHelper.create1To5List();
		ListNode head = LinkedListHelper.createCustomeList(new int[] {1,2,3});
		//ListNode head = LinkedListHelper.createCustomeList(new int[] {3, 5});
		LinkedListHelper.display(head);
		head = reverseBetween(head, 1, 2);
		LinkedListHelper.display(head);
	}

	 public static ListNode reverseBetween(ListNode head, int left, int right) {
	     
		 if(left == right)
			 return head;
		 
		 int i = 1;
		 ListNode startPrev = null;
		 ListNode start = head;
		 while(i < left) {
			 startPrev = start;
			 start = start.next;
			 i++;
		 }
		 
		 ListNode endNext = null;
		 ListNode end = start;
		 i=left;
		 while(i < right) {
			 end = end.next;
			 endNext = end.next;
			 i++;
		 }
		 
		 ListNode revHead = reverse(start,left, right);
		 
		 if(startPrev != null)
			 startPrev.next = revHead;
		 else
			 head = revHead;
		 
		 if(endNext != null) {
			 while(revHead.next != null)
				 revHead = revHead.next;
			 revHead.next = endNext;
		 }	 
		 return head;
		 
	}

	private static ListNode reverse(ListNode start,int left, int right) {
		ListNode prev = null;
		ListNode next = null;
		while(left <= right && start != null) {
			next = start.next;
			start.next = prev;
			prev = start;
			start = next;
			left++;
		}
		return prev;
	}
}
