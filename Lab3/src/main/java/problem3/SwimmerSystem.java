package problem3;

import java.util.ArrayList;

public class SwimmerSystem implements IInterface{

  private ArrayList<Swimmer> swimmerList;
  private int num;

  public SwimmerSystem() {
    this.swimmerList = new ArrayList();
    this.num = 0;
  }

  @Override
  public boolean isEmpty() {
    if (this.num == 0) {
      return true;
    }
    return false;
  }

  @Override
  public void addSwimmer(Swimmer swimmer) {
    ArrayList lst = new ArrayList()
  }

  @Override
  public Swimmer remove(Swimmer swimmer) throws SwimmerNotFoundException {
    return null;
  }

  @Override
  public boolean check(Swimmer swimmer) {
    return false;
  }

  @Override
  public int numOfSwimmer() {
    return 0;
  }

  @Override
  public Swimmer find(DisciplineType type) throws SwimmerNotFoundException {
    return null;
  }
}
