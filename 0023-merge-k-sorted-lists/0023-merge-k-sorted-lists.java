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
    public ListNode merge(ListNode l1,ListNode l2){
        if(l1==null && l2==null) return null;
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(l1!=null && l2!=null){
            if(l1.val>l2.val){
                temp.next=l2;
                l2=l2.next;
            }
            else{
                temp.next=l1;
                l1=l1.next;
            }
            temp=temp.next;
        }
        if(l1!=null)
            temp.next=l1;
        else
            temp.next=l2;
        return dummy.next;
            
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0) return null;
        ListNode result=lists[0];
        for(int i=1;i<lists.length;i++){
            result=merge(result,lists[i]);
        }
        return result;
    }
}