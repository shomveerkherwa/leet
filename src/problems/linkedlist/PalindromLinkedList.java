package problems.linkedlist;

import model.ListNode;
import problems.strings.IsPalindrome;
import utility.LinkedListHelper;

public class PalindromLinkedList {

	public static void main(String[] args) {
		ListNode head = LinkedListHelper.createCustomeList(new int[] {1,2,2,1});
		LinkedListHelper.display(head);
		System.out.println(IsPalindrome(head));
	}

	private static boolean IsPalindrome(ListNode head) {
		if(head == null || head.next == null)
			return true;
		
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		System.out.println("mid "+slow.val);
		slow = reverse(slow);
		fast = head;
		
		while(fast != null || slow != null) {
			if(fast.val != slow.val)
				return false;
			slow = slow.next;
			fast = fast.next;
		}
		
		return true;
	}

	private static ListNode reverse(ListNode head) {
		ListNode prev = null;
		ListNode next = null;
		ListNode current = head;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

}
