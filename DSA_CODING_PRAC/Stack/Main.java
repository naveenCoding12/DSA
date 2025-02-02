package Stack;

import java.util.Stack;

public class Main{

    public static void main(String[] args) throws StackException{

//        CustomStack stack=new CustomStack(5);
        DynamicStack stack=new DynamicStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(4);
        stack.display();
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.display();

    }
}
