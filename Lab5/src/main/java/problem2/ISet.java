package problem2;

public interface ISet {

  Boolean isEmpty();
  ISet add(Integer n);
  Boolean contains(Integer n);
  ISet remove(Integer ele);
  Integer size();
}
