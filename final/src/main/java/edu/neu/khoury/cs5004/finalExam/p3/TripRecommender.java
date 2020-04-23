package edu.neu.khoury.cs5004.finalExam.p3;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * The type Trip recommender.
 */
public class TripRecommender {

  private Map<Destination, Integer> destinationStatistics;

  /**
   * Instantiates a new Trip recommender.
   */
  public TripRecommender() {
    this.destinationStatistics = new HashMap<>();
  }

  /**
   * Gets aggregated statistics.
   *
   * @param traveler the traveler
   */
  public void getAggregatedStatistics(List<Traveler> traveler) {
    for (Traveler traveler1 : traveler) {
      for (Destination destination : traveler1.traveledDestinations()) {
        destinationStatistics
            .put(destination, destinationStatistics.getOrDefault(destination, 0) + 1);
      }
    }
  }

  /**
   * Recommend most likely destination destination.
   *
   * @return the destination
   */
  public Destination recommendMostLikelyDestination() {
    return Collections.max(destinationStatistics.entrySet(),
        Comparator.comparingInt(Entry::getValue)).getKey();
  }

  /**
   * Recommend most unlikely destination destination.
   *
   * @return the destination
   */
  public Destination recommendMostUnlikelyDestination() {
    return Collections.min(destinationStatistics.entrySet(),
        Comparator.comparingInt(Entry::getValue)).getKey();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    TripRecommender that = (TripRecommender) o;

    return destinationStatistics.equals(that.destinationStatistics);
  }

  @Override
  public int hashCode() {
    return destinationStatistics.hashCode();
  }

  @Override
  public String toString() {
    return "TripRecommender{" +
        "destinationStatistics=" + destinationStatistics +
        '}';
  }
}
