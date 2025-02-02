package Stack;

import java.util.Arrays;

public class CustomStack {

    protected int [] data;

    protected static final int DEFAULT_SIZE=10;

    protected int pointer=-1;

    public int size=0;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data=new int[size];
    }

    // insert or push operation

    public boolean push(int item) throws StackException{
        if(isFull()){
            throw new StackException("stack is full");
        }
        data[++pointer]=item;
        size++;
        return true;
    }

    // pop

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("stack is empty");
        }
        int removed=data[pointer];
        data[pointer]=0;
        pointer--;
        size--;
        return removed;
    }

    // peek top of the stack

    public int peek() throws  StackException{
        if (isEmpty()){
            throw new StackException("stack is an empty");
        }
        return data[pointer];
    }

    public boolean isFull(){
        return pointer== data.length-1;
    }

    public boolean isEmpty(){
        return pointer==-1;
    }

    public void display(){
        if (isEmpty()){
            System.out.println("NO ARRAY ");
            return;
        }
        for(int e:data){
            System.out.print(e+" ->");
        }
        System.out.println("END");
    }
}
