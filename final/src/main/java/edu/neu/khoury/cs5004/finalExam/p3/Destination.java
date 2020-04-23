package edu.neu.khoury.cs5004.finalExam.p3;

/**
 * The type Destination.
 */
public class Destination {
  private String destinationName;
  private String country;
  private String airportCode;
  private Float distanceFromSeattle;


  /**
   * Constructs and returns a new object Destination, based upon the provided input arguments.
   * @param destinationName - a String, denoting the name of the destination
   * @param country - a String, denoting the country of the destination
   * @param airportCode - a String, denoting the airport code of the destination
   * @param distanceFromSeattle - a Float, denoting the distance between Seattle and the destination
   */
  public Destination(String destinationName, String country, String airportCode, Float distanceFromSeattle) {
    this.destinationName = destinationName;
    this.country = country;
    this.airportCode = airportCode;
    this.distanceFromSeattle = distanceFromSeattle;
  }


  /**
   * Method returns the name of the destination
   * @return - the name of the destination
   */
  public String getDestinationName() {
    return destinationName;
  }


  /**
   * Method returns the country of the destination
   * @return - the country of the destination
   */
  public String getCountry() {
    return country;
  }


  /**
   * Method returns the airport code of the destination
   * @return - the airport of the destination
   */
  public String getAirportCode() {
    return airportCode;
  }

  /**
   * Method returns the distance between Seattle and the destination
   * @return - the distance between Seattle and the destination
   */
  public Float getDistanceFromSeattle() {
    return distanceFromSeattle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Destination that = (Destination) o;

    if (!destinationName.equals(that.destinationName)) {
      return false;
    }
    if (!country.equals(that.country)) {
      return false;
    }
    if (!airportCode.equals(that.airportCode)) {
      return false;
    }
    return distanceFromSeattle.equals(that.distanceFromSeattle);
  }

  @Override
  public int hashCode() {
    int result = destinationName.hashCode();
    result = 31 * result + country.hashCode();
    result = 31 * result + airportCode.hashCode();
    result = 31 * result + distanceFromSeattle.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Destination{" +
        "destinationName='" + destinationName + '\'' +
        ", country='" + country + '\'' +
        ", airportCode='" + airportCode + '\'' +
        ", distanceFromSeattle=" + distanceFromSeattle +
        '}';
  }
}
