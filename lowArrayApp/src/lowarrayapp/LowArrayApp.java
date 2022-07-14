/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package lowarrayapp;

/**
 *
 * @author Nick Huntington
 * 
 */
public class LowArrayApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LowArray arr = new LowArray(100);
        int nElems = 0;
        int j;
        
        arr.setElement(0, 77);
        arr.setElement(1, 99);
        arr.setElement(2, 44);
        arr.setElement(3, 55);
        arr.setElement(4, 22);
        arr.setElement(5, 88);
        arr.setElement(6, 11);
        arr.setElement(7, 00);
        arr.setElement(8, 66);
        arr.setElement(9, 33);
        nElems = 10;
        
        for (j=0; j<nElems; j++)
            System.out.print(arr.getElem(j) + " ");
        System.out.println("");
        
        int searchKey = 26;
        for (j=0; j<nElems; j++)
            if (arr.getElem(j) == searchKey)
                break;
        if (j == nElems)
            System.out.println("Can't find " + searchKey);
        else
            System.out.println("Found " + searchKey);
        
        for (j=0; j<nElems; j++)
            if(arr.getElem(j) == 55)
                break;
        for (int k=j; k<nElems-1; k++)
            arr.setElement(k, arr.getElem(k+1));
        nElems--;
        
        for (j=0; j<nElems; j++)
            System.out.print(arr.getElem(j) + " ");
        System.out.println("");
    }

}
