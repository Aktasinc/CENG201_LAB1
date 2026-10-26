/**
 * BracketStack.java
 *
 * Sami Yusuf Aktaş
 * 250444045
 * 26.10.2026
 */

public class BracketStack {

    private class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public BracketStack() {
        top = null;
    }

    // TODO 1
    public void push(char value) {
        Node newNode = new Node(value);  // create the new node
        newNode.next = top;              // link it to the current top
        top = newNode;                   // it becomes the new top
    }

    // TODO 2
    public char pop() {
        if (isEmpty()) {
            return '\0';                 // nothing to remove
        }
        char value = top.data;           // save the data first
        top = top.next;                  // move top to the node below
        return value;
    }

    // TODO 3
    public char peek() {
        if (isEmpty()) {
            return '\0';
        }
        return top.data;                 // look at the top without removing it
    }

    // TODO 4
    public boolean isEmpty() {
        return top == null;
    }
}
