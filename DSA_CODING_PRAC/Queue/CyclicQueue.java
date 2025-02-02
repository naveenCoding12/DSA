package Queue;

public class CyclicQueue {
    protected int[] data;
    protected static final int DEFAULT_SIZE = 10;
    protected int size = 0;
    protected int front = 0;
    protected int end = 0;

    public CyclicQueue() {
        this(DEFAULT_SIZE);
    }

    public CyclicQueue(int size) {
        this.data = new int[size];
    }

    // Push (Enqueue)
    public boolean push(int item) throws QueueExpection {
        if (isFull()) {
            throw new QueueExpection("Queue is full");
        }
        data[end++] = item;
        end = end  % data.length; // Circular increment
        size++;
        return true;
    }

    // Pop (Dequeue)
    public int pop() throws QueueExpection {
        if (isEmpty()) {
            throw new QueueExpection("Queue is empty");
        }
        int removed = data[front++];
        front = (front) % data.length; // Circular increment
        size--;
        return removed;
    }

    // Peek
    public int peek() throws QueueExpection {
        if (isEmpty()) {
            throw new QueueExpection("Queue is empty");
        }
        return data[front];
    }

    // Display Queue Elements
    public void display() throws QueueExpection {
        if (isEmpty()) {
            throw new QueueExpection("Queue is empty");
        }
        int i=front;
       do{
           System.out.print(data[i]+" <-");
           i++;
           i=i% data.length;
       }while (i!=end);
        System.out.println("END");
    }

    // Check if Queue is Full
    public boolean isFull() {
        return size == data.length; // Circular queue is full when size equals capacity
    }

    // Check if Queue is Empty
    public boolean isEmpty() {
        return size == 0;
    }
}
