package edu.neu.khoury.cs5004.finalExam.p2;

import java.util.Iterator;
import java.util.List;

public class TravelerIterator implements Iterator<Traveler> {

  private int current;
  private List<Traveler> travelerList;
  private static final String AUS = "Austria";
  private static final String GER = "Germany";
  private static final String SWI = "Switzerland";

  public TravelerIterator(List<Traveler> travelerList) {
    this.current = 0;
    this.travelerList = travelerList;
  }

  @Override
  public boolean hasNext() {
    while (this.current < this.travelerList.size()) {
      if (this.checkVisitedCountry(this.travelerList.get(this.current))) {
        return true;
      }
      this.current += 1;
    }
    return false;
  }

  private boolean checkVisitedCountry(Traveler traveler) {
    boolean austriaFlag = false;
    boolean germanyFlag = false;
    boolean switzerlandFlag = false;
    for (Destination destination: traveler.traveledDestinations()) {
      if (destination.getCountry() == null) {
        continue;
      }
      switch (destination.getCountry()) {
        case AUS:
          austriaFlag = true;
          break;
        case GER:
          germanyFlag = true;
          break;
        case SWI:
          switzerlandFlag = true;
          break;
      }
    }
    return austriaFlag && germanyFlag && switzerlandFlag;
  }

  @Override
  public Traveler next() {
    Traveler traveler = this.travelerList.get(this.current);
    this.current ++;
    return traveler;
  }
}
