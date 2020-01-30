package code401challenges.tree;

public class BinarySearchTree<E extends Comparable<E>> {

//    Define a method named add that accepts a value, and adds a new node with that value in the correct location in
//     the binary search tree.


    Node<E> root;
    Node<E> current;
    E value;

    public boolean add(E value, Node<E> current){

        if (current == null){
            this.root = new Node(value);
            return true;
        }
        if(value.compareTo(current.value) < 0){
            if (current.left == null){
                current.left = new Node(value);
                return true;
            }
            add(value, current.left);
        } else if (value.compareTo(current.value) > 0){
           if (current.right == null){
               current.right = new Node(value);
               return true;
           }
           add(value, current.right);
        } else {
            return false;
        }
        return false;
    }


    //Define a method named contains that accepts a value, and returns a boolean indicating whether or not the
    // value is in the tree at least once.
//single node : am I the target, check left, check right
    public boolean contains(int value){
        return contains(this.root,value);
    }


   public boolean contains(Node current, int value){
        if(current == null){
            return false;
        }
        if ((int)current.value == value){
            return true;
        } else if ((int)current.value > value){
            contains(current.left, value);
        } else {
            contains(current.right,value);
        }
        return false;
    }



}
