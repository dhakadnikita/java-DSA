import java.util.ArrayDeque;
import java.util.Queue;
import java.util.*;

public class queueshortcode {
     public static void main(String args[]){
       // Queue q = new Queue();
      // Queue<Integer> q= new Linkedlist<>();
        Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        
        }

    
}
}
