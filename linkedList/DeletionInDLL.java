package linkedList;

class Node {
    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}
public class DeletionInDLL {
    // Convert Array to Doubly Linked List
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

    // Delete Head
    static Node deleteHead(Node head) {

        if (head == null || head.next == null) {
            return null;
        }

        head = head.next;
        head.back = null;

        return head;
    }

    // Delete Tail
    static Node deleteTail(Node head) {

        if (head == null || head.next == null) {
            return null;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.back.next = null;

        return head;
    }

    // Delete Kth Element
    static Node deleteKElement(Node head, int k) {

        if (head == null) {
            return null;
        }

        // Delete head
        if (k == 1) {
            return deleteHead(head);
        }

        int cnt = 0;
        Node temp = head;

        while (temp != null) {

            cnt++;

            if (cnt == k) {

                Node prev = temp.back;
                Node front = temp.next;

                prev.next = front;

                if (front != null) {
                    front.back = prev;
                }

                return head;
            }

            temp = temp.next;
        }

        return head;
    }

    static Node  deleteElement(Node head,int ele){
        if(head== null) return null;
        if(head.data == ele){
            head = head.next;
            head.back = null;
        }
        Node temp = head;
        Node prev =head;
        while(temp != null){
            if(temp.data == ele){
                temp=temp.next;
                temp.back = prev;
                prev.next = prev.next.next;
                
            }
            prev = temp;
            temp=temp.next;   
        }
        return head;
    }

    // Print DLL
    public static void DLLprint(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 6, 19,24,56};
        System.out.println("Given Array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Node head = convertArr2DLL(arr);

        // Delete Head
        head = deleteHead(head);
        DLLprint(head);

        // Delete Tail
        head = deleteTail(head);
        DLLprint(head);

        // Delete 2nd Element
        int k = 2;
        head = deleteKElement(head, k);
        DLLprint(head);

        int ele = 19;
        head = deleteElement(head,ele);
        DLLprint(head);
    }
}