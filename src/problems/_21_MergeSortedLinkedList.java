package problems;

import model.ListNode;

public class _21_MergeSortedLinkedList {

	public static void main(String[] args) {
		ListNode one = new ListNode(1);
		ListNode head = one;
		ListNode two = new ListNode(2);
		ListNode four = new ListNode(4);
		one.setNext(two);
		two.setNext(four);
		display(head);
		// 2nd List

		ListNode _2one = new ListNode(1);
		ListNode _2head = _2one;
		ListNode _2three = new ListNode(3);
		ListNode _2four = new ListNode(4);
		_2one.setNext(_2three);
		_2three.setNext(_2four);
		display(_2head);
		ListNode mergedHead = mergeSortedLists(head, _2head);
		display(mergedHead);
	}

	private static ListNode mergeSortedLists(ListNode left, ListNode right) {
		ListNode mergedHead = null;
		ListNode temp = null;

		if (left.val <= right.val) {
			mergedHead = left;
			left = left.next;
		} else {
			mergedHead = right;
			right = right.next;
		}
		temp = mergedHead;

		while (left != null && right != null) {
			if (left.val < right.val) {
				temp.next = left;
				left = left.next;
			} else {
				temp.next = right;
				right = right.next;
			}
			temp = temp.next;
		}
		if (left == null) {
			temp.next = right;
		}

		if (right == null) {
			temp.next = left;
		}

		return mergedHead;
	}

	private static void display(ListNode current) {
		while (current != null) {
			System.out.print(current.getVal() + " -> \t");
			current = current.getNext();
		}
		System.out.println();
	}
}
