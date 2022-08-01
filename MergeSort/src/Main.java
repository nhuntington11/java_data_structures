public class Main {
    public static void main(String[] args) {
        int[] arrayA = {23, 47, 81, 95};
        int[] arrayB = {7, 14, 39, 55, 62, 74};
        int[] arrayC = new int[10];

        merge(arrayA, 4, arrayB, 6, arrayC);
        display(arrayC, 10);
    }

    public static void merge(int[] a, int sizeA, int[] b, int sizeB, int[] c) {
        int aDex = 0, bDex = 0, cDex = 0;

        while (aDex < sizeA && bDex < sizeB)
            if (a[aDex] < b[bDex])
                c[cDex++] = a[aDex++];
            else
                c[cDex++] = b[bDex++];

        while (aDex < sizeA)
            c[cDex++] = a[aDex++];

        while (bDex < sizeB)
            c[cDex++] = b[bDex++];
    }

    public static void display(int[] a, int size) {
        System.out.print("Array: ");
        for (int i = 0; i < size; i++)
            System.out.print(a[i] + " ");
        System.out.println("");
    }
}