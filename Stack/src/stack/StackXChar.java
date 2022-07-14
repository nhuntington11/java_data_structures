/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

/**
 *
 * @author Nick
 */
public class StackXChar {
    private int maxSize;
    private char[] stackArray;
    private int top;
    
    public StackXChar(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }
    
    public void push(char value) {
        stackArray[++top] = value;
    }
    
    public char pop() {
        return stackArray[top--];
    }
    
    public char peek() {
        return stackArray[top];
    }
    
    public boolean isEmpty() {
        return (top == -1);
    }
    
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
