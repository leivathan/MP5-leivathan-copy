import java.util.Random;
/**
 * A class that implements a basic binary search tree storing integers.
 * <p>
 *     You need to complete this class by adding methods to insert values,
 *     compute the minimum and maximum, search for a value,
 *     and compute a value's depth in the tree and number of descendants.
 *     You will also need to complete
 *     several constructors used during tree creation and value insertion.
 * </p>
 */
public class Tree {
    /**
     * The value stored on the node.
     */
    private int value;
    /**
     * The tree stored on the left descendant.
     */
    private Tree left;
    /**
     * The tree stored on the right descendant.
     */
    private Tree right;
    /**
     * The parent tree from which this descends.
     */
    private Tree parent;
    /**
     * A random value.
     */
    private Random random = new Random();
    /**
     * The depth of the tree.
     */
    private int depth;
    /**
     * A thing.
     */
    private static int dep;
    /**
     * The number of descendants.
     */
    private int descend;
    /**
     * Another thing.
     */
    private static int desc = 0;


    /**
     * A constructor to set just the value on the tree.
     * @param setValue the value to be set
     */
    public Tree(final int setValue) {
        value = setValue;
    }

    /**
     * A constructor to set both the value onn the tree, and its parent tree.
     * @param setValue the value to which value should be set
     * @param setParent the parent to be set
     */
    public Tree(final int setValue, final Tree setParent) {
        value = setValue;
        parent = setParent;
    }

    /**
     * A constructor to set them all, a constructor to rule them.
     * @param setValue value
     * @param setLeft left
     * @param setRight right
     * @param setParent parent
     */
    public Tree(final int setValue, final Tree setLeft, final Tree setRight, final Tree setParent) {
        value = setValue;
        parent = setParent;
        right = setRight;
        left = setLeft;
    }

    /**
     *
     * @param newValue the value of the insert
     * @return true if it passes, false if the value exists in the tree.
     */
    public boolean insert(final int newValue) {
        if (this.search(newValue) != null) {
            return false;
        } else {
            if (newValue < this.value) {
                if (this.left == null) {
                    this.left = new Tree(newValue, this);
                    return true;
                } else {
                    return this.left.insert(newValue);
                }
            } else if (newValue > this.value) {
                if (this.right == null) {
                    this.right = new Tree(newValue, this);
                    return true;
                } else {
                    return this.right.insert(newValue);
                }
            }
        }
        return false;
    }

    /**
     *
     * @param searchValue the value to search for
     * @return the tree with that value.
     */
    public Tree search(final int searchValue) {
        //boolean exist = false;
        if (this.value == searchValue) {
            //exist = true;
            return this;
        } else if (this.value > searchValue && left != null) {
            return left.search(searchValue);
        } else if (this.value < searchValue && right != null) {
            return right.search(searchValue);
        }
        return null;
    }

    /**
     * Find the smallest value in the tree.
     * @return the minimum value
     */
    public int minimum() {
        if (left == null) {
            return this.value;
        } else {
            return left.minimum();
        }
    }

    /**
     * Find the largest value in the tree.
     * @return the maximum value
     */
    public int maximum() {
        if (right == null) {
            return this.value;
        } else {
            return right.maximum();
        }
    }

    /**
     * Return the depth of this node from the root of the tree.
     * @return the depth of this node relative to the root
     */
    public int depth() {
        if (this.parent == null) {
            depth = dep;
            dep = 0;
            return depth;
        } else {
            dep++;
            return parent.depth();
        }

    }

    /**
     * Return the number of nodes below this node in the tree.
     * @return the number of nodes below this node in the tree
     */
    public int descendants() {
        if (this.left == null && this.right == null) {
            return 0;
        } else if (this.left != null && this.right != null) {
            return 1 + 1 + this.left.descendants() + this.right.descendants();
        } else if (this.left != null) {
            return 1 + this.left.descendants();
        } else if (this.right != null) {
            return 1 + this.right.descendants();
        }
        return 0;
    }
}
