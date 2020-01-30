package problem1;

public class Queue implements IQueue{

  private Integer size;
  private Integer[] arr;

  public Queue() {
    Integer[] a = {};
    this.size = 0;
    this.arr = a;
  }

  /**
   * Adds an Integer to the Queue.
   *
   * @param item The Integer to add to the Queue.
   */
  @Override
  public void enqueue(Integer item) {
    Integer[] n = new Integer[this.size+1];
    for(int i=0;i<this.size;i++) {
      n[i] = this.arr[i];
    }
    n[this.size] = item;
    this.arr = n;
    this.size += 1;
  }

  /**
   * Removes and returns the Integer at the front of the Queue if the Queue is not empty.
   *
   * @return The Integer at the front of the Queue, if the Queue is not empty.
   * @throws EmptyQueueException if the Queue is empty.
   */
  @Override
  public Integer dequeue() throws EmptyQueueException {
    if (this.size==0) {
      throw new EmptyQueueException();
    }
    Integer tmp = this.arr[0];
    Integer[] n = new Integer[this.size-1];
    for (int i =0;i<this.size-1;i++) {
      n[i] = this.arr[i+1];
    }
    this.arr = n;
    this.size -= 1;
    return tmp;
  }

  /**
   * Returns but does not remove the Integer at the front of the Queue.
   *
   * @return The Integer at the front of the Queue, if the Queue is not empty.
   * @throws EmptyQueueException if the Queue is empty.
   */
  @Override
  public Integer front() throws EmptyQueueException {
    if (this.size==0) {
      throw new EmptyQueueException();
    }
    return this.arr[0];
  }

  /**
   * Gets the number of items in the Queue.
   *
   * @return The number of items in the Queue.
   */
  @Override
  public Integer size() {
    return this.size;
  }
}
