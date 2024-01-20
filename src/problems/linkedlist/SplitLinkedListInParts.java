package problems.linkedlist;

import java.util.ArrayList;
import java.util.List;

import model.ListNode;
import utility.LinkedListHelper;

public class SplitLinkedListInParts {

	public static void main(String[] args) {
		ListNode head = LinkedListHelper.createCustomeList(new int[] {1,2,3,4,5,6,7,8,9,10});
		int k = 4;
		ListNode[] result = splitListToParts(head, k);
		for(ListNode i : result) {
			LinkedListHelper.display(i);
		}
	}

	public static ListNode[] splitListToParts(ListNode head, int k) {
		ListNode[] arrayResult = new ListNode[k];
		ListNode temp = head;
		int size = 0;
		
		while(temp != null) {
			size++;
			temp = temp.next;
		}
		
		int listLength = size / k;
		int extra = size % k;
		
		ListNode prev = null;
		int arryPointer = 0;
		while( head != null && k > 0) {
			arrayResult[arryPointer++] = head;
			for(int i=0; i < listLength + (extra > 0 ? 1 : 0); i++) {
				prev = head;
				head = head.next;
			}
			prev.next= null;
			k--;
			extra--;
		}
		return arrayResult;
	}
}
