
    import java.util.*;
    public class queuecircular {
        static class Queue{
            static int arr[];
            static int size;
            static int rear = -1;
            static int front = -1;
    
            Queue(int size){
                arr = new int[size];
                this.size = size;
    
            }
    
            public static boolean isEmpty() {
                return rear == -1 && front == -1;
    
            }
            public static boolean isFull(){
                return (rear+1)% size == front;
            }
            
    
            //enqueue ---> add
            public static void add(int data){
                if(isFull()){
                    System.out.println("full queue");
                    return ;
                }
                // 1st element add;
                if(front == -1){
                    front =0;
                }
                
                rear++;
                arr[rear] = data;
            }
    
            //dequeue--0(n) = remove
    
            public static int remove(){
                if(isEmpty()) {
                    System.out.println("empty queue");
                    return -1;
    
                }
    
                int result = arr[front];
                //single element condition
                if(rear == front){
                    rear = front = -1;
                }else{
                    front = (front +1)% size;
                }
                
                return result;
            }
    
            //peek
            public static int peek(){
                if(isEmpty()){
                    System.out.println("empty queue");
                    return -1;
                }
    
                return arr[front];
            }
    
    
        }
        public static void main(String args[]){
            Queue q = new Queue(5);
            q.add(1);
            q.add(2);
            q.add(3);
    
            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            
            }
    
    
        }
        
    }
     
    

