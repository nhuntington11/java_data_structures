/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package linkqueueapp;

/**
 *
 * @author Nick Huntington
 * 
 */
public class LinkQueueApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkQueue queue = new LinkQueue();
        
        queue.push(11);
        queue.push(22);
        queue.push(33);
        queue.push(44);
        queue.displayQueue();
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        queue.displayQueue();
        queue.push(55);
        queue.push(66);
        queue.displayQueue();
        
    }

}
