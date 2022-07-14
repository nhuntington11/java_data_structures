/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package listinsertionsort;

/**
 *
 * @author Nick Huntington
 * 
 */
public class ListInsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int size = 10;
        Link[] linkArray = new Link[size];
        
        for (int i=0; i<size; i++) {
            int n = (int)(java.lang.Math.random()*99);
            Link newLink = new Link(n);
            linkArray[i] = newLink;
        }
        
        System.out.print("Unsorted Array: ");
        for (int j=0; j<size; j++)
            System.out.print( linkArray[j].dData + " ");
        System.out.println("");
        
        SortedList sortedList = new SortedList(linkArray);
        for (int j=0; j<size; j++) {
            linkArray[j] = sortedList.remove();
        }
        
        System.out.print("Sorted Array: ");
        for (int j=0; j<size; j++)
            System.out.print( linkArray[j].dData + " ");
        System.out.println("");
    }

}
