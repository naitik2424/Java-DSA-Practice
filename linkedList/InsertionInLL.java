package linkedList;

public class InsertionInLL {

    // Convert Array to Linked List
    private static Node convertArr2LL(int[] arr) {

        if (arr.length == 0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);

            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    // Print Linked List
    private static void printLL(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    // Insert at Head
    private static Node insertHead(Node head, int val) {

        return new Node(val, head);
    }

    // Insert at Tail
    private static Node insertTail(Node head, int val) {

        // Empty Linked List
        if (head == null) {
            return new Node(val);
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(val);

        return head;
    }

    // Insert at Position
    private static Node insertPos(Node head, int el, int k) {

        // Empty Linked List
        if (head == null) {
            if (k == 1) {
                return new Node(el);
            }

            return null;
        }

        // Insert at head
        if (k == 1) {
            return new Node(el, head);
        }

        Node temp = head;
        int cnt = 0;

        while (temp != null) {

            cnt++;

            // Reach (k-1)th node
            if (cnt == k - 1) {

                Node newNode = new Node(el, temp.next);

                temp.next = newNode;

                return head;
            }

            temp = temp.next;
        }

        return head;
    }

    // Insert Before Given Value
    private static Node insertBeforeVal(Node head, int el, int val) {

        // Empty Linked List
        if (head == null) {
            return null;
        }

        // Value is present at head
        if (head.data == val) {
            return new Node(el, head);
        }

        Node temp = head;

        while (temp.next != null) {

            if (temp.next.data == val) {

                Node newNode = new Node(el, temp.next);

                temp.next = newNode;

                return head;
            }

            temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) {

        int[] arr = {12, 5, 8, 7};

        int val = 25;
        int k = 2;
        int el = 22;

        // Convert array to Linked List
        Node head = convertArr2LL(arr);

        // Insert 25 at Head
        head = insertHead(head, val);

        // Insert 25 at Tail
        head = insertTail(head, val);

        // Insert 22 at position 2
        head = insertPos(head, el, k);

        // Insert 85 before value 7
        el = 85;
        head = insertBeforeVal(head, el, 7);

        // Print final Linked List
        printLL(head);
    }
}