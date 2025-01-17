public class triecountuniquesubstring {
    static class Node{
        Node[] children;
        boolean eow;

        public Node(){
            children = new Node[26]; // ato z
            for(int i=0; i<26; i++){
                children[i] = null;
            }
            eow = false;

        }
    }

    static Node root = new Node();

    //insert

    public static void insert(String word){
        Node curr = root;
        
        for(int i =0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';

            if(curr.children[idx]== null){
                //add new node
                curr.children[idx] = new Node();

            }
            if(i== word.length()-1){
                curr.children[idx].eow = true;
            }

            curr = curr.children[idx];
        }


    }



    public static boolean search(String key){
        Node curr = root;
    
        for(int i =0; i<key.length(); i++){   
            int idx = key.charAt(i)-'a';
            Node node = curr.children[idx];

            if(node == null){
                return false;
            }
            if(i == key.length()-1 && curr.children[idx].eow == false){
                return false;
            }

            curr = curr.children[idx];
        }
        return true;
    }

    public static int countNode(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i =0; i<26; i++){
            if(root.children[i] != null){
                count+= countNode(root.children[i]);
            }
        }
        return count;
    }



    public static void main(String args[]){
        String str = "apple";
        for(int i =0; i<str.length(); i++){
            String suffix = str.substring(i);
            //System.out.println(suffix);
            insert(suffix);
        }

        System.out.println(countNode(root));


        
    }
    
}

    

