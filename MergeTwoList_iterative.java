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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if( l1 == null || l2 == null)
            return (l1 == null?l2:l1);
        
        ListNode curl1 = l1;
        ListNode curl2 = l2;
        ListNode head = new ListNode();//Store the first position
        ListNode result = head;//Store the ListNode
        
        if(curl1.val <= curl2.val)
            head = curl1;
        else
            head = curl2;
        
        while(curl1 != null && curl2 != null){
            if(curl1.val <= curl2.val){
                result.next = curl1;
                curl1 = curl1.next;
            }
            else{
                result.next = curl2;
                curl2 = curl2.next;
            }
            result = result.next;
        }
        
        if( curl1 != null)
            result.next = curl1;
        else 
            result.next = curl2;
        
        return head;
}
}
