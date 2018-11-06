package easy;


public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ListNode p1 = new ListNode(1);
		head.next = p1;
		ListNode p2 = new ListNode(2);
		p1.next = p2;
		ListNode p3 = new ListNode(3);
		p2.next = p3;
		ListNode p4 = new ListNode(3);
		p3.next = p4;
		p4.next = null;
		ListNode i = deleteDuplicates(head);
		for(;i != null; i = i.next) {
			System.out.println(i.val);
		}
		
	}
	public static ListNode deleteDuplicates(ListNode head) {
		if(head == null) {
			return head;
		}
		ListNode pre = head;
		while(pre.next != null) {
			if(pre.val == pre.next.val) {
				pre.next = pre.next.next;
			}
			else {
				pre = pre.next;
			}
		}
        return head;
    }

}


