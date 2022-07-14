/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkqueueapp;

/**
 *
 * @author Nick
 */
public class Link {
    public long dData;
    public Link next;
    
    public Link(long dd) {
        dData = dd;
    }
    
    public void displayLink() {
        System.out.print(" dData: " + dData);
    }
}
