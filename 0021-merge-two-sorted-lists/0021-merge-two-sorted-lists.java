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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null)
            return null;
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        ListNode c1=list1,c2=list2;
        while(c1!=null && c2!=null){
            if(c1.val>c2.val){
                temp.next=c2;
                c2=c2.next;
            }
            else{
                temp.next=c1;
                c1=c1.next;
            }
            temp=temp.next;
        }
        if(c1!=null){
            temp.next=c1;
        }
        else
            temp.next=c2;
        return dummy.next;
    }
}