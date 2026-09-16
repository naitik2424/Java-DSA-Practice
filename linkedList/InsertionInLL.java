package linkedList;

public class InsertionInLL {
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

    // head insertion
    private static Node insertHead(Node head, int val) {
        Node temp = new Node(val, head);
        return temp;
    }

    // tail insertion
    private static Node insertTail(Node head, int val) {
        if (head == null)
            return new Node(val);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(val);
        return head;
    }

    // insert at position
    private static Node insertPos(Node head, int el, int k) {
        if (head == null) {
            if (k == 1) {
                return new Node(el);
            } else {
                return null;
            }
        }
        if (k == 1) {
            return new Node(el, head);
        }
        Node temp = head;
        int cnt = 0;
        while (temp != null) {
            cnt++;
            if (cnt == k - 1) {
                Node newnode = new Node(el, temp.next);
                temp.next = newnode;
                return head;

            }
            temp = temp.next;
        }
        return head;
    }

    // insert Before Given Value
    private static Node insertBeforeVal(Node head, int el, int val) {
        if (head == null) {
            return null;
        }
        if (head.data == val) {
            return new Node(el, head);
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == val) {
                Node newnode = new Node(el, temp.next);
                temp.next = newnode;
                return head;

            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 5, 8, 7 };
        // int val = 25;
        // int k = 2;
        int el = 22;
        Node head = convertArr2LL(arr);
        // head = insertHead(head, val);
        // head = insertTail(head, val);
        // head = insertPos(head, el, k);
        int val = 7;
        el = 85;
        head = insertBeforeVal(head, el, val);
        printLL(head);
    }

}
