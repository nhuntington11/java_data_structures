import java.util.Scanner;



public class DivideStrings {
    public static void main(String[] args) {
        final int MAX = 5;
        final int CUTOFF = 5;
        final String QUIT = "ZZZ";
        String entry;
        int shortSub = 0;
        int longSub = 0;
        String[] longStrings = new String[MAX];
        String[] shortStrings = new String[MAX];

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string or " + QUIT + " to quit >> ");
        entry = input.nextLine();
        while (!entry.equals(QUIT) && (shortSub + longSub < MAX)) {
            if (entry.length() <= CUTOFF) {
                shortStrings[shortSub++] = entry;
            }
            else {
                longStrings[longSub++] = entry;
            }
            if (shortSub + longSub < MAX) {
                System.out.print("Enter a string or " + QUIT + " to quit >> ");
                entry = input.nextLine();
            }
        }
        System.out.println("\nEnter 1 for the list of short strings, or 2 for the list of long strings");
        if (input.nextInt() == 1) {
            display(shortStrings,shortSub);
        }
        else if (input.nextInt() == 2) {
            display(longStrings,longSub);
        }
    }

    private static void display(String[] stringArray, int i) {
        System.out.print("Array: ");
        for (int j = 0; j < i; j++) {
            System.out.print(stringArray[j] + " ");
        }
        System.out.println("");
    }
}
