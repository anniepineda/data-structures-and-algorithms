package code401challenges.tree;

public class BinarySearchTree {

    //Define a method named add that accepts a value, and adds a new node with that value in the correct location in
    // the binary search tree.

    public Node add(int value, Node node){
        Node current = null;
        if (node == null){
            return new Node(value);
        }
        if(value < node.value){
            node.left = add(value, node.left);
        } else if (value > node.value){
            node.right = add(value, node.right);
        } else {
            return node;
        }
        return node;
    }


    //Define a method named contains that accepts a value, and returns a boolean indicating whether or not the
    //value is in the tree at least once.
//single node : am I the target, check left, check right
    public boolean contains(Node current, int value){
        if(current == null){
        }
        return false;
    }
    if (current.value == value){
        return true;
    } esle if (current.value > value){
        contains(current.right, value);
    }
    return fasle;


}
