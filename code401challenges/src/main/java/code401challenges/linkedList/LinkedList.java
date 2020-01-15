package code401challenges.linkedList;
import java.sql.SQLOutput;

public class LinkedList {
    private Node head;
    public LinkedList(){
        head = null;
    }
    ////method called insert which takes any value as an argument and adds a new node with that value
    // to the head of the list with an O(1) Time performance.(adds a node to the beginning of the list;
    // it will be the first node in the list.)////
    public void insertHead(int itemCount){
        this.head = new Node(itemCount, this.head);
    }

    // a method called includes which takes any value as an argument and returns a boolean result depending
//    on whether that value exists as a Node's value somewhere within the list.
    public boolean includes(int value){
        Node current = this.head;
        while (current != null){
            if (current.value == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    //    Define a method called toString (or __str__ in Python) which takes in no arguments and returns a string
//    representing all the values in the Linked List, formatted as: "{ a } -> { b } -> { c } -> NULL"
   public String toString(){
        String answer = "";
        Node current = this.head;
        while (current != null){
            answer += "{ "+ current.value +" } -> " ;
            current = current.next;
        }
        answer += "null";
        return answer;
   }




//Code Challenge 06:
//.append(value) which adds a new node with the given value to the end of the list
//.insertBefore(value, newVal) which add a new node with the given newValue immediately before the first value node
//.insertAfter(value, newVal) which add a new node with the given newValue immediately after the first value node




//Code Challenge 07: K-th value from the end of the list
//Write a method for the Linked List class which takes a number, k, as a parameter. Return the node’s value that is
// k from the end of the linked list. You have access to the Node class and all the properties on the Linked List
// class as well as the methods created in previous challenges.


public String llKthFromEnd(int k) throws NoSuchMethodException {
    if (k < 0){
        throw new NoSuchMethodException("K cannot be less than 0");
    }

    Node current = head;
        count = 0;

    while (node.next != null) {
        if(k == length - count)){
    return node.data;
        }
        System.out.println(node.data);
        node = node.next;
        count ++;
    }





}