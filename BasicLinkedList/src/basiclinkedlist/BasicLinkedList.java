/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package basiclinkedlist;

/**
 *
 * @author Nick Huntington
 * 
 */
public class BasicLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkList theList = new LinkList();
        
        theList.insertFirst(22,2.99);
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66,6.445);
        theList.insertFirst(77,2.3);
        theList.insertFirst(88,5.3);
        
        theList.displayList();

        Link f = theList.find(44);
        if (f != null)
            f.displayLink();
        else
            System.out.print("Couldn't find link with key: " + f.iData);
        System.out.println("");
        
        Link l = theList.delete(44);
        if (l != null) {
            System.out.print("Deleted ");
            l.displayLink();
            System.out.println("");
        }
        else
            System.out.print("Could not find link with key");
        
        theList.displayList();
        
        theList.insertLast(100, 200.2);
        theList.insertLast(200, 400.4);
        
        theList.displayList();
        
//        while (!theList.isEmpty()) {
//            Link temp = theList.deleteFirst();
//            System.out.print("Removed: ");
//            temp.displayLink();
//            System.out.println("");
//        }
//        
//        theList.displayList();
    }

}
