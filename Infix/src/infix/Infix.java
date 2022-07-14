/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package infix;

import java.io.*;

/**
 *
 * @author Nick Huntington
 * 
 */
public class Infix {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        String input, output;
        
        while (true) {
            System.out.print("Enter infix: ");
            System.out.flush();
            input = getString();
            if (input.equals(""))
                break;
            
            InToPost theTrans = new InToPost(input);
            output = theTrans.toPostfix();
            System.out.println("The postfix is: " + output);
        }
    }
    
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
