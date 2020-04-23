package edu.neu.khoury.cs5004.finalExam.p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * The type Destination processor.
 */
public class DestinationProcessor {

  private List<Destination> destinations = new ArrayList<>();

  /**
   * Instantiates a new Destination processor.
   *
   * @param destinations the destinations
   */
  public DestinationProcessor(List<Destination> destinations) {
    this.destinations = destinations;
  }

  /**
   * Instantiates a new Destination processor.
   *
   * @param destination1 the destination 1
   * @param destination2 the destination 2
   */
  public DestinationProcessor(Destination destination1, Destination destination2) {
    this.destinations.add(destination1);
    this.destinations.add(destination2);
  }


  /**
   * Count the occurrence times of each destination and put the result into a map.
   *
   * @param destinations the destinations
   * @return the map
   */
  public static Map<Destination, Long> countDestinations(List<Destination> destinations) {
    return destinations.stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
  }


  /**
   * Filter by the distance from Seattle and get a list of all destinations that are strictly closer
   * to Seattle than the cutoff distance.
   *
   * @param distance the cutoff distance
   * @return the list
   */
  public List<Destination> filterByDistance(Float distance) {
    //YOUR CODE HERE
    List<Destination> result = this.destinations.stream()
        .filter(x -> x.getDistanceFromSeattle() < distance).collect(Collectors.toList());
    return result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    DestinationProcessor that = (DestinationProcessor) o;

    return destinations.equals(that.destinations);
  }

  @Override
  public int hashCode() {
    return destinations.hashCode();
  }

  @Override
  public String toString() {
    return "DestinationProcessor{" +
        "destinations=" + destinations +
        '}';
  }
}
