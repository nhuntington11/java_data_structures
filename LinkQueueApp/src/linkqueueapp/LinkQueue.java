/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkqueueapp;

/**
 *
 * @author Nick
 */
public class LinkQueue {
    private FirstLastList theQueue;
    
    public LinkQueue() {
        theQueue = new FirstLastList();
    }
    
    public boolean isEmpty() {
        return theQueue.isEmpty();
    }
    
    public void push(long j) {
        theQueue.insertLast(j);
    }
    
    public long pop() {
        return theQueue.deleteFirst();
    }
    
    public void displayQueue() {
        theQueue.displayList();
    }
}
