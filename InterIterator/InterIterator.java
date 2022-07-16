import java.io.*;

public class InterIterator {
    public static void main(String[] args) throws IOException {
        LinkedList theList = new LinkedList();
        ListIterator iter1 = new ListIterator(theList);
        long value;

        iter1.insertAfter(20);
        iter1.insertAfter(40);
        iter1.insertAfter(80);
        iter1.insertBefore(60);

        while (true) {
            System.out.print("Enter first letter of show, reset, ");
            System.out.print("next, get, before, after, delete: ");
            System.out.flush();
            int choice = getChar();
            switch(choice) {
                case 's':
                    if (!theList.isEmpty()){
                        theList.displayList();
                    }
                    else{
                        System.out.print("List is empty.");
                    }
                    break;
                case 'r':
                    iter1.reset();
                    break;
                case 'n':
                    if (!theList.isEmpty() && !iter1.atEnd()) {
                        iter1.nextLink();
                    }
                    else {
                        System.out.print("Can't go to next link.");
                    }
                    break;
                case 'g':
                    if (!theList.isEmpty()) {
                        value = iter1.getCurrent().dData;
                        System.out.println("Returned: " + value);
                    }
                    else {
                        System.out.print("The list is empty.");
                    }
                    break;
                case 'b':
                    System.out.print("Enter value to insert: ");
                    System.out.flush();
                    value = getInt();
                    iter1.insertBefore(value);
                    break;
                case 'a':
                    System.out.print("Enter a value to insert: ");
                    System.out.flush();
                    value = getInt();
                    iter1.insertAfter(value);
                    break;
                case 'd':
                    if (!theList.isEmpty()) {
                        value = iter1.deleteCurrent();
                        System.out.print("Deleted value " + value);
                    }
                    else {
                        System.out.println("Can't delete");
                    }
                    break;
                default:
                    System.out.println("Invalid entry");
            }
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
