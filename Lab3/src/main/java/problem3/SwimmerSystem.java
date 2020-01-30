package problem3;

import java.util.ArrayList;

public class SwimmerSystem implements IInterface{

  private Swimmer[] swimmerList;
  private int num;

  public SwimmerSystem() {
    this.swimmerList = new Swimmer[1];
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
    Swimmer[] n = new Swimmer[this.swimmerList.length+1];
    for (int i=0;i<this.num;i++){
      if(this.swimmerList[i].equals(swimmer)){return;}
      n[i] = this.swimmerList[i];
    }
    n[this.num] = swimmer;
    this.num+=1;
  }

  @Override
  public Swimmer remove(Swimmer swimmer) throws SwimmerNotFoundException {
    for(int i=0;i<this.num;i++) {
      if (this.swimmerList[i].equals(swimmer)) {
        for (int j = i; j < this.num - 1; j++) {
          this.swimmerList[j] = this.swimmerList[j + 1];
        }
        this.num -= 1;
        return swimmer;
      }
    }
    throw new SwimmerNotFoundException();
  }

  @Override
  public boolean check(Swimmer swimmer) {
    for(int i=0;i<this.num;i++){
      if(swimmer.equals(this.swimmerList[i])){return true;}
    }
    return false;
  }

  @Override
  public int numOfSwimmer() {
    return this.num;
  }

  @Override
  public Swimmer find(DisciplineType type) throws SwimmerNotFoundException {
    for(int i=0;i<this.num;i++){
      if(this.swimmerList[i].getDiscipline()==type){
        return swimmerList[i];
      }
    }
    throw new SwimmerNotFoundException();
  }
}
