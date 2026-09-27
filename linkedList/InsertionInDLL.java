package linkedList;

public class InsertionInDLL {
    public static Node convertArr2DLL(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static Node insertAtHead(Node head, int val) {
        if (head == null) {
            Node temp = new Node(val);
            return temp;
        }
        Node temp = new Node(val, head, null);
        head.back = temp;
        head = temp;
        return head;
    }

    public static Node insertAtTail(Node head, int val) {
        if (head == null) {
            Node temp = new Node(val);
            return temp;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(val, null, temp);
        temp.next = newNode;
        temp = newNode;

        return head;
    }

    public static Node insertAtK(Node head, int k, int val) {
        if (k == 1) {
            return insertAtHead(head, val);
        }
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            if (cnt == k) {
                break;
            }
            temp = temp.next;
        }
        if (temp != null) {
            Node prev = temp.back;
            Node newNode = new Node(val, temp, prev);
            prev.next = newNode;
            temp.back = newNode;

        }
        return head;
    }

    public static void DLLprint(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Node head = convertArr2DLL(arr);
        DLLprint(head);
        int val = 15;
        head = insertAtHead(head, val);
        DLLprint(head);
        val = 20;
        head = insertAtTail(head, val);
        DLLprint(head);
        val = 16;
        int k = 3;
        head = insertAtK(head, k, val);
        DLLprint(head);
    }

}