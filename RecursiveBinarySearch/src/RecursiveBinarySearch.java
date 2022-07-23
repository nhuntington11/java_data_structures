public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int maxSize = 100;
        OrdArray arr = new OrdArray(maxSize);

        arr.insert(72);
        arr.insert(44);
        arr.insert(92);
        arr.insert(55);
        arr.insert(34);
        arr.insert(134);
        arr.insert(90);
        arr.insert(111);
        arr.insert(22);
        arr.insert(2);
        arr.insert(3823);
        arr.insert(98);

        arr.display();

        int searchKey = 22;
        if (arr.find(searchKey) != arr.size())
            System.out.println("Found " + searchKey);
        else
            System.out.println("Could not find " + searchKey);
    }
}
