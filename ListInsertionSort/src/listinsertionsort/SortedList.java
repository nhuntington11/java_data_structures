/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listinsertionsort;

/**
 *
 * @author Nick
 */
public class SortedList {
    private Link first;
    
    public SortedList() {
        first = null;
    }
    
    public SortedList(Link[] linkArr) {
        first = null;
        for (int j=0; j<linkArr.length; j++) {
            insert(linkArr[j]);
        }
    }
    
    public void insert(Link k) {
        Link current = first;
        Link previous = null;
        
        while (current != null && k.dData > current.dData) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            first = k;
        }
        else
            previous.next = k;
        k.next = current;
    }
    
    public Link remove() {
        try {
            Link temp = first;
            first = first.next;
            return temp;
        }
        catch (NullPointerException e) {
            System.out.println("Exception: " + e);
            Link x = new Link(0);
            return x;    
        }
    }
}
