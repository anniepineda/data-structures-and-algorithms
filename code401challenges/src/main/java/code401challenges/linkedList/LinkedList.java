package code401challenges.linkedList;

//Got help from: https://www.csie.ntu.edu.tw/~cyy/courses/oop/13summer/chap15java5th.pdf
import javax.xml.soap.Node;

public class LinkedList {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insert("Blue", 1);
        list.insert("Orange", 2);
        list.insert("Green", 3);
        System.out.println(list.size());
        System.out.println(list.toString());
    }
    private Node head;
    public LinkedList(){
        head = null;
    }
    ////method called insert which takes any value as an argument and adds a new node with that value
    // to the head of the list with an O(1) Time performance.(adds a node to the beginning of the list;
    // it will be the first node in the list.)////
    public void insert(String itemName, int itemCount){
        head = new Node(itemName, itemCount, head);
    }
    //    a method called includes which takes any value as an argument and returns a boolean result depending
//    on whether that value exists as a Node's value somewhere within the list.
    public boolean includes(String item){
        return (find(item) != null);
    }
    //    Define a method called toString (or __str__ in Python) which takes in no arguments and returns a string
//    representing all the values in the Linked List, formatted as: "{ a } -> { b } -> { c } -> NULL"
    public String toString(){
        Node position = head;
        String itemAtPosition = "";
        while (position != null){
            String valueFormat = "{ " + position.getValue() + " }";
            itemAtPosition = itemAtPosition + (valueFormat + " -> ");
            position = position.getValue();
        }
        if (position == null){
            itemAtPosition += "Null";
        }
        return itemAtPosition;
    }
}


//.append(value) which adds a new node with the given value to the end of the list
//.insertBefore(value, newVal) which add a new node with the given newValue immediately before the first value node
//.insertAfter(value, newVal) which add a new node with the given newValue immediately after the first value node