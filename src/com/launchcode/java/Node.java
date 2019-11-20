package com.launchcode.java;

/*
* This list will hold each node
* in the linked list
* */

public class Node {
        //properties
        Node next;
        int data;   //assuming data is an integar, but could be something else

    //methodsd

    //constructors

    public Node (int newData){
        data = newData;
        next = null;    //don't know what is next
    }
    public Node (int newData, Node newNext){
        data = newData;
        next = newNext;
    }

    //getters and setters

    public int getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
    public void setData(int newData){
        data = newData;
    }
    public void setNext(Node newNode){
        next = newNode;
    }
}