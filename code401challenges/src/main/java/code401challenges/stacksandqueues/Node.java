package code401challenges.stacksandqueues;

public class Node {
    int value;
    Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }



}