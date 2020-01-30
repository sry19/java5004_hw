package problem3;

public interface IInterface {
  boolean isEmpty();
  void addSwimmer(Swimmer swimmer);
  Swimmer remove(Swimmer swimmer) throws SwimmerNotFoundException;
  boolean check(Swimmer swimmer);
  int numOfSwimmer();
  Swimmer find(DisciplineType type) throws SwimmerNotFoundException;

}
