/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicqueue;

/**
 *
 * @author Nick
 */
public class PriorityQueue {
    private int maxSize;
    private long[] queArray;
    private int nItems;
    
    public PriorityQueue(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        nItems = 0;
    }
    
    public void insert(long item) {
        int j;
        
        if (nItems == 0)
            queArray[nItems++] = item;
        else {
            for (j=nItems-1; j>=0; j--) {
                if (queArray[j] < item)
                    queArray[j+1] = queArray[j];
                else
                    break;
            }
            queArray[j+1] = item;
            nItems++;           
        }
    }
    
    public long remove() {
        return queArray[--nItems];
    }
    
    public long peekMin() {
        return queArray[nItems - 1];
    }
    
    public boolean isFull() {
        return (nItems == maxSize);
    }
    
    public boolean isEmpty() {
        return (nItems == 0);
    }
}
