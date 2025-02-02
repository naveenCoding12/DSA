package Queue;

public class CustomQueue {

    protected int[] data;
    protected static final int DEFAULT_SIZE = 10;
    protected int size = 0;
    protected int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    // Insert or push
    public boolean push(int item) throws QueueExpection {
        if (isFull()) {
            throw new QueueExpection("Queue is full");
        }
        data[end++] = item; // Add element at the end
        size++;
        return true;
    }

    // Pop
    public int pop() throws QueueExpection {
        if (isEmpty()) {
            throw new QueueExpection("Queue is empty");
        }
        int removedItem = data[0]; // Store the removed element

        // Shift elements left
        for (int i = 0; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        end--;  // Move end pointer back
        size--; // Reduce size count
        return removedItem;
    }

    // Peek
    public int peek() throws QueueExpection {
        if (isEmpty()) {
            throw new QueueExpection("Queue is empty");
        }
        return data[0]; // Return front element
    }

    // Display queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < size; i++) { // Print only valid elements
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }

    public boolean isFull() {
        return size == data.length; // Fix condition
    }

    public boolean isEmpty() {
        return size == 0; // Fix condition
    }
}

