/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bubblesort;

/**
 *
 * @author Nick Huntington
 * 
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int maxSize = 100000;
        ArrayBub arr;
        arr = new ArrayBub(maxSize);
        
        for (int j=0; j<maxSize; j++) {
            long n = (long)(java.lang.Math.random()*(maxSize-1));
            arr.insert(n);
        }
        
//        arr.insertionSort();
//        arr.selectionSort();
        arr.bubbleSort();

    }

}
