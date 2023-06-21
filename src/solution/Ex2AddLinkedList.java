package solution;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class Ex2AddLinkedList {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	 	int carry=0;
		ListNode temp= new ListNode(),head=temp;
		while(l1!=null || l2!=null) {
			int sum= carry;
			if(l1!=null) {
				sum+=l1.val;
				l1=l1.next;	
			}		

			if(l2!=null) {
				sum+=l2.val;
				l2=l2.next;	
			}
			head.next=new ListNode(sum%10);
			head=head.next;
            carry=sum/10;
		}
		if(carry!=0){
				head.next=new ListNode(carry,null);
		}
		return temgip.next;        
	 
	}
}
