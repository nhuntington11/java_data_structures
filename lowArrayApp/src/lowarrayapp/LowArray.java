/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lowarrayapp;

/**
 *
 * @author Nick
 */
public class LowArray {
    private long[] a;
    
    public LowArray(int size) {
        a = new long[size];
    }
    
    public void setElement(int index, long value) {
        a[index] = value;
    }
    
    public long getElem(int index) {
        return a[index];
    }
}
