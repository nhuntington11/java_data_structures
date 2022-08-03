public class ArraySh {
    private long[] theArray;
    private int nElems;

    public ArraySh(int size) {
        theArray = new long[size];
        nElems = 0;
    }

    public void insert(long value) {
        theArray[nElems++] = value;
    }

    public void display() {
        System.out.print("Array: ");
        for (int i=0; i<nElems; i++) {
            System.out.print(theArray[i] + " ");
        }
        System.out.println("");
    }

    public void shellSort() {
        int inner, outer;
        long temp;

        int h = 1;
        while (h < nElems) {
            h = (h*3) + 1;
        }

        while (h > 0) {
            for (outer=h; outer<nElems; outer++) {
                temp = theArray[outer];
                inner = outer;

                while (inner > h-1 && theArray[inner-h] > temp ) {
                    theArray[inner] = theArray[inner - h];
                    inner -= 1;
                }
                theArray[inner] = temp;
            }
            h = (h-1) / 3;
        }
    }
}
