
// import java.util.*;
// public class Demo{
//     public static void main(String[] args){
//         LinkedList<String> ls = new LinkedList<String>();
//         ls.add("Naitik");
//         ls.add("Kumar");
//         // System.out.println(ls);
//         Iterator<String> list = ls.iterator();
//         while(list.hasNext()){
//             System.out.print(list.next()+ " ");
//         }
//     }
// }
class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}
public class Demo {
    public static void main(String[] args){
        int[] arr = {2,5,6,8};
        Node y =new Node(arr[1]);
        System.out.println(y.data);
    }
}