package code401challenges.tree;

public class BinarySearchTree {

    //Define a method named add that accepts a value, and adds a new node with that value in the correct location in
    // the binary search tree.

    public Node add(int value, Node left, Node right){
        Node current = null;
        if (current == null){
            return new Node(value);
        }
        if(value < current.value){
            current.left = add(current.left, value);
        } else if (value > current.value){
            current.right = add(current.right, value);
        } else {
            return current;
        }
        return current;
    }


    //Define a method named contains that accepts a value, and returns a boolean indicating whether or not the
    //value is in the tree at least once.

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
