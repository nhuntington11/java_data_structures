/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

/**
 *
 * @author Nick
 */
public class Reverser {
    private String input;
    private String output;
    
    public Reverser(String in) {
        input = in;
    }
    
    public String doRev() {
        int stackSize = input.length();
        StackXChar theStack = new StackXChar(stackSize);
        
        for (int i=0; i<stackSize; i++) {
            char ch = input.charAt(i);
            theStack.push(ch);
        }
        output = "";
        while (!theStack.isEmpty()) {
            output += theStack.pop();
        }
        return output;
    }
}
