package linkedList;

public class ReverseDLL {
    static Node convertArr2DLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static void DLLprint(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    // public static Node reverse(Node head) {
    // Stack<Integer> stack = new Stack<>();
    // Node temp = head;
    // while (temp != null) {
    // stack.push(temp.data);
    // temp = temp.next;
    // }
    // temp = head;
    // while (temp != null) {
    // temp.data = stack.pop();
    // temp = temp.next;
    // }

    // return head;

    // }
    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            prev = curr.back;
            curr.back = curr.next;
            curr.next = prev;
            curr = curr.back;
        }
        return prev.back;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 13 };
        Node head = convertArr2DLL(arr);
        head = reverse(head);
        DLLprint(head);
    }

}
