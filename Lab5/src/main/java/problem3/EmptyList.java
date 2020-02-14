package problem3;

public class EmptyList implements Interface1 {

  @Override
  public Integer size() {
    return 0;
  }

  @Override
  public Integer length() {
    return 0;
  }

  @Override
  public Integer sum() {
    return 0;
  }

  @Override
  public Boolean isEmpty() {
    return true;
  }

  @Override
  public Interface1 add(IList element) {
    return this;
  }

  @Override
  public Interface1 removeInteger(Integer n) {
    return this;
  }

  @Override
  public Interface1 removeAllInteger(Integer n) {
    return this;
  }

  @Override
  public boolean contains(Integer element) {
    return false;
  }
}
