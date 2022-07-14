/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nick Huntington
 * 
 */
public class Stack {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        StackX theStack = new StackX(10);
        
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);
        
        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
        
        String input;
        while (true) {
            System.out.print("Enter the string with delimiters >> ");
            System.out.flush();
            input = getString();
            if (input.equals(""))
                break;
            
            BracketChecker theChecker = new BracketChecker(input);
            theChecker.check();
        }
        
//        String input, output;
//        while (true) {
//            System.out.print("Enter a string >> ");
//            System.out.flush();
//            input = getString();
//            if (input.equals(""))
//                break;
//            
//            Reverser reverser = new Reverser(input);
//            output = reverser.doRev();
//            System.out.println("Reversed: " + output); 
//        }
    }
    
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

}
