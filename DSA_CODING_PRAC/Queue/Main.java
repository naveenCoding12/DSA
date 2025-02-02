package Queue;

import java.util.Queue;

public class Main {

    public static void main(String[] args) throws QueueExpection {

//        CustomQueue queue = new CustomQueue(5);
//        DynamicQueue queue=new DynamicQueue(5);
        CyclicDynamicQueue queue=new CyclicDynamicQueue(5);
        for (int i = 0; i <=10 ; i++) {
            queue.push(i+1);
        }
        queue.display();
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        queue.display();
    }

}
