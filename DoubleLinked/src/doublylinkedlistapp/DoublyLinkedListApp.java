package doublylinkedlistapp;

public class DoublyLinkedListApp {
    public static void main(String[] args) {
        DoublyLinkedList theDList = new DoublyLinkedList();

        theDList.insertFirst(11);
        theDList.insertFirst(22);
        theDList.displayForward();
        theDList.displayBackward();

        theDList.insertLast(33);
        theDList.insertLast(44);
        theDList.displayForward();
        theDList.displayBackward();

        theDList.deleteFirst().displayLink();

        theDList.displayForward();
        theDList.displayBackward();

        theDList.deleteLast().displayLink();
        theDList.insertAfter(11, 25);
        theDList.deleteKey(33);

        theDList.displayForward();
        theDList.displayBackward();
    }
}
