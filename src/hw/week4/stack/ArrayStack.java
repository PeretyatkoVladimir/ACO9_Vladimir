package hw.week4.stack;

import java.util.Arrays;

public class ArrayStack implements IStack {

    public static final int DEFAULT_STACK_SIZE = 10;
    public static final int DEFAULT_STEP_INC_SIZE = 5;

    private Object[] stack;
    private int top;

    public ArrayStack(){
        this.stack = new Object[DEFAULT_STACK_SIZE];
        this.top = 0;
    }

    @Override
    public void push(Object object) {
        this.stack[top++] = object;
        checkAndIncSize();
    }

    @Override
    public Object pop() {

        decTop();

        if (isEmpty()) {
            throw new StackException("Stack is empty"); 
            //return null;
        }

        Object object = this.stack[top];
        this.stack[top] = null;

        return object;
    }

    @Override
    public void clear() {
        this.stack = new Object[DEFAULT_STACK_SIZE];
        top = 0;
    }

    @Override
    public int size() {
        if (isEmpty()) {
            return 0;
        }
        return top + 1;
    }
    
    @Override
    public boolean isEmpty() {
        return top == 0 && this.stack[top] == null;
    }

    @Override
    public String toString() {
        String strRes = "{ ";
        for (int i = 0; i < this.top; i++) {
            strRes += this.stack[i] + " ";
        }
        return strRes + "}";
    }

    private void decTop() {
        if (this.top != 0) {
            this.top--;
        }
    }

    private void checkAndIncSize() {
        if (top >= this.stack.length) {
            this.stack = Arrays.copyOf(this.stack, this.stack.length + DEFAULT_STEP_INC_SIZE);
        }
    }
    
    public class StackException extends RuntimeException { 
            public StackException(String message) { 
                  super(message); 
            } 
      } 
    
}
