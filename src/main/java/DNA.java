/**
 * A class that represents a DNA sequence.
 * <p>
 * Internally the class represents DNA as a string. You are responsible for implementing the longest
 * common subsequence method and a straightforward constructor.
 * <p>
 * The DNA class does not need to provide a setter for the sequence, meaning that it can be allowed
 * to not change after the instance is created. As a result, it should not provide an empty
 * constructor.
 *
 * @see <a href="https://cs125.cs.illinois.edu/MP/5/">MP5 Documentation</a>
 */
public class DNA {

    /** Sequence of base pairs for this DNA instance. */
    private String sequence;

    /**
     * Gets the sequence of base pairs for this DNA instance.
     *
     * @return the sequence of base pairs for this DNA instance
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Create a new DNA instance from the given sequence of base pairs.
     * <p>
     * The constructor should validate and normalize its inputs. All characters in the string should
     * be from the set A, T, C, and G (this in DNA, not RNA). You should accept lower-case inputs
     * but convert them to upper-case for the purposes of later comparison.
     *
     * @param setSequence the sequence of base pairs to initialize the instance with
     */
    public DNA(final String setSequence) {
        sequence = setSequence.toUpperCase();
    }
}
