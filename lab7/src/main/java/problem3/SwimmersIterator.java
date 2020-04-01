package problem3;

import java.util.Iterator;
import java.util.List;
import problem2.Swimmer;

/**
 * The type Swimmers iterator.
 */
public class SwimmersIterator implements Iterator<Swimmer> {

  private List<Swimmer> swimmerList;
  private int current;

  /**
   * Instantiates a new Swimmers iterator.
   *
   * @param swimmerList the swimmer list
   */
  public SwimmersIterator(List<Swimmer> swimmerList) {
    this.swimmerList = swimmerList;
    this.current = 0;
    while (this.current < this.swimmerList.size()
        && (!this.swimmerList.get(this.current).achieveOlympic()
        || !this.swimmerList.get(this.current).haveFiveButterflyTime())) {
      this.current += 1;
    }
  }

  @Override
  public boolean hasNext() {
    return this.current < this.swimmerList.size();
  }

  @Override
  public Swimmer next() {
    Swimmer swimmer = this.swimmerList.get(this.current);
    this.current += 1;
    while (this.current < this.swimmerList.size()
        && (!this.swimmerList.get(this.current).achieveOlympic()
        || !this.swimmerList.get(this.current).haveFiveButterflyTime())) {
      this.current += 1;
    }
    return swimmer;
  }


  /**
   * Gets current.
   *
   * @return the current
   */
  public int getCurrent() {
    return current;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    SwimmersIterator that = (SwimmersIterator) o;

    if (current != that.current) {
      return false;
    }
    return swimmerList.equals(that.swimmerList);
  }

  @Override
  public int hashCode() {
    int result = swimmerList.hashCode();
    result = 31 * result + current;
    return result;
  }

  @Override
  public String toString() {
    return "SwimmersIterator{" +
        "swimmerList=" + swimmerList +
        ", current=" + current +
        '}';
  }
}
