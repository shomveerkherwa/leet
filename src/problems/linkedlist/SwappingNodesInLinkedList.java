package problems.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class SwappingNodesInLinkedList {

	public static void main(String[] args) {
		ListNode head = LinkedListHelper.create1To5List(); int k=4;
		LinkedListHelper.display(head);
		head = swapNodes(head, k);
		LinkedListHelper.display(head);
	}
	
	public static ListNode swapNodes(ListNode head, int k) {
		if(head == null)
			return head;
		
		ListNode slow = head;
		ListNode fast = head;
		ListNode temp = head;
		
		int left = 1;
		while(left < k) {
			slow = slow.next;
			left++;
		}
		left=1;
		
		while(temp.next != null) {
			if(left >= k)
				fast = fast.next;
			left++;
			temp = temp.next;
		}
		
		int tempVal = fast.val;
		fast.val = slow.val;
		slow.val = tempVal;
		
		return head;
    }
}
