/**
 * A class that implements a linked list storing integers.
 * <p>
 * You need to complete this class by adding methods to insert, remove, and swap values.
 * Note that our test suites walks this list internally, so you need to maintain the start
 * reference and the structure of the Node class for the tests to pass.
 * <p>
 * Like trees, linked lists are also <i>recursive data structure</i>, since each part of the list is
 * itself a list. However, linked lists can be manipulated easily using both recursive and
 * iterative algorithms. We leave the choice to you.
 *
 * @see <a href="https://cs125.cs.illinois.edu/MP/5/">MP5 Documentation</a>
 * @see <a href="https://en.wikipedia.org/wiki/Linked_list">Linked List</a>
 */
public class SingleLL {

    /**
     * Internal class storing a node in our SingleLL.
     */
    public final class Node {
        /**
         * The integer value stored on the node.
         */
        private int value;

        /**
         * Get this node's value.
         *
         * @return this node's value
         */
        public int getValue() {
            return value;
        }

        /**
         * Set this node's value.
         *
         * @param setValue new value for this node
         */
        void setValue(final int setValue) {
            value = setValue;
        }

        /** Reference to the next node in the list. */
        private Node next;

        /**
         * Get this node's next node.
         *
         * @return this node's next node
         */
        public Node getNext() {
            return next;
        }

        /**
         * Set this node's next node.
         *
         * @param setNext new next node for this node
         */
        void setNext(final Node setNext) {
            next = setNext;
        }

        /**
         * Full constructor for the Node class.
         *
         * @param setValue the int value this node will store
         * @param setNext the next node in the list, or null if this node is the end of the list
         */
        Node(final int setValue, final Node setNext) {
            this.setValue(setValue);
            this.setNext(setNext);
        }
    }

    /** Start of this linked list. */
    private Node start;

    /**
     * Get a reference to the start of the list.
     * <p>
     * <strong>Do not remove or break this method.</strong> The testing suite uses it to do
     * its own testing.
     *
     * @return a reference to the start of the list
     */
    public Node getStart() {
        return start;
    }

    /**
     *
     * @param newValue the new value to insert
     * @param position the position to insert it in
     * @return true if succeeded, false if the position was invalid (less than 0 or off the end)
     */
    public boolean insert(final int newValue, final int position) {
        return true;
    }

    /**
     *
     * @param position the position to remove
     * @return true if removal succeeded, false if it failed
     */
    public boolean remove(final int position) {
        return true;
    }

    /**
     * Swap two values in the list.
     * @param firstPosition the first value to swap
     * @param secondPosition the second value to swap
     * @return true if the swap succeeded, false if it failed
     */
    public boolean swap(final int firstPosition, final int secondPosition) {
        return true;
    }
    /**
     * Add a new value to the front of the list.
     * <p>
     * <strong>Do not remove or break this method.</strong> The testing suite uses it to do
     * its own testing.
     *
     * @param newValue the new int value to add to the front of the list
     */
    public void unshift(final int newValue) {
        start = new Node(newValue, start);
    }

    /**
     * Empty constructor.
     * <p>
     * <strong>Do not remove or break this method.</strong> The testing suite uses it to do
     * its own testing. You may want to add other constructors as needed.
     */
    SingleLL() { }
}
