/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orderedarray;

/**
 *
 * @author Nick
 */
public class OrdArray {
    private long[] a;
    private int nElems;
    
    public OrdArray(int max) {
        a = new long[max];
        nElems = 0;
    }
    
    public int size() {
        return nElems;
    }
    
    public long get(int index) {
        return a[index];
    }
    
    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;
        
        while (true) {
            curIn = (lowerBound + upperBound) / 2;      // Get midpoint of boundary
            if (a[curIn] == searchKey)
                return curIn;
            else if (lowerBound > upperBound)
                return nElems;
            else {
                if (a[curIn] < searchKey)
                    lowerBound = curIn + 1; // Upper half
                else
                    upperBound = curIn - 1; // Lower half
            }
        }
    }
    
    public void insert(long value) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn = 0;
        int j = 0;
        
        while (lowerBound <= upperBound) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] < value)
                lowerBound = curIn + 1;
            else
                upperBound = curIn - 1;
        }

        for (int i=nElems; i>j; i--) {
            if (a[curIn] < value)
                j = curIn + 1;
            else
                j = curIn;
            a[i] = a[i-1];
        }
            
        a[j] = value;
        nElems++;
    }
    
    public OrdArray merge(OrdArray array2) {
        OrdArray array1 = this;
        int maxSize;
        OrdArray mergedArray;
        long a = Long.MIN_VALUE;
        long b = Long.MIN_VALUE;
        
        maxSize = array1.size() + array2.size();
        mergedArray = new OrdArray(maxSize);
        
        for (int i=0; i<maxSize; i++) {
            if (array1.size() > 0)
                a = array1.get(0);
            if (array2.size() > 0)
                b = array2.get(0);
            if (a > b) {
                mergedArray.insert(a);
                array1.delete(a);
            }
            else {
                mergedArray.insert(b);
                array2.delete(b);
            }
            
            a = Long.MIN_VALUE;
            b = Long.MIN_VALUE;
        }
        
        return mergedArray;
    }
    
    public boolean delete(long value) {
        int j = find(value); // index of value
        if (j == nElems)
            return false;
        else {
            for (int k=j; k<nElems; k++) {
                a[k] = a[k+1];
            }
            nElems--;
            return true;
        }
    }
    
    public void display() {
        for (int j=0; j<nElems; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println("");
    }
}
