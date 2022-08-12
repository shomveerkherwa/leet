package model;

/* 
 * This class represents a node of linked list,
 * it is defined to stay in sync with leetcodes ListNode definition.
 */

public class ListNode {

	public int val;
	public ListNode next;

	public ListNode(int value) {
		this.val = value;
	}

	public ListNode(int value, ListNode next) {
		this.val = value;
		this.next = next;
	}

	public ListNode() {
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}
}
