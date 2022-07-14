/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package postfix;

import java.io.IOException;
import java.io.*;

/**
 *
 * @author Nick Huntington
 * 
 */
public class Postfix {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        String input;
        int output;
        
        while(true) {
            System.out.print("Enter postfix: ");
            System.out.flush();
            input = getString();
            if (input.equals(""))
                break;
            
            ParsePost aParser = new ParsePost(input);
            output = aParser.doParse();
            System.out.println("Evaluates to: " + output);
        }
    }
    
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

}
