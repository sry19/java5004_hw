package problem1;

public interface ILinkedList {

 Integer count();

 ILinkedList add(Integer priority, String value);

 String getValue();

 Integer getPriority();

 ILinkedList getRest();

 ILinkedList pop();
}
