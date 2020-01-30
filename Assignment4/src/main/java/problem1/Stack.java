package problem1;

import java.util.EmptyStackException;

public class Stack implements IStack{
  private Integer size;
  private Integer[] arr;

  public Stack() {
    Integer[] a = {};
    this.arr = a;
    this.size = 0;
  }


  /**
   * Adds an Integer to the Stack.
   *
   * @param item An Integer to push onto the Stack.
   */
  @Override
  public void push(Integer item) {
    Integer[] n = new Integer[this.size+1];
    for (int i=0;i<this.size;i++) {
      n[i] = this.arr[i];
    }
    n[this.size] = item;
    this.arr = n;
    this.size += 1;
  }

  /**
   * Returns and removes the most recently-added item.
   *
   * @return The most recently-added item.
   * @throws EmptyStackException Throws an EmptyStackException if the method is called on an empty
   *                             Stack. Note: EmptyStackException is a built-in Java exception.
   */
  @Override
  public Integer pop() throws EmptyStackException {
    if (this.size == 0) {
      throw new EmptyStackException();
    }
    Integer[] n = new Integer[this.size-1];
    Integer tmp = this.arr[this.size-1];
    for(int i=0;i<this.size-1;i++){
      n[i] = this.arr[i];
    }
    this.arr = n;
    this.size -= 1;
    return tmp;
  }

  /**
   * Returns the most recently-added item.
   *
   * @return The most recently-added item.
   * @throws EmptyStackException Throws an EmptyStackException if the method is called on an empty
   *                             Stack. Note: EmptyStackException is a built-in Java exception.
   */
  @Override
  public Integer top() throws EmptyStackException {
    if (this.size==0) {
      throw new EmptyStackException();
    }
    return this.arr[this.size-1];
  }

  /**
   * Tests if this Stack is empty.
   *
   * @return true if and only if the Stack contains no items. Otherwise return false.
   */
  @Override
  public boolean isEmpty() {
    if (this.size == 0){
      return true;
    }
    return false;
  }
}
