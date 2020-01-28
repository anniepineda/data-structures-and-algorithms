package code401challenges.tree;


//Created a BinaryTree class

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Tree {

    Node root;

    public Tree (Node root){
        this.root = root;
    }

    public Tree (){
        this.root = null;
    }

    //preOrder method

    public void preOrder(){
        preOrder(this.root);
    }

    //recurring on itself

    public void preOrder(Node node){
        //base case (always at top)
        if (node == null){
            return;
        }

        //action, carrying out method
        System.out.println(node.value);

        //recursive calls
        preOrder(node.left);
        preOrder(node.right);

    }

    //inOrder method
    public void inOrder(Node node){
        if (node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }


    //postOrder, which returns an array of the values, ordered appropriately  //push //return array list
    public ArrayList<Integer> postOrder(){
        ArrayList<Integer> result = new ArrayList<>();
        return postOrder(this.root, result);
    }

    //rearrange like this one...
      private ArrayList<Integer> postOrder(Node node, ArrayList<Integer> result){
        if(node == null) {
            return result;
        }
        postOrder(node.left, result);
        postOrder(node.right, result);
        result.add(node.value);

        return result;
    }


}
