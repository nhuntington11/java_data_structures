public class Main {
    public static void main(String[] args) {
        int maxSize = 100;
        DArray arr = new DArray(maxSize);

        arr.insert(64);
        arr.insert(22);
        arr.insert(199);
        arr.insert(76);
        arr.insert(42);
        arr.insert(12);
        arr.insert(33);
        arr.insert(74);
        arr.insert(1);
        arr.insert(28);

        arr.display();

        arr.mergeSort();

        arr.display();

    }
}