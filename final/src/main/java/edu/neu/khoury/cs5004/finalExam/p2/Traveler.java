package edu.neu.khoury.cs5004.finalExam.p2;

import java.util.List;

/**
 * The type Traveler.
 */
public class Traveler implements Comparable<Traveler> {

  private String firstName;
  private String lastName;
  private List<Destination> traveledDestinations;


  /**
   * Constructs a Traveler object and initializes it to the given first name, last name and the list
   * of traveled destinations
   *
   * @param firstName            the first name of this person
   * @param lastName             the last name of this person
   * @param traveledDestinations list of destinations they visited in the last year.
   */
  public Traveler(String firstName, String lastName, List<Destination> traveledDestinations) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.traveledDestinations = traveledDestinations;
  }

  /**
   * Gets first name.
   *
   * @return the first name
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Gets last name.
   *
   * @return the last name
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Traveled destinations list.
   *
   * @return the list
   */
  public List<Destination> traveledDestinations() {
    return traveledDestinations;
  }

  @Override
  public int compareTo(Traveler otherTraveler) {
    return this.accumulateDistance().compareTo(otherTraveler.accumulateDistance());
  }

  private Float accumulateDistance() {
    Float total = 0f;
    for (Destination destination: this.traveledDestinations()) {
      total += destination.getDistanceFromSeattle();
    }
    return total;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Traveler traveler = (Traveler) o;

    if (!firstName.equals(traveler.firstName)) {
      return false;
    }
    if (!lastName.equals(traveler.lastName)) {
      return false;
    }
    return traveledDestinations.equals(traveler.traveledDestinations);
  }

  @Override
  public int hashCode() {
    int result = firstName.hashCode();
    result = 31 * result + lastName.hashCode();
    result = 31 * result + traveledDestinations.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Traveler{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", traveledDestinations=" + traveledDestinations +
        '}';
  }
}
