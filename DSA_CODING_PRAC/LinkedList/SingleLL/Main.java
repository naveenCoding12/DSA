package LinkedList.SingleLL;

import Sorting.Cycle.CycleSort;

public class Main {
    public static void main(String[] args) {
//        LL list=new LL();
//        list.insert(3);
//        list.insert(6);
//        list.insert(9);
//        list.insert(11);
//        list.last(99);
//        list.insertIndex(100,3);
//        list.display();
//        System.out.println( list.deleteFirst());
//
//        list.display();
//        System.out.println(list.deleteLast());
//
//        list.display();
//        System.out.println(list.deleteIndex(2));
//
//        list.display();
//        System.out.println(list.find(6));

//        DLL list=new DLL();
//        list.insertFirst(3);
//        list.insertFirst(6);
//        list.insertFirst(9);
//        list.insertFirst(11);
//        list.insertLast(100);
//        list.insertLastNoTail(200);
//        list.insert(5,300);
//        list.deleteFirst();
//        list.deleteLast();
//        list.display();
//        System.out.println("Reverse order");
//        list.displayReverse();
//        System.out.println("size "+list.size);
//        list.delete(2);
//
//        list.display();

        CycleList list=new CycleList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.display();
        list.insertLast(0);
        System.out.println("insert last after :-  ");
        list.display();
        list.insert(2,100);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
    }
}
