package revision.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class ReverseListSwapNodes {

	public static void main(String[] args) {
		ListNode head = LinkedListHelper.create1To8List();
		LinkedListHelper.display(head);
		reverseBetween(head, 2, 6);
		LinkedListHelper.display(head);
	}

	public static ListNode reverseBetween(ListNode head, int left, int right) {
		ListNode prev1 = null;
		ListNode prev2 = null;
		ListNode leftNode = null;
		ListNode rightNode = null;
		ListNode cur = head;
		
		while(cur.val != left) {
			prev1 = cur;
			cur = cur.next;
		}
		leftNode = cur;
		while(cur.val != right) {
			prev2 = cur;
			cur = cur.next;
		}
		rightNode = cur;
		
		cur = cur.next;
		prev1.next= rightNode;
		rightNode.next = leftNode.next;
		
		prev2.next= leftNode;
		leftNode.next= cur;
		
        return head;
    }
}
