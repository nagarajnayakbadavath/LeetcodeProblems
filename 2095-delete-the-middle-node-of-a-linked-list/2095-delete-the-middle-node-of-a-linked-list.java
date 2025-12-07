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
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // edge case
        if(head==null || head.next==null){
            return null;
        }

        int count=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        int delNodeNum=count/2;
        temp=head;
        int count2=0;
        ListNode curr=temp;
        while(temp!=null){
            curr=temp;
            temp=temp.next;
            count2++;
            if(count2==delNodeNum){
                curr.next=temp.next;
                break;
            }
        }
        return head;
    }
}