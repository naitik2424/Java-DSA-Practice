// LC21 - Merge Two Sorted Lists
// Pattern: Dummy Node + Two Pointer
// Time: O(n+m), Space: O(1)

class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                curr.next = list1;
                list1 = list1.next;
            }else{
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        if(list1 != null) curr.next = list1;
        if(list2 != null) curr.next = list2;
        return dummy.next;
    }
}

/*
DRY RUN:
list1: 1→2→4
list2: 1→3→4

1<=1 → add list1(1), list1=2
1<2  → add list2(1), list2=3
2<3  → add list1(2), list1=4
3<4  → add list2(3), list2=4
4<=4 → add list1(4), list1=null
list2 bachi → add list2(4)

Output: 1→1→2→3→4→4 ✅
*/