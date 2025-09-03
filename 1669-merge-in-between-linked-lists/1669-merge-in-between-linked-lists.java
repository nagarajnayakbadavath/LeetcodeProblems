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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        int count=0;

        ListNode temp=list1;
        ListNode prev=null;
        while(temp!=null){
            count++;
            prev=temp;
            temp=temp.next;
            if(count==a){
                break;
            }
        }
        while(temp!=null){
            count++;
            temp=temp.next;
            if(count==b+1){
                break;
            }
        }
        ListNode after=temp;
        prev.next=list2;
        while(list2.next!=null){
            list2=list2.next;
        }
        list2.next=after;
        return list1;
    }
}