public class Main {
    public static void main(String[] args) {
        int maxSize = 10;
        ArraySh arr = new ArraySh(maxSize);

        for (int j=0; j<maxSize; j++) {
            long n = (int)(java.lang.Math.random()*999);
            arr.insert(n);
        }

        arr.display();
        arr.shellSort();
        arr.display();
    }

}