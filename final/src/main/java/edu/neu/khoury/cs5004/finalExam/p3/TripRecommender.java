package edu.neu.khoury.cs5004.finalExam.p3;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TripRecommender {
  private Map<Destination,Integer> destinationStatistics;

  public TripRecommender() {
    this.destinationStatistics = new HashMap<>();
  }

  public void getAggregatedStatistics(List<Traveler> traveler) {
    for (Traveler traveler1: traveler) {
      for (Destination destination: traveler1.traveledDestinations()) {
        destinationStatistics.put(destination, destinationStatistics.getOrDefault(destination,0) + 1);
      }
    }
  }

  public Destination recommendMostLikelyDestination() {
    return Collections.max(destinationStatistics.entrySet(),
        Comparator.comparingInt(Entry::getValue)).getKey();
  }

  public Destination recommendMostUnlikelyDestination() {
    return Collections.min(destinationStatistics.entrySet(),
        Comparator.comparingInt(Entry::getValue)).getKey();
  }
}
