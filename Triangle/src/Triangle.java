import java.io.*;

public class Triangle {
    public static void main(String[] args) throws IOException {
        System.out.print("Please enter a number: ");
        int theNumber = getInt();
        int theAnswer = triangle(theNumber);
        System.out.println("Triangle = " + theAnswer);
    }

    public static int triangle(int n) {
        // base case
        if (n==1)
            return 1;
        else
            return n + triangle(n-1);
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
