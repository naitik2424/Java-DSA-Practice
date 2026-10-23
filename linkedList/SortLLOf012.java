
package linkedList;

class SortLLOf012 {

    private static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    public static Node sortList(Node head) {
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;

        Node temp = head;

        // First traversal: count 0s, 1s and 2s
        while (temp != null) {
            if (temp.data == 0) {
                cnt0++;
            } else if (temp.data == 1) {
                cnt1++;
            } else {
                cnt2++;
            }

            temp = temp.next;
        }

        // Second traversal: overwrite node values
        temp = head;

        while (temp != null) {
            if (cnt0 > 0) {
                temp.data = 0;
                cnt0--;
            } else if (cnt1 > 0) {
                temp.data = 1;
                cnt1--;
            } else {
                temp.data = 2;
                cnt2--;
            }

            temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 2, 1};

        Node head = convertArr2LL(arr);
        Node head1 = sortList(head);

        printLL(head1);
    }
}
