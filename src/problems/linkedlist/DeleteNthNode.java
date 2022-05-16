package problems.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class DeleteNthNode {

	public static void main(String[] args) {
		ListNode head = LinkedListHelper.create1To5List();
		LinkedListHelper.display(head);
		ListNode nodeToDelete = getNodeToDelete(head, 3);
		removeNode(nodeToDelete);
		LinkedListHelper.display(head);
	}

	private static void removeNode(ListNode node) {
			//override the value of next node to current node
			node.val = node.next.val;
			node.next = node.next.next;
	}

	private static ListNode getNodeToDelete(ListNode head, int value) {
		while(head != null) {
			if(head.val == value) {
				return head;
			}
			head = head.next;
		}
		return null;
	}

}
