package code401challenges.stacksandqueues;

import java.io.PushbackInputStream;
import java.util.EmptyStackException;

public class Stack<E> {
    public Node<E> top;

//    Define a method called push which takes any value as an argument and adds a new node with that value to the top of
//    the stack with an O(1) Time performance.

    public Stack(){ this.top = null;}
    public boolean isEmpty(){
        if (this.top == null){
            return true;
        }
        else{

            return false;
        }

    }

    public void push(E value){
        Node temp = new Node (value, this.top);
        this.top = temp;
    }

//    Define a method called pop that does not take any argument, removes the node from the top of the stack, and returns
//    the node’s value.
    public E pop (){
        if (!this.isEmpty()){
            Node<E> temp = this.top;
            this.top = top.next;
            return temp.value;
        }
        else {
            throw new EmptyStackException();
        }

    }

//    Define a method called peek that does not take an argument and returns the value of the node located on top of the
//    stack, without removing it from the stack.
    public E peek (){
        if (!this.isEmpty()){
            return top.value;
        }
        else {
            throw new EmptyStackException();
        }
    }



}
