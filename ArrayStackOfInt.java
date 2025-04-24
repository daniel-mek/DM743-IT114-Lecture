import java.util.Arrays;

public class ArrayStackOfInt {
    private int[] items;
    private int top;

    public ArrayStackOfInt() {
        items = new int[10];
        top = 0;
    }

    public void push(int item) {
        if (top == items.length) {
            items = Arrays.copyOf(items, 2 * items.length);
        }
        items[top++] = item;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Can't pop from an empty stack.");
        }
        return items[--top];
    }

    public boolean isEmpty() {
        return top == 0;
    }
}