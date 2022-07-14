/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basiclinkedlist;

/**
 *
 * @author Nick
 */
public class Link {
    public int iData;
    public double dData;
    public Link next;
    
    public Link(int id, double dd) {
        iData = id;
        dData = dd;
        next = null;
    }
    
    public void displayLink() {
        System.out.print("{" + iData + ", " + dData + "}");
    }
}
