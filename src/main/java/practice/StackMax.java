package practice;

import java.util.Stack;

public class StackMax {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public static void main(String[] args) {
        StackMax sm = new StackMax();
        sm.push(1);
        System.out.println("POP should be 1");
        System.out.println(sm.max());

        sm.push(3);
        System.out.println("POP should be 3");
        System.out.println(sm.max());

        sm.push(2);
        System.out.println("POP should be 3");
        System.out.println(sm.max());
    }

    public Integer max(){
        if(stack2.isEmpty())
            return null;
        return stack2.peek();
    }

    public void push(int elem){
        stack1.push(elem);
        if(stack2.isEmpty() || stack2.peek() < elem){
            stack2.push(elem);
        }
    }

    public Integer pop(){
        if(stack1.isEmpty())
            return null;
       int elem = stack1.pop();
       if(stack2.peek() == elem){
           stack2.pop();
       }
       return elem;
    }
}
