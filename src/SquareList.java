public class SquareList {
    private Node head;
    SquareList(){
        this.head = null;
    }
    SquareList(Square data){
        this.head = new Node(data);
    }
    Node getHead(){
        return this.head;
    }
    void setHead(Node head){
        this.head = head;
    }
    boolean isEmpty(){
        return this.head==null;
    }
    void insertAtEnd(int lengthofSide){
        if(isEmpty()){
            this.head = new Node(new Square(lengthofSide));
        }
        else{
            Node temp = this.head;
            while(temp.getNext()!=null){
                temp = temp.getNext();
            }
            temp.setNext(new Node(new Square(lengthofSide)));
        }
    }
    void insertAtStart(int lengthofSide){
        Node newNode = new Node(new Square(lengthofSide));
        newNode.setNext(this.head);
        head = newNode;
    }
    void deleteNode(int lengthofSide){
        if(isEmpty()){
            System.out.println("List is already empty");
        }
        else{
            Node temp = this.head;
            while(temp.getNext().getData().getLengthofSide()!=lengthofSide){
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
        }
    }
    void traversal(){
        Node temp = this.head;
        while(temp!=null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
}

