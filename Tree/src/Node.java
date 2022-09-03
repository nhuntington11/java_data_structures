public class Node {
    public int iData; // Key
    public double dData; // Data item
    public Node leftChild;
    public Node rightChild;

    public void displayNode(){
        System.out.print('{');
        System.out.print(iData);
        System.out.print(", ");
        System.out.print(dData);
        System.out.print('}');
    }
}
