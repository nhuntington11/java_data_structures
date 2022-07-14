/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package prefixpostfixdemo;

/**
 *
 * @author Nick Huntington
 * Date: 6.27.2022
 * Purpose: Demo of prefix/postfix
 * 
 */
public class PrefixPostfixDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int myNumber, answer;
        myNumber = 17;
        System.out.println("Before incrementing, myNumber is " + myNumber);
        answer = ++myNumber;
        System.out.println("After prefix increment, myNumber is " + myNumber);
        System.out.println(" and answer is " + answer);
        myNumber = 17;
        System.out.println("Before incrementing, myNumber is " + myNumber);
        answer = myNumber++;
        System.out.println("After postfix increment, myNumber is " + myNumber);
        System.out.println(" and answer is " + answer);
        
    }

}
