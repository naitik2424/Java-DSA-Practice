// LC141 - Linked List Cycle
// Pattern: Floyd's Cycle Detection (Fast/Slow)
// Time: O(n), Space: O(1)

class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
}

/*
DRY RUN (cycle):
1 → 2 → 3 → 4 → 2

slow=1, fast=1
slow=2, fast=3
slow=3, fast=2
slow=4, fast=4 → MILE! return true ✅

DRY RUN (no cycle):
1 → 2 → 3 → null
fast.next = null → return false ✅
*/