package edu.neu.khoury.cs5004.finalExam.p2;

import java.util.Iterator;
import java.util.List;

/**
 * The type Traveler iterator.
 */
public class TravelerIterator implements Iterator<Traveler> {

  private int current;
  private List<Traveler> travelerList;
  private static final String AUS = "Austria";
  private static final String GER = "Germany";
  private static final String SWI = "Switzerland";

  /**
   * Instantiates a new Traveler iterator.
   *
   * @param travelerList the traveler list
   */
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    TravelerIterator that = (TravelerIterator) o;

    if (current != that.current) {
      return false;
    }
    return travelerList.equals(that.travelerList);
  }

  @Override
  public int hashCode() {
    int result = current;
    result = 31 * result + travelerList.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "TravelerIterator{" +
        "current=" + current +
        ", travelerList=" + travelerList +
        '}';
  }
}
