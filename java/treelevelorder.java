import java.util.*;
public class treelevelorder {
        static class Node {
        
        int data ;
        Node left;
        Node right;
    
        Node(int data){
            this.data=data;
            this.left = null;
            this.right=null;
        }
    }
    
    static class Binarytree{
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx]== -1){
                return null;
    
            }
    
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
    
            return newNode;
    
    
        }
    
    
    }

    //levelorder

    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node>q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                    
                }
                if(currNode.right != null){
                    q.add(currNode.right);

                }
            }
        }
    }

    // count of nodes
     public static int countOfNodes(Node root){
        if(root==null){
            return 0;
        }

        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes +1;


    }
    //sum of nodes

    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum =sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }


    // height of tree

    public static int heightOfTree(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight =heightOfTree(root.right);

        int myHeight = Math.max(leftHeight,rightHeight) + 1;

        return myHeight;
    }

    //diameter of tree

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }

        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = heightOfTree(root.left)+ heightOfTree(root.right) +1;
    
        return Math.max(diam3,Math.max(diam1,diam2));
    }
    
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree = new Binarytree();
        Node root = tree.buildTree(nodes);
        //levelOrder(root);

        System.out.println(countOfNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(heightOfTree(root));
        System.out.println(diameter(root));
        
        
    }
    
        
    }
    

