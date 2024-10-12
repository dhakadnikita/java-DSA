import java.util.ArrayList;

public class binarysearchinrange {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }

    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            //left subtree
            root.left = insert(root.left,val);
        }

        else{
            root.right = insert(root.right,val);

        }

        return root;

    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    // print in range

    public static void printInRange(Node root,int X,int Y){
        if(root == null){
            return ;
        }

        if(root.data >= X && root.data <= Y){
            printInRange(root.left, X, Y);
            System.out.print(root.data+" ");
            printInRange(root.right, X, Y);
        }
        else if(root.data >= Y){
            printInRange(root.left, X, Y);
        }
        else{
            printInRange(root.right, X, Y);
        }
    }

    // root 2 leaf path

    public static void printPath(ArrayList<Integer>path){
        for(int i = 0; i<path.size(); i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }

    public static void printRoot2Leaf(Node root,ArrayList<Integer>path){
        if(root == null){
            return;
        }

        path.add(root.data);

        //leaf
        if(root.left == null && root.right == null){
            printPath(path);
        }
        else{
            //non leaf
            printRoot2Leaf(root.left,path);
            printRoot2Leaf(root.right,path);
        }
        path.remove(path.size()-1);
    }
    public static void main(String args[]){
        int values[] = {8,5,3,6,10,11,14};
        Node root = null;

        for(int i =0; i<values.length; i++){
            root = insert(root,values[i]);
        }
        inorder(root);
        System.out.println();

       // printInRange(root, 3, 8);

       printRoot2Leaf(root,new ArrayList<>());
    }
    
    
}

    

