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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        ListNode temp2 = head;
        ArrayList<Integer> al  = new ArrayList<>();
        int count=0;
        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;
            count++;
        }
       Collections.swap(al, k-1, count-k);
        int i=0;
         while(temp2!=null){
           
            temp2.val=al.get(i);
            i++;
           temp2=temp2.next;
        }
        return head;
    }
    // void swap(int i,int j ,ArrayList<Integer> al){
    //     int temp= al.get(i);
    //          al.get(i)=al.get(j);
    //          al.get(j)=temp;
    // }
}