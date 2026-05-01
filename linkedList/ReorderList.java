// LC143 - Reorder List
// Pattern: Find Middle + Reverse + Merge
// Time: O(n), Space: O(1)

class ReorderList {
    public void reorderList(ListNode head) {
        // Step 1: Middle dhundho
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Second half alag karo aur reverse karo
        ListNode second = slow.next;
        slow.next = null;
        ListNode prev = null, curr = second;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Merge karo
        ListNode first = head;
        second = prev;
        while(second != null){
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;
            first.next = second;
            second.next = tmp1;
            first = tmp1;
            second = tmp2;
        }
    }
}

/*
DRY RUN:
Input: 1→2→3→4→5

Step 1: slow=3 (middle)
Step 2: second=4→5, slow.next=null
        Reverse: 5→4→null
Step 3: Merge 1→2→3 and 5→4
        1→5→2→4→3 ✅
*/