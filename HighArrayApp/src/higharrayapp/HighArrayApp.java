/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package higharrayapp;

/**
 *
 * @author Nick Huntington
 * 
 */
public class HighArrayApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray arr = new HighArray(maxSize);
        HighArray sortedArr = new HighArray(maxSize);
        long value;
        
        System.out.println("Array size: " + arr.removeMax());
        
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        
        arr.display();
        
        int searchKey = 35;
        if (arr.find(searchKey) )
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);
        
        arr.delete(00);
        arr.delete(55);
        arr.delete(99);
        
        arr.display();
        
        value = arr.removeMax();
        while (value != -1) {
            sortedArr.insert(value);
            value = arr.removeMax();
        }
        
        sortedArr.display();
    }

}
