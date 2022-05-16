package problems.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		ListNode head1 = LinkedListHelper.createRandomSortedList2();
		LinkedListHelper.display(head1);
		ListNode head2 = LinkedListHelper.createRandomSortedList1();
		LinkedListHelper.display(head2);
		ListNode newHead = mergeLists(head1, head2);
		LinkedListHelper.display(newHead);
	}

	private static ListNode mergeLists(ListNode head1, ListNode head2) {
		ListNode first = head1;
		ListNode second = head2;
		ListNode newHead = null;
		ListNode returnHead = null;
		
		if(first.val <= second.val) {
			newHead = first;
			first = first.next;
		} else {
			newHead = second;
			second = second.next;
		}
		returnHead = newHead;
		while(first != null || second != null) {
			if(first != null && second != null) {
				if(first.val <= second.val) {
					newHead.next = first;
					newHead = first;
					first = first.next;
				}else {
					newHead.next = second;
					newHead = second;
					second = second.next;
				}
			}
			
			if(first == null) {
				while(second != null) {
					newHead.next = second;
					newHead = second;
					second = second.next;
				}
			}
			
			if(second == null) {
				while(first != null) {
					newHead.next = first;
					newHead = first;
					first = first.next;
				}
			}
		}
		return returnHead;
	}

}
