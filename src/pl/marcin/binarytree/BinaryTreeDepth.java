package pl.marcin.binarytree;

class Node{
    int value;
    Node left;
    Node right;



    public Node(int values) {
        this.value = values;
        left=null;
        right=null;
    }
}
public class BinaryTreeDepth {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.right = new Node(3);
        root.left.right.left = new Node(4);
        root.left.left = new Node(5);
        System.out.println(depthOfTreeRecursion(root));



    }
    public static int depthOfTreeRecursion(Node root){
        if(root==null)return 0;
        int leftHeigh = depthOfTreeRecursion(root.left);
        int rightHeigh = depthOfTreeRecursion(root.right);
        return 1+ Math.max(leftHeigh,rightHeigh);

    }
}
