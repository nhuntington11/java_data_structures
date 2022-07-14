/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkqueueapp;

/**
 *
 * @author Nick
 */
public class FirstLastList {
    private Link first;
    private Link last;
    
    public FirstLastList() {
        first = null;
        last = null;
    }
    
    public boolean isEmpty() {
        return (first == null);
    }
    
    public void insertLast(long dd) {
        Link newLink = new Link(dd);
        if ( isEmpty() )
            first = newLink;
        else
            last.next = newLink;
        last = newLink;
    }
    
    public long deleteFirst() {
        long temp = first.dData;
        if (first.next == null)
            last = null;
        first = first.next;
        return temp;
    }
    
    public void displayList() {
        Link current = first;
        System.out.print("Queue (first --> last):");
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
    
}
