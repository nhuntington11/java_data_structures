public class Main {
    public static void main(String[] args) {
        int size = 15;
        ArrayIns theArray = new ArrayIns(size);

        for (int i=0; i<size; i++) {
            long n = (int) (java.lang.Math.random()*99);
            theArray.insert(n);
        }

        theArray.display();
        theArray.quickSort();
        theArray.display();
    }
}