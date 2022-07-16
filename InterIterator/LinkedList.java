public class LinkedList {
    private Link first;

    public LinkedList() {
        first = null;
    }

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link f) {
        first = f;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public ListIterator getIterator() {
        return new ListIterator(this);
    }

    public void displayList() {
        Link current = first;
        System.out.print("List (first --> last): ");
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
