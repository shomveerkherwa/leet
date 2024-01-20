package revision.linkedlist;

import model.ListNode;
import utility.LinkedListHelper;

public class MergeTwoSortedList {

	public static void main(String[] args) {
		int [] num1 = {5};
		int [] num2 = {1,2,4};
		ListNode head1 = LinkedListHelper.createCustomeList(num1);
		ListNode head2 = LinkedListHelper.createCustomeList(num2);
		LinkedListHelper.display(head1);
		LinkedListHelper.display(head2);
		LinkedListHelper.display(mergeTwoLists(head1, head2));
	}
	
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(0);
        ListNode head = temp;
        while(list1 != null && list2 != null) {
        	if(list1.val <= list2.val) {
        		temp.next= list1;
            	list1 = list1.next;
        	} else {
        		temp.next = list2;
        		list2 = list2.next;
        	}
        	temp = temp.next;
        }
        temp.next = list1 == null ? list2 : list1;
        return head.next;
    }
}
