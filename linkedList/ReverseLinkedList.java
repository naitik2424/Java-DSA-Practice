// LC206 - Reverse Linked List
// Pattern: Two Pointer (prev, curr)
// Time: O(n), Space: O(1)

class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while(curr != null){
            next = curr.next;      // Step 1: next save karo
            curr.next = prev;      // Step 2: arrow ulta karo
            prev = curr;           // Step 3: prev aage
            curr = next;           // Step 4: curr aage
        }
        return prev;
    }
}

/*
DRY RUN:
1 → 2 → 3 → null

prev=null, curr=1
Iter 1: next=2, 1.next=null, prev=1, curr=2
Iter 2: next=3, 2.next=1,   prev=2, curr=3
Iter 3: next=null, 3.next=2, prev=3, curr=null

return prev = 3
Output: 3 → 2 → 1 → null ✅
*/