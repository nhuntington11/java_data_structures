/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sortedlistapp;

/**
 *
 * @author Nick
 */
public class Link {
    public long dData;
    public Link next;
    
    public Link(long d) {
        dData = d;
    }
    
    public void displayLink() {
        System.out.print(dData + " ");
    } 
}
