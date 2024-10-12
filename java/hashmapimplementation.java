import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class hashmapimplementation {
    static class HashMap<K,V>{
        private class Node {
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n; //n - nodes
        private int N;  //N - buclets
        private LinkedList<Node> buckets[];  //N = buckets.length

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i =0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){//0 to N-1
            int bi = key.hashCode();
            return Math.abs(bi)% N;

        }

        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];

            for(int i =0; i<ll.size(); i++){
                if(ll.get(i).key == key){
                    return i ; // di
                }
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node> oldBucLinkedList[] = buckets;
            buckets = new LinkedList(N*2);

            for(int i = 0; i<N*2; i++){
                buckets[i] = new LinkedList<>();
            }
            for(int i=0; i<oldBucLinkedList.length; i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j =0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key,node.value);
                }
            }
        }



        public void put(K key, V value ){
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);//di = -1;

            if(di== -1){
                buckets[bi].add(new Node(key,value));
                n++;
            }else{
                Node data =  buckets[bi].get(di);
                data.value = value;
            }

            double lambda = (double)n/N;
            if(lambda > 2.0){
                rehash();
            }

        }



        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);//di = -1;

            if(di== -1){//key not exist
                return false;
            }else{//key exist
                return true;
            }
        }



        public V remove(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);//di = -1;

            if(di== -1){ // key doesnot exist
                return null;
            }else{ //key exists
                Node data =  buckets[bi].get(di);
                n--;
                return node.value ;
            }
        }

        public V get(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);//di = -1;

            if(di== -1){//key doesnot exist
                return null;
            }else{  // key exists
                Node data =  buckets[bi].get(di);
                return node.value;
            }
        
        }
        public ArrayList<K>keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0; i<buckets.length; i++){
                LinkedList<Node> ll = bucket[i];
                for(int j =0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    key.add(node.key);

                 }


            }

            return keys;
            
        }

        public boolean isEmpty(){
            return n == 0;
        }
    }

        public static void main(String [] args){
            HashMap<String, Integer> map = new HashMap<>();
            map.put(key:"India", value: 190);
            map.put(key:"China", value:200);
            map.put(key:"US", value:50);

            ArrayList<String> keys = map.keySet();
            for(int i =0; i <keys.size(); i++){
                System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
            }

        }
    }
        

    

