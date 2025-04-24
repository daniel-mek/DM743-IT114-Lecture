public class LinkedStackOfIntDemo {
    public static void main(String[] args) {
        System.out.println("Daniel Mekhail, IT-114-004, Unit 13 In-Class Exercise, DM743@njit.edu");

        LinkedStackOfInt stack = new LinkedStackOfInt();

        System.out.println("Stack empty? " + stack.isEmpty());

        stack.push(17);
        stack.push(5);
        stack.push(123);
        System.out.println("After pushes, empty? " + stack.isEmpty());

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("After pops, empty? " + stack.isEmpty());
    }
}