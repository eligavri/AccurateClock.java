/**
 * Defining a generic class representing node .
 */
public class Node<E> {
    /**
     * defining parameters.
     */
    private E value;
    private Node<E> next;
    /**
     * defining a constructor.
     * @param value node's value.
     * @param next reference for thr next node.
     */
    public Node(E value, Node<E> next) {
        this.value = value;
        this.next = next;
    }
    /**
     * defining a constructor.
     * * initiates the next node to null.
     * @param value node's value.
     */
    public Node(E value) { this(value, null); }
    /**
     * @return the nod's value.
     */
    public E getValue() { return value; }

    /**
     * @return the next node.
     */
    public Node<E> getNext() { return next; }

    /**
     * sets the wanted nod's value.
     * @param value wanted nod's value
     */
    public void setValue(E value) { this.value = value; }
    /**
     * sets the next node.
     * @param next the next node.
     */
    public void setNext(Node<E> next) { this.next = next; }
}