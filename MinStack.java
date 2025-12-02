import java.util.EmptyStackException;

public class MinStack {

    // The head (top) of the linked-list stack
    private Node head;

    // Node class: stores value, min so far, and next reference
    private static class Node {
        int val;
        int min;
        Node next;

        Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }

    // Push a value onto the stack
    public void push(int val) {
        if (head == null) {
            head = new Node(val, val, null);
        } else {
            head = new Node(val, Math.min(val, head.min), head);
        }
    }

    // Pop the top value off the stack
    public void pop() {
        if (head == null) {
            throw new EmptyStackException();
        }
        head = head.next;
    }

    // Return the top value without removing it
    public int top() {
        if (head == null) {
            throw new EmptyStackException();
        }
        return head.val;
    }

    // Return the minimum value in O(1)
    public int getMin() {
        if (head == null) {
            throw new EmptyStackException();
        }
        return head.min;
    }

    // Demonstration / testing
    public static void main(String[] args) {
        MinStack s = new MinStack();

        System.out.println("Pushing 3, 5, 2, 1, 4...");
        s.push(3);  System.out.println("\nmin=" + s.getMin() + " top=" + s.top());
        s.push(5);  System.out.println("min=" + s.getMin() + " top=" + s.top());
        s.push(2);  System.out.println("min=" + s.getMin() + " top=" + s.top());
        s.push(1);  System.out.println("min=" + s.getMin() + " top=" + s.top());
        s.push(4);  System.out.println("min=" + s.getMin() + " top=" + s.top());

        System.out.println("\nPopping twice...");
        s.pop();    System.out.println("min=" + s.getMin() + " top=" + s.top());
        s.pop();    System.out.println("min=" + s.getMin() + " top=" + s.top());

        System.out.println("\nFinal pops until empty:");
        while (true) {
            try {
                System.out.println("top=" + s.top() + " min=" + s.getMin());
                s.pop();
            } catch (EmptyStackException e) {
                System.out.println("Stack is empty now.\n");
                break;
            }
        }
    }
}
