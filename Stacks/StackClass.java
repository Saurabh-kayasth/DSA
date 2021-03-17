// Stack uses LIFO ( Last In First Out )
// if stack is full, and we try to push an element then this condition is said to be overflow
// if stack is empty , and we try pop an element then this condition is said to be overflow
// peek() returns the last element pushed onto stack
// isEmpty() checks if stack is empty or not

public class StackClass {

    static final int size = 10;
    int[] arr = new int[size];
    int pointer = -1;

    void push(int data) {
        if (pointer >= size - 1) {
            System.out.println("Overflow");
        } else {
            arr[++pointer] = data;
        }

    }

    int peek() {
        if (pointer < 0) {
            System.out.println("underflow.");
            return 0;
        } else {
            return arr[pointer];
        }

    }

    void pop() {
        if (pointer < 0) {
            System.out.println("underflow.");
        } else {
            --pointer;
        }

    }

    void show() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    boolean isEmpty() {
        if (pointer < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        StackClass stack = new StackClass();
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.pop();
        stack.pop();
        // stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
