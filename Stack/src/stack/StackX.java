/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

/**
 *
 * @author Nick
 */
public class StackX {
    private int maxSize;
    private long[] stackArray;
    private int top;
    
    public StackX(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }
    
    public void push(long value) {
        stackArray[++top] = value;
    }
    
    public long pop() {
        return stackArray[top--];
    }
    
    public long peek() {
        return stackArray[top];
    }
    
    public boolean isEmpty() {
        return (top == -1);
    }
    
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
