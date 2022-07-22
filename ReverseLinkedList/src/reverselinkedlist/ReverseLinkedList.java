/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverselinkedlist;

/**
 *
 * @author Thiru_Shashi
 */
public class ReverseLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // creating a singly linked list
    SingleLinkedList.Point Initial = new SingleLinkedList.Point(1);
    SingleLinkedList linkedlist = new SingleLinkedList(Initial);

    // adding node into singly linked list
    linkedlist.add(new SingleLinkedList.Point(2));
    linkedlist.add(new SingleLinkedList.Point(3));
    // printing a singly linked list
    linkedlist.print();

    // reversing the singly linked list
    linkedlist.reverse();

    // printing the singly linked list again
    linkedlist.print();
    }
    
}
