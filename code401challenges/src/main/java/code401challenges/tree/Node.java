package code401challenges.tree;


//Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.

public class Node {
    int value;
    Node left;
    Node right;


    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }

}



