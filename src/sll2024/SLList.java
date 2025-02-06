/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sll2024;

/**
 *
 * @author EThornbury
 */
public class SLList implements LinearListInterface{
    private Node head, curr, prev;
    private int size;
    
    public SLList(){ //creating the empty list
        size = 0;
        head = null;
        curr = prev = null;
    }
    @Override
    public boolean isEmpty(){
        if(size == 0){
           return true; 
        }else
            return false;
    }
    
    @Override
    public int size(){
        return size;
    }
    
    @Override
    public Object get(int index){
        setCurrent(index);
        return curr;
    }
    
    @Override
    public void remove(int index){
        //if asked to remove the first/head obj or node
        if(index == 1){
            head = head.getNext(); //set the pointer to reference the next node after the head
        }else{
            //move along the list and reset the references
            setCurrent(index);
            prev.setNext(curr.getNext()); //resetting the references to ignore curr
        }
        size--;  //manually manage the size
    }
    
    @Override
    public void add(int index, Object element){
        if(index == 1){
            Node newNode = new Node(element, head);
            head = newNode;
           
        }else{
            setCurrent(index);
            Node newNode = new Node(element, curr); //make the node with reference to curr
            prev.setNext(newNode);  //set up the ref to newNode from the prev Node
        }
        size++;
    } 
    
    private void setCurrent(int index){
        //set curr to be at the index provided in the params
        curr = head;
        prev = null;
        for(int k = 1; k < index; k++){
            prev = curr;
            curr = curr.getNext();
        }
    }
    
    @Override
    public void add(Object element){
        Node newNode = new Node(element, null);
        if(head == null){  //an empty list
            head = newNode; //set the head to be this new node
        }else{  //shuffle along to the end and add it 
            setCurrent(size);  //use the size that we have been managing to get to the end of the list
            curr.setElement(newNode); 
        }
        size++;  //managing the size manually
    }
    
    @Override
    public void print(){
        Node temp = head;
        while(temp != null){ //check if its empty
            System.out.println(temp.toString());
            temp = temp.getNext(); //move reference the next node
        }
    }
    
}
