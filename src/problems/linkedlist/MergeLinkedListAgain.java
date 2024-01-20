package problems.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class MergeLinkedListAgain {

	public static void main(String[] args) {
		ListNode head1 = LinkedListHelper.createRandomSortedList2();
		LinkedListHelper.display(head1);
		ListNode head2 = LinkedListHelper.createRandomSortedList1();
		LinkedListHelper.display(head2);
		ListNode newHead = mergeTwoListsRecursion(head1, head2);
		LinkedListHelper.display(newHead);
	}

	public static ListNode mergeTwoListsRecursion(ListNode list1, ListNode list2) {
		if(list1 == null)
			return list2;
		if(list2 == null)
			return list1;
		
		ListNode handler = null ;
		if(list1.val <= list2.val) {
			handler = list1;
			handler.next = mergeTwoListsRecursion(list1.next, list2);
		} else {
			handler = list2;
			handler.next = mergeTwoListsRecursion(list1, list2.next);
		}
		
		return handler;
	}
	
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null && list2 == null)
			return null;
		if (list2 == null)
			return list1;
		if (list1 == null)
			return list2;
		
		ListNode head = null;
		ListNode handler = new ListNode(0);
		head = handler;
		
		while (list1 != null && list2 != null) {
			if(list1.val <= list2.val) {
				handler.next = list1;
				list1 = list1.next;
			} else {
				handler.next = list2;
				list2 = list2.next;
			}
			handler = handler.next;
		}
		
		if (list1 != null) {
			handler.next = list1;
		} else if (list2 != null) {
			handler.next = list2;
		}

		//because the first node is (0), we added it in first step.
		return head.next;
	}
}
