/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sll2024;

/**
 *
 * @author EThornbury
 */
public class SLLApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        SLList s = new SLList();
        s.add("node 1");
        s.add(2, "node 2");
        s.add(3, "node 3");
        System.out.println("Empty? " +s.isEmpty());
        System.out.println("Size: " +s.size());
        s.print();
        System.out.println("adding a node at index 1");
        s.add(1, "node wildcard!");
        s.print();
        
        
        
    }
    
}
