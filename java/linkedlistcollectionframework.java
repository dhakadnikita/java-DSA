import java.util.*;
public class linkedlistcollectionframework {
    public static void main(String args[]){
        LinkedList<String>list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list); 

        list.addFirst("this");
        list.addLast("list");
        System.out.println(list);

        System.out.println(list.size());

        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i) +" -->");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

       // list.remove(2);
       // System.out.println(list);

    }
    
}
