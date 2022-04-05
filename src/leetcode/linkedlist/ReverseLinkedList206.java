package leetcode.linkedlist;


public class ReverseLinkedList206 {
	public ListNode reverseList(ListNode head) {
		ListNode node = null;
        while(head != null) {
            ListNode temp = head;
            head = head.next;
            temp.next = node;
            node = temp;
        }
        return node;

	}

}
