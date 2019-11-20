package com.launchcode.java;

import java.util.LinkedList;

public class LinkedListUS {

    //properties

    Node head;  //reference to next node
    int count;  // so will know when at the end of the list

    //constructors

    //public LinkedListUS(){
     //head = null;
     //count = 0;         // can initialize list w/ 0 or 1 object
    //}                   //current is unable to see .getNext while it is null

    public LinkedListUS(Node newHead){
        head = newHead;
        count = 1;      // can initialize list w/ 0 or 1 object
    }

    //methods

    //add

    public void add(int newData){
        Node temp = new Node(newData);
        Node current = head;
        while (current.getNext() != null){          //can't do a method on a null item; see 1st constructor
            current = current.getNext();        //allows iteration through the list
        }                                       //example node0.getnext = node1; last node getnext is null
        current.setNext(temp);  //when current is null, set the next node to be temporary, which will
        count += 1;             //be the new node

        //research on how to make a linked list of only 1 node
        //see video just prior to 20:18 minutes as for why
    }

    //get
    public int get(int index){  //specifying where to get (read) a node
        if (index <= 0){
            return -1;  //it's not possible to have less than 1 in a node, so it means request invalid
        }
        Node current = head;
        for (int a = 1; a < index; a += 1){    //deal with a list from the first element
            current = current.getNext();    //
        }
        return current.getData();  //return the nodes data after getting the next node
    }

    //size
    public int size(){
        return count;
    }

    //isEmpty?
    public boolean emptyOrNot(){
        return head == null;
    }

    //remove

    public void remove(){
        //remove from end of the list (highest node number
        Node current = head;
        while (current.getNext().getNext() != null){  //gets second node after current one
            current = current.getNext();
        }
        current.setNext(null);
        count -= 1;
    }

    public static void main(String[] args) {
	// write your code here
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Alicia");
        System.out.println(linkedList);
        linkedList.add("Amy");
        System.out.println(linkedList);
        linkedList.remove("Amy");
        System.out.println(linkedList);
        linkedList.add("Ann");
        System.out.println(linkedList);
    }
}