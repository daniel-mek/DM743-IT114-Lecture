public class ArrayStackOfIntDemo {
    public static void main(String[] args) {
        System.out.println("Daniel Mekhail, IT-114-004, Unit 13 In-Class Exercise, DM743@njit.edu");

        ArrayStackOfInt stack = new ArrayStackOfInt();

        System.out.println("Stack empty? " + stack.isEmpty());

        int[] toPush = {17, 5, 123, 25, 12, 83, 46, 125, 8, 22};
        for (int v : toPush) {
            stack.push(v);
        }
        System.out.println("After pushes, empty? " + stack.isEmpty());

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
        System.out.println("After pops, empty? " + stack.isEmpty());
    }
}