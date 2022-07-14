/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package sortedlistapp;

/**
 *
 * @author Nick Huntington
 * 
 */
public class SortedListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SortedList theSortedList = new SortedList();
        theSortedList.insert(20);
        theSortedList.insert(40);
        
        theSortedList.displayList();
        
        theSortedList.insert(30);
        theSortedList.insert(10);
        
        theSortedList.displayList();
        
        Link del = theSortedList.remove();
        del.displayLink();
        System.out.println("");
        
        theSortedList.displayList();
    }

}
