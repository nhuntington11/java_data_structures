public class ArrayIns {
    private long[] arr;
    private int nElems;

    public ArrayIns(int size) {
        arr = new long[size];
        nElems = 0;
    }

    public void insert(long value) {
        arr[nElems++] = value;
    }

    public void display() {
        System.out.print("Array: ");
        for (int i=0; i<nElems; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    public void quickSort() {
        recQuickSort(0, nElems-1);
    }

    public void recQuickSort(int left, int right) {
        if (right-left <= 0)
            return;
        else {
            long pivot = arr[right];

            int partition = partitionIt(left, right, pivot);
            recQuickSort(left, partition-1);
            recQuickSort(partition+1, right);
        }
    }

    public int partitionIt(int left, int right, long pivot) {
        int leftPtr = left - 1;
        int rightPtr = right;
        while (true) {
            while (arr[++leftPtr] < pivot)
                ;
            while (rightPtr > 0 && arr[--rightPtr] > pivot)
                ;
            if (leftPtr >= rightPtr)
                break;
            else
                swap(leftPtr, rightPtr);
        }
        swap(leftPtr, right);
        return leftPtr;
    }

    public void swap(int leftDex, int rightDex) {
        long temp = arr[leftDex];
        arr[leftDex] = arr[rightDex];
        arr[rightDex] = temp;
    }
}
