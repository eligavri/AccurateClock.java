/**
 * Defining a generic class representing stack .
 */
public class Stack <E>{
    /**
     * defining parameters.
     */
    private Node<E> head;
    /**
     * defining a constructor.
     * initiates the head node to null.
     */
    public Stack() { head = null; }
    /**
     * implementing a method to add a new node to the head of the stack.
     * @param item the added element.
     */
    public void push(E item) {
        Node<E> newHead = new Node<>(item);
        newHead.setNext(head);
        head = newHead;
    }
    /**
     * implementing a method to pop a node from the head of the stack.
     */
    public E pop() {
        if (head == null) {
            return null;
        }
        E item = head.getValue();
        head = head.getNext();
        return item;
    }

}