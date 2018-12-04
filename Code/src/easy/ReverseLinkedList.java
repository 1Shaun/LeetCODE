package easy;

public class ReverseLinkedList {
	
	public ListNode reverseList(ListNode head) {
	    if (head == null || head.next == null)
	        return head;
	    ListNode p = null;
	    ListNode q = null;
	    while (head != null) {
	        q = head.next;
	        head.next = p;
	        p = head;
	        head = q;
	    }
	    return p;
	}
}	
