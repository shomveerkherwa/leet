package problems.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class MergeInBetWeenLinkedList {

	public static void main(String[] args) {
		ListNode list1 = LinkedListHelper.create1To8List();
		LinkedListHelper.display(list1);
		ListNode list2 = LinkedListHelper.createCustomeList(new int[] {111,222,333});
		LinkedListHelper.display(list2);
		int a =2; int b = 5;
		list1 = mergeInBetween(list1, a, b, list2); 
		LinkedListHelper.display(list1);
	}

	public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        if(list1 == null || list2 == null)
        	return list1;
        
        int left = 1;
        ListNode slow = list1;
        while(left < a) {
        	slow = slow.next;
            left++;	
        }
        
        ListNode fast = slow;
        while(left <= b) {
        	fast = fast.next;
        	left++;
        }
        
        slow.next = list2;
        
        while(list2.next != null)
        	list2 = list2.next;
        
        list2.next = fast.next;
        
		return list1;
    }
}
