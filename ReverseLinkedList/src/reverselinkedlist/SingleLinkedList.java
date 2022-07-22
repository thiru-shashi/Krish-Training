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
public class SingleLinkedList {

  static class Point {

    private int data;
    private Point next;

    public Point(int data) {
      this.data = data;
    }

    public int data() {
      return data;
    }

    public Point next() {
      return next;
    }
  }

  private Point Initial;

  public SingleLinkedList(Point head) {
    this.Initial = head;
  }

public void add(Point node) {
    Point current = Initial;
    while (current != null) {
      if (current.next == null) {
        current.next = node;
        break;
      }
      current = current.next;
    }
  }
    
    //Java method to print a singly linked list
    public void print() {
    Point node = Initial;
    while (node != null) {
      System.out.print(node.data() + " ");
      node = node.next();
    }
    System.out.println("");
  }
    
    //Java method to reverse a linked list without recursion
    public void reverse() {
    Point pointer = Initial;
    Point previous = null, current = null;

    while (pointer != null) {
      current = pointer;
      pointer = pointer.next;

      // reverse the link
      current.next = previous;
      previous = current;
      Initial = current;
    }

  }  

}
