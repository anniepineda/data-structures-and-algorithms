package code401challenges.tree;


//Created a BinaryTree class

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Tree <E> {

    public Node<E> root;

    public Tree (Node<E> root){
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

    public void preOrder(Node<E> node){
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
    public void inOrder(Node<E> node){
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

    //rearrange like this one...//
      private ArrayList<Integer> postOrder(Node<E> node, ArrayList<Integer> result){
        if(node == null) {
            return result;
        }else{
        postOrder(node.left, result);
        postOrder(node.right, result);
        result.add((Integer) node.value);

        }
        return result;
    }

///    Code Challenge 17 Breadth-first Traversal

    //Got help from: https://algorithms.tutorialhorizon.com/breadth-first-searchtraversal-in-a-binary-tree/

    public ArrayList<E> breadthFirstTraversal(){
        ArrayList<E> arrayList= new ArrayList<E>();
        Queue<Node<E>> q = new LinkedList<>();
        if (this.root != null){
            q.add(this.root);
        }
        q.add(root);
        while (!q.isEmpty()){
            Node<E> n = (Node<E>) q.poll();
            arrayList.add(n.value);
            if (n.left != null) {
                q.add(n.left);
            }
            if (n.right != null){
                q.add(n.right);
            }
            return arrayList;
        }

        return arrayList;
    }



}
