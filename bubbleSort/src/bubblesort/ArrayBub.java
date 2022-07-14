/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bubblesort;

/**
 *
 * @author Nick
 */
public class ArrayBub {
    private long[] a;
    private int nElems;
    
    public ArrayBub(int max) {
        a = new long[max];
        nElems = 0;
    }
    
    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }
    
    public void bubbleSort() {
        int out, in;
        
        for (out=nElems - 1; out>1; out--)
            for (in=0; in<out; in++) {
                if (a[in] > a[in+1])
                    swap(in, in+1);
            }
    }
    
    public void selectionSort() {
        int out, in, min;
        
        for (out=0; out<nElems - 1; out++) {
            min = out;
            
            for (in=out+1; in<nElems; in++) {
                if (a[min] > a[in]) {              
                    min = in;
                }
            }
        swap(out, min); 
        }
    }
    
    public void insertionSort() {
        int in, out;
        
        for (out=1; out<nElems; out++) {
            long temp = a[out];
            in = out;
            while (in>0 && a[in-1] >= temp) {
                a[in] = a[in-1];
                --in;
            }
            a[in] = temp;
//            for (int i=0; i<nElems; i++)
//                System.out.print(a[i] + " ");
//            System.out.println("");
        }
    }
    
    // temp = 55
    // in = 1
    // out = 3
    // 44 55 77 99 22 88 11 0 66 33 
    
    public void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
    
    public void display() {
        for (int i=0; i<nElems; i++)
            System.out.print(a[i] + " ");
        System.out.println("");
    }
}
