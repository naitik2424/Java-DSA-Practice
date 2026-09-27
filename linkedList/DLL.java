package linkedList;
public class DLL {
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
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 13};
        Node head = convertArr2DLL(arr);
        DLLprint(head);
    }
}