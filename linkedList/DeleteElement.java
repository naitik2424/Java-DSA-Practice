package linkedList;

public class DeleteElement {
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

    private static void printLL(Node head) {
        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
    }
    // remove Head
    // private static Node removeHead(Node head) {
    // if (head == null)
    // return head;
    // head = head.next;
    // return head;
    // }

    // remove Tail
    // private static Node removeTail(Node head) {
    // if (head == null || head.next == null)
    // return null;
    // Node temp = head;
    // while (temp.next.next != null) {
    // temp = temp.next;
    // }
    // temp.next = null;
    // return head;
    // }

    // Element any position element
    // private static Node deleteK(Node head, int k) {
    // if (head == null)
    // return null;
    // if (k == 1) {
    // head = head.next;
    // return head;
    // }
    // int cnt = 0;
    // Node temp = head;
    // Node prev = null;
    // while (temp != null) {
    // cnt++;
    // if (cnt == k) {
    // prev.next = prev.next.next;
    // break;
    // }
    // prev = temp;
    // temp = temp.next;
    // }
    // return head;
    // }
    private static Node deleteEl(Node head, int el) {
        if (head == null)
            return null;
        if (head.data == el) {
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.data == el) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 5, 8, 7 };
        // int k = 2;
        int el = 5;
        Node head = convertArr2LL(arr);
        // head = removeHead(head);
        // head = removeTail(head);
        // head = deleteK(head, k);
        head = deleteEl(head, el);
        printLL(head);

    }
}
