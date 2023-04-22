package linkedList;

public class LinkedList {

    static Node head;
    /* insertion of node in linkedList */
    static void insert(int value) {
        Node newNode = new Node();
        newNode.setData(value);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }
    /* print linkedList */
    static void print() {
        Node temp = head;
        while (temp !=null) {
            System.out.print(temp.getData()+ "\t");
            temp = temp.getNext();
        }
    }
    /* print linkedList reverse */
    static void printReverse() {
        Node temp = head;
        Node current = null ,previous = null;
        while (temp != null) {
            current = temp;
            temp = temp.getNext();
            current.setNext(previous);
            previous = current;
            head = current;
        }
        print();
    }
    /* print linkedList recursion */
    static void printRecursion(Node p) {
        if (p == null) {
            return;
        }
        System.out.print(p.getData()+ "\t");
        p = p.getNext();
        printRecursion(p);
    }
    /* print linkedList recursion reverse */
    static void printRecursionReverse(Node p) {
        if (p == null) {
            return;
        }
        printRecursionReverse(p.getNext());
        System.out.print(p.getData()+ "\t");
    }
    public static void main(String[] args) {
        insert(23);
        insert(34);
        insert(12);
        insert(10);
        System.out.println("Print LinkedList:");
        print();
        System.out.println("\n"+"Print LinkedList Reverse:");
        printReverse();
        System.out.println("\n"+"Print LinkedList Recursion:");
        printRecursion(head);
        System.out.println("\n"+"Print LinkedList Recursion Reverse:");
        printRecursionReverse(head);
    }

}
