package LinkedList.SingleLL;

public class DLL {
    private Node head;
    private Node tail;
    public int size;

    public DLL() {
        this.size = 0;
    }

    // insert first
    public void insertFirst(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
            size++;
            return;
        }
        node.next=head;
        head.previous=node;
        head=node;
        if(node.previous==null){
            node.previous=null;
        }
        size++;
    }

    //insert last
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
        }
        Node node=new Node(val);
        tail.next=node;
        node.previous=tail;
        node.next=null;
        tail=node;
        size++;
    }

    // if no tail is given
    public void insertLastNoTail(int val){
        Node last =head;
        while(!(last.next==null)){
            last=last.next;
        }
        Node node=new Node(val);
        last.next=node;
        node.previous=last;
        node.next=null;
        size++;
    }

    // insert at index
    public void insert(int index,int val){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
        }
        // find the previous one
        Node pre=get(index-1);
        Node node=new Node(val,pre.next,pre);
        pre.next=node;
        size++;
    }

    public int deleteFirst(){
        int val=head.value;
        head.previous=null;
        head=head.next;
        if(head==null){
            head=null;
            tail=null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size<=1){
            deleteFirst();
        }
        // find the last before one
        Node node=get(size-2);
        int val=node.next.value;
        node.next=null;
        tail=node;
        size--;
        return val;
    }

    public int delete(int index){
        if(index==0){
            deleteLast();
        }
        if(index==size){
            deleteLast();
        }
        // get node before the index
        Node pre=get(index-1);
        int val=pre.next.value;
        pre.next=pre.next.next;
        size--;
        return val;
    }

    // get node by index
    public Node get(int tindex){
        Node temp=head;
        for (int i = 0; i <tindex ; i++) {
            temp=temp.next;
        }
        return temp;
    }

    // find index
    public Node find(int val){
        Node temp=head;
        while (temp!=null){
            if(temp.value==val){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

    // display the list
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    // display reverse
    public void displayReverse(){
        Node node=tail;
        while(node!=null){
            System.out.print(node.value+"->");
            node=node.previous;
        }
        System.out.println("HEAD");
    }


    private class Node {
        private int value;
        ;
        private Node next;
        private Node previous;

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }

        public Node(int value) {
            this.value = value;
        }
    }
}
