/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infix;

/**
 *
 * @author Nick
 */
public class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;
    
    public StackX(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }
    
    public void push(char j) {
        stackArray[++top] = j;
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
    
    public int size() {
        return top + 1;
    }
    
    public char peekN(int n) {
        return stackArray[n];
    }
    
    public void displayStack(String s) {
        System.out.print(s);
        System.out.print("Stack (bottom --> top)");
        for (int i = 0; i<size(); i++) {
            System.out.print(peekN(i));
            System.out.print(' ');
        }
        System.out.println("");
    }
}
