/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basiclinkedlist;

/**
 *
 * @author Nick
 */
public class LinkList {
    private Link first;
    private Link last;
    
    public void LinkList() {
        first = null;
        last = null;
    }
    
    public boolean isEmpty() {
        return (first == null);
    }
    
    public void insertFirst(int id, double dd) {
        Link newLink = new Link(id, dd);
        if (isEmpty() )
            last = newLink;
        newLink.next = first;
        first = newLink;
    }
    
    public void insertLast(int id, double dd) {
        Link newLink = new Link(id, dd);
        if (isEmpty() )
            first = newLink;
        last.next = newLink;
        last = newLink;
    }
    
    public Link find(int key) {
        Link current = first;
        while (current.iData != key) {
            if (current.next == null)
                return null;
            else
                current = current.next;
        }
        return current;
    }
    
    public Link delete(int key) {
        Link current = first;
        Link previous = first;
        while (current.iData != key)
            if (current.next == null)
                return null;
            else {
                previous = current;
                current = current.next;
            }
        if (current == first)
            first = first.next;
        else
            previous.next = current.next;
        return current;   
    }
    
    public Link deleteFirst() {
        if (!isEmpty()) {
            Link temp = first; // temp reference to first Link
            first = first.next; // LinkList first now points to reference of second Link
            return temp;
        }
        return new Link(0,0);
    }
    
    public void displayList() {
        System.out.print("List (first --> last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next; 
        }
        System.out.println("");
    }
}
