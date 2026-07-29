import java.util.Iterator;
import java.util.LinkedList;
public class Demo{
    public static void main(String[] args){
        LinkedList<String> ls = new LinkedList<String>();
        ls.add("Naitik");
        ls.add("Kumar");
        // System.out.println(ls);
        Iterator<String> list = ls.iterator();
        while(list.hasNext()){
            System.out.print(list.next()+ " ");
        }
    }
}