package code401challenges.tree;


//Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.

public class Node<E> {

    public E value;
    public Node<E> left;
    public Node<E> right;


    public Node(E value, Node<E> left, Node<E> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(E value){
        this.value = value;
        this.left = null;
        this.right = null;
    }

}



