package LinkedList.problems;

public class Problems {
    public class LL {

        private Node head;
        private Node tail;

        public int size;

        public LL() {
            this.size = 0;
        }

        // Display the linked list
        public void display() {
            if (size == 0) {
                return;
            }
            Node node = head;
            while (node != null) {
                System.out.print(node.val + " -> ");
                node = node.next;
            }
            System.out.println("END");
        }

        // Get node by index
        public Node get(int index) {
            Node node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node;
        }

        // Get node by value
        public Node find(int val) {
            Node node = head;
            while (node != null) {
                if (node.val == val) {
                    return node;
                }
                node = node.next;
            }
            return null;
        }

        // Insert at the beginning of the list
        public void insertFirst(int val) {
            Node node = new Node(val);
            node.next = head;
            head = node;
            if (tail == null) {
                tail = node;
            }
            size++;
        }

        // Insert at the end of the list
        public void insertLast(int val) {
            Node node = new Node(val);
            if (tail != null) {
                tail.next = node; // Link the last node to the new node
            }
            tail = node;
            if (head == null) {
                head = node; // If the list is empty, the new node is also the head
            }
            size++;
        }

        // Insert at a given index
        public void insert(int index, int value) {
            if (index == 0) {
                insertFirst(value);
                return;
            }
            if (index == size) {
                insertLast(value);
                return;
            }

            // Get the previous node for insertion
            Node previous = get(index - 1);
            Node node = new Node(value, previous.next);
            previous.next = node;
            size++;
        }

        // Insert recursively
        public void insertRec(int index, int value) {
            head = insertRec(index, value, head);
        }

        private Node insertRec(int index, int val, Node node) {
            // Base condition
            if (index == 0) {
                Node temp = new Node(val, node);
                size++;
                return temp;
            }
            node.next = insertRec(index - 1, val, node.next);
            return node;
        }

        // Remove duplicates in a sorted list
        public void removeDuplicates() {
            if (size == 0) {
                return;
            }
            Node node = head;
            while (node != null && node.next != null) {
                if (node.val == node.next.val) {
                    node.next = node.next.next;
                    size--;
                } else {
                    node = node.next;
                }
            }
            tail = node; // Update tail to the last node
            tail.next = null; // Ensure the last node points to null
        }

        // Merge two sorted lists
        public LL merge(LL list1, LL list2) {
            Node f = list1.head;
            Node s = list2.head;
            LL out = new LL();

            // Merge the two lists while both have nodes
            while (f != null && s != null) {
                if (f.val < s.val) {
                    out.insertLast(f.val); // Add the smaller node to the result
                    f = f.next;
                } else {
                    out.insertLast(s.val); // Add the smaller node to the result
                    s = s.next;
                }
            }

            // If there are remaining nodes in list1
            while (f != null) {
                out.insertLast(f.val);
                f = f.next;
            }

            // If there are remaining nodes in list2
            while (s != null) {
                out.insertLast(s.val);
                s = s.next;
            }

            return out; // Return the merged list
        }

        // return cycle is present or not

        public boolean cycle(){
            // two pointer methods
            Node fast=head;
            Node slow=head;
            while (fast!=null & fast.next !=null){
                fast=fast.next.next;
                slow=slow.next;
                if(fast==slow){
                    return true;
                }
            }
            return false;
        }

        // cycle count

        public int cycleCount(){
            Node fast=head;
            Node slow=head;
            int count=0;
            while (fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
                if(fast==slow){
                    Node temp=slow;
                    do{
                        temp=temp.next;
                        count++;
                    }
                    while (temp!=slow);
                }
            }
            return count;
        }

        // return the cycle node
        public Node cycleNode(){
            Node fast=head;
            Node slow=head;
            int length=0;
            while(fast !=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
                if(fast==slow){
                    Node temp=slow;
                    do {
                        temp=temp.next;
                        length++;
                    }while (temp!=null);
                }
            }
            if (length==0){
                return null; // if the cycle is not present
            }
            // start the slow pointer
            Node f=head;
            Node s=head;
            while (length>0){
                s=s.next;
                length--;
            }
            while (f!=s){
                f=f.next;
                s=s.next;
            }
            return s;
        }

        private class Node {

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

    public static void main(String[] args) {
        Problems problems = new Problems();
        LL list = problems.new LL();

        // Adding elements to the first list
        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertLast(5);
        list.insertLast(5);
        System.out.println("Original List:");
        list.display();

        // Removing duplicates and displaying the list
        list.removeDuplicates();
        System.out.println("After Removing Duplicates:");
        list.display();

        // Adding elements to the second list
        LL list2 = problems.new LL();
        list2.insertLast(10);
        list2.insertLast(20);
        list2.insertLast(30);
        list2.insertLast(40);
        list2.insertLast(10);
        list2.insertLast(10);

        System.out.println("Second List:");
        list2.display();

        // Merging the two lists
        LL mergedList = list.merge(list, list2);
        System.out.println("Merged List:");
        mergedList.display();
    }
}
