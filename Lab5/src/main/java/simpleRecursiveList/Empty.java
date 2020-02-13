package simpleRecursiveList;

import javax.print.DocFlavor.INPUT_STREAM;

/**
 * Represents the empty list of integers.
 */


public class Empty implements List {

    @Override
    public Integer size() {
        return 0;
    }

    @Override
    public Boolean isEmpty() {
        return true;
    }

    @Override
    public List add(Integer element) {
        return new Cons(element, this);
    }

    @Override
    public Integer last() throws InvalidCallException {
        throw new InvalidCallException("Called last() on empty!");
    }

    public Integer getFirst() {
        return null;
    }

    @Override
    public boolean contains(Integer element) {
        return false;
    }

    @Override
    public Integer elementAt(Integer index) throws InvalidCallException {
        throw new InvalidCallException("index is out of bounds");
    }

    @Override
    public List getRest() {
        return null;
    }

    @Override
    public List remove(Integer n) {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        else return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return 42;
    }

    @Override
    public String toString() {
        return "Empty{}";
    }
}
