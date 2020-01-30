package problem2;

import java.util.Arrays;
import java.util.Objects;

/**
 * The type Set.
 */
public class Set implements ISet {

  private Integer[] set;
  private Integer size;

  /**
   * Instantiates a new Set.
   */
  public Set() {
    Integer[] arr = {};
    this.set = arr;
    this.size = 0;
  }

  /**
   * Get set integer [ ].
   *
   * @return the integer [ ]
   */
  public Integer[] getSet() {
    return this.set;
  }

  private void setSet(Integer[] set) {
    this.set = set;
  }

  private void setSize(Integer size) {
    this.size = size;
  }

  /**
   * Creates and returns an empty Set
   *
   * @return an empty set
   */
  @Override
  public Set emptySet() {
    Integer[] empty = {};
    Set newSet = new Set();
    return newSet;
  }

  /**
   * Checks if the Set is empty. Returns true if the Set contains no items, false otherwise.
   *
   * @return true if the Set contains no items, false otherwise.
   */
  @Override
  public Boolean isEmpty() {
    if (this.size == 0) {
      return true;
    }
    return false;
  }

  /**
   * adds an Integer to a set
   *
   * @param n an Integer
   * @return a set
   */
  @Override
  public Set add(Integer n) {
    if (this.contains(n)) {
      return this;
    }
    Integer[] newArray = new Integer[this.size + 1];
    for (int i = 0; i < this.size; i++) {
      newArray[i] = this.set[i];
    }
    newArray[this.size] = n;
    Set newSet = new Set();
    newSet.setSize(this.size + 1);
    newSet.setSet(newArray);
    return newSet;
  }

  /**
   * checks if there exists an Integer in the set
   *
   * @param n an Integer
   * @return true if the given Integer is in the Set, false otherwise.
   */
  @Override
  public Boolean contains(Integer n) {
    for (int i = 0; i < this.size; i++) {
      if (n == this.set[i]) {
        return true;
      }
    }
    return false;
  }

  /**
   * removes an Integer from the set
   *
   * @param n an Integer
   * @return Returns a copy of the Set with the given Integer removed. If the given Integer is not
   * in the Set, returns the Set as is.
   */
  @Override
  public Set remove(Integer n) {
    if (this.contains(n)) {
      Integer[] newArray = new Integer[this.size - 1];
      for (int i = 0; i < this.size; i++) {
        if (n == this.set[i]) {
          for (int j = i; j < this.size - 1; j++) {
            newArray[j] = this.set[j + 1];
          }
          Set newSet = new Set();
          newSet.setSet(newArray);
          newSet.setSize(this.size - 1);
          return newSet;
        } else {
          newArray[i] = this.set[i];
        }
      }
    }
    return this;
  }

  /**
   * Gets the number of items in the Set
   *
   * @return the size of the set
   */
  @Override
  public Integer size() {
    return this.size;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Set set1 = (Set) o;

    if (!size.equals(set1.size)) {
      return false;
    }
    for (int i = 0; i < this.size; i++) {
      if (!this.contains(set1.set[i])) {
        return false;
      }
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(size);
    result = 31 * result;
    for (int i = 0; i < this.size; i++) {
      result += Objects.hash(this.set[i]);
    }
    return result;
  }

  @Override
  public String toString() {
    return "Set{" +
        "set=" + Arrays.toString(set) +
        ", size=" + size +
        '}';
  }
}
