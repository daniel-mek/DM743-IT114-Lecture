public class LinkedStackOfInt {
    private Node top;

    private static class Node {
        int item;
        Node next;
        Node(int item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public LinkedStackOfInt() {
        top = null;
    }

    public void push(int item) {
        top = new Node(item, top);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Can't pop from an empty stack.");
        }
        int result = top.item;
        top = top.next;
        return result;
    }

    public boolean isEmpty() {
        return top == null;
    }
}