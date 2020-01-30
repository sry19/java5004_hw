package problem2;

public interface IInterface {

  boolean isEmpty();
  int size();
  boolean contains(String s);
  boolean containsAll(LinkedListOfStrings stringArray);
  LinkedListOfStrings filterLargerThan(int length);
  boolean hasDuplicates();
  LinkedListOfStrings removeDuplicates();
}
