import java.util.Stack;

public class ReverseStack {

    // Function to reverse the stack
    static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        // Pop the top element and hold it in the recursion stack
        int top = s.pop();

        // Reverse the remaining stack
        reverse(s);

        // Insert the held element at the bottom of the reversed stack
        insertAtBottom(s, top);
    }

    // Helper function to insert an element at the bottom of the stack
    static void insertAtBottom(Stack<Integer> s, int element) {
        if (s.isEmpty()) {
            s.push(element);
            return;
        }

        // Pop the top element and hold it in the recursion stack
        int top = s.pop();

        // Insert the element at the bottom
        insertAtBottom(s, element);

        // Push the held element back on top of the stack
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Original Stack: " + stack);
        reverse(stack);
        System.out.println("Reversed Stack: " + stack);
    }
}
