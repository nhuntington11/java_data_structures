/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package orderedarray;

/**
 *
 * @author Nick Huntington
 * 
 */
public class OrderedArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int maxSize = 100;
        OrdArray arr1;
        OrdArray arr2;
        OrdArray mArr;
        arr1 = new OrdArray(maxSize);
        arr2 = new OrdArray(maxSize);
        
        arr1.insert(77);
        arr1.insert(99);
        arr1.insert(44);
        arr1.insert(55);
        arr1.insert(22);
        arr1.insert(88);
        arr1.insert(11);
        arr1.insert(00);
        arr1.insert(66);
        arr1.insert(33);
        
        arr2.insert(76);
        arr2.insert(98);
        arr2.insert(43);
        arr2.insert(54);
        arr2.insert(21);
//        arr2.insert(87);
//        arr2.insert(10);
//        arr2.insert(01);
//        arr2.insert(65);
//        arr2.insert(32);
        
        arr1.display();
        arr2.display();
        
        mArr = arr1.merge(arr2);
        mArr.display();
        
        int searchKey = 55;
        if (arr1.find(searchKey) != arr1.size())
            System.out.println("Found " + searchKey);
        else
            System.out.println("Didn't find " + searchKey);
    }

}
