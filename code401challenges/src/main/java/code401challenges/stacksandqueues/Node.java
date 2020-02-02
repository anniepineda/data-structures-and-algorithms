package code401challenges.stacksandqueues;

public class Node<E> {
    public E value;
    public Node<E> next;

    public Node(E value, Node next) {
        this.value = value;
        this.next = null;
    }

    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }



}