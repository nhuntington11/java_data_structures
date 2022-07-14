/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package basicqueue;

/**
 *
 * @author Nick Huntington
 * 
 */
public class BasicQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue theQueue = new Queue(5);
        
        theQueue.insert(10); // 0
        theQueue.insert(20); // 1
        theQueue.insert(30); // 2
        theQueue.insert(40); // 3
        theQueue.remove();
        theQueue.remove();
        theQueue.remove();
        theQueue.insert(50); // 4
        theQueue.insert(60); // 0
        theQueue.insert(70); // 1
        theQueue.insert(80); // 2
        
        while ( !theQueue.isEmpty() ) {
            long value = theQueue.remove();
            System.out.print(value + " ");
        }
        System.out.println("");
        
        PriorityQueue pQue = new PriorityQueue(5);
        
        pQue.insert(40);
        pQue.insert(30);
        pQue.insert(50);
        pQue.insert(20);
        pQue.insert(10);
        
        while (!pQue.isEmpty() ) {
            long value = pQue.remove();
            System.out.print(value + " ");
        }
        System.out.println("");
    }

}
