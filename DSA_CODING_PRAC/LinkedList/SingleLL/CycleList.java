package LinkedList.SingleLL;

public class CycleList {

    private Node head;

    private Node tail;

    public int size;

    public CycleList(){
        this.size=0;
    }

    // insert first
    public void  insertFirst(int val){
        Node node =new Node(val);
        if(head==null){
            head=node;
            tail=node;
            node.next=head;
        }
        else {
            node.next=head;
            head=node;
            tail.next=node;
        }
        size++;
    }

    public void insertLast(int val){
        Node node=new Node(val);
        if(tail==null){
            head=node;
            tail=node;
            node.next=head;
        }
        else {
            tail.next=node;
            tail=node;
            node.next=head;
        }
        size++;
    }

    // insert at index
    public void insert(int index, int val){
        if(index<=1){
            insertFirst(val);
        }
        if(size==index){
            insertLast(val);
        }
        Node previous=get(index);
        Node node=new Node(val,previous.next);
        previous.next=node;
        size++;
    }

    // delete
    public int deleteFirst(){
        if(head==null){
            return -1;
        }
        int val= head.val;
        head=head.next;
        tail.next=head;
        size--;
        return val;
    }

    // delete last
    public int deleteLast(){
        if(head==null){
            return -1;
        }
        if(size<=1){
            deleteFirst();
        }

        Node previous=get(size-2);
        int val=previous.next.val;
        previous.next=head;
        tail=previous;
        size--;
        return val;
    }

    // get Node
    public Node get(int index){
        Node temp=head;
        for (int i = 0; i <index ; i++) {
            temp=temp.next;
        }
        return temp;
    }
    // display
    public void display(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        do {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }while (temp!=head);
        System.out.println("HEAD");
    }
    private class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
