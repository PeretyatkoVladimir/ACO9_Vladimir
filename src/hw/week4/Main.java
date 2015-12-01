package hw.week4;

import hw.testData.InitTestData;
import hw.week4.stack.ArrayStack;
import hw.week4.stack.LinkedStack;

public class Main {

    public static void main(String[] args) {

        // Array Stack
        ArrayStack arrayStack = InitTestData.hwWeek4ArrayStack();

        System.out.println(arrayStack);

        for (int i = 0; i < 2; i++) {
            System.out.println("POP - " + arrayStack.pop());
            System.out.println(arrayStack);
        }

        // Linked Stack
        LinkedStack linkedStack = InitTestData.hwWeek4LinkedStack();

        System.out.println(linkedStack);

        for (int i = 0; i < 18; i++) {
            System.out.println("POP - " + linkedStack.pop() + ", size -" + linkedStack.size());
            System.out.println(linkedStack);
        }
    }
}
