package code401challenges.stacksandqueues;

import java.util.NoSuchElementException;

public class Queue {
    private Node front;
    private Node back;

    public Queue() {
        this.front = null;
        this.back = null;

    }

    public boolean isEmpty(){
        return this.front == null;

    }

//    Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back
//    of the queue with an O(1) Time performance.
    public void enqueue( int value){
        Node temp =  new Node (value, null);
        if (this.isEmpty()){
            this.front = this.back = temp;
        }
        else if (front == this.back){
            this.front.next = temp;
            this.back = temp;
        }
        else{
            this.back.next = temp;
            this.back = temp;
        }
    }

//    Define a method called dequeue that does not take any argument, removes the node from the front of the queue,
//    and returns the node’s value.
    public int dequeue(){
        if (this.isEmpty()){
            throw new NoSuchElementException();
        }
            else if(this.front == this.back){
                Node temp = this.front;
                this.front = this.back  = null;
                return temp.value;
            }
            else{
                Node temp = this.front;
                this.front = this.front.next;
                return temp.value;
            }
    }


//    Define a method called peek that does not take an argument and returns the value of the node located in the front
//    of the queue, without removing it from the queue.

    public int peek() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        } else {
            return front.value;

        }
    }
}
