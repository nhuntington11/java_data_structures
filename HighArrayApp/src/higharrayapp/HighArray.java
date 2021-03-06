/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package higharrayapp;

/**
 *
 * @author Nick
 */
public class HighArray {
    private long[] a;
    private int nElems;
    
    public HighArray(int max){
        a = new long[max];
        nElems = 0;
    }
    
    public boolean find(long searchKey) {
        int j;
        for (j=0; j<nElems; j++)
            if (a[j] == searchKey)
                break;
        if (j == nElems)
            return false;
        else
            return true;
    }
    
    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }
    
    public boolean delete(long value) {
        int j;
        for (j=0; j<nElems; j++)
            if (a[j] == value)
                break;
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
    
    public long removeMax() {
        long maxKey = -1;
        
        if (nElems == 0)
            return maxKey;
        
        for (int j=0; j<nElems; j++) {
            if (a[j] > maxKey)
                maxKey = a[j];
        }
        delete(maxKey);
        return maxKey;
    }
    
    public void display() {
        for (int j=0; j<nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println("");
    }
}
