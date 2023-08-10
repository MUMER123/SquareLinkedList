public class Main {
    public static void main(String[] args) {

        SquareList list = new SquareList();
        list.insertAtEnd(5);
        list.insertAtEnd(10);
        list.insertAtEnd(15);
        list.insertAtEnd(20);
        list.insertAtStart(2);
        list.deleteNode(10);
        list.insertAtEnd(25);
        list.traversal();
    }
}