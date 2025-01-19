package LinkedList.SingleLL;

import java.util.LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public void insert(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        // If list is empty, the new node is both the head and the tail
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void last(int val){
        if(tail==null){
            this.insert(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insertIndex(int val, int index){
        if(index==0){
            insert(val);
            return;
        }
        if(index==size){
            last(val);
            return;
        }
        Node temp=head;
        for (int i = 1; i <index ; i++) {
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;

    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;  // Move to the next node
        }
        System.out.print("END");
    }

    public int deleteFirst(){
        int val= head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size<=1){
            deleteFirst();
        }
        int val= tail.value;
        Node previous=get(size-2);
        tail=previous;
        tail.next=null;
        size--;
        return val;
    }

    public int deleteIndex(int index){
        if(index==0){
            deleteFirst();
        }
        if(index==size-1){
            deleteLast();
        }
        Node previous=get(index-1);
        int val= previous.next.value;
        previous.next=previous.next.next;
        size--;
        return  val;
    }

    public Node find(int value){
        Node node=head;
        while (node !=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public Node get(int index){
        Node node=head;
        for (int i = 0; i <index ; i++) {
            node=node.next;
        }
        return node;
    }
 
    // Inner Node class
    private class Node {
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }


    }
}