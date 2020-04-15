package problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * The type Older vehicles filter.
 */
public class OlderVehiclesFilter {

  private List<Vehicle> vehicles = new ArrayList<>();

  /**
   * Instantiates a new Older vehicles filter.
   *
   * @param vehicles the vehicles
   */
  public OlderVehiclesFilter(List<Vehicle> vehicles) { this.vehicles = vehicles;
  }

  /**
   * Instantiates a new Older vehicles filter.
   *
   * @param vehicle1 the vehicle 1
   * @param vehicle2 the vehicle 2
   * @param vehicle3 the vehicle 3
   */
  public OlderVehiclesFilter(Vehicle vehicle1, Vehicle vehicle2, Vehicle vehicle3){
    this.vehicles.add(vehicle1);
    this.vehicles.add(vehicle2);
    this.vehicles.add(vehicle3);
  }

  /**
   * Filter old vehicles list.
   *
   * @return the list
   */
  public List<String> filterVWvehilces(){
    List<Vehicle> vehicle = vehicles.stream().filter(v->v.getYear()> 1999).collect(Collectors.toList());
    List<String> result = vehicle.stream().map(v->String.format("make = %s;model = %s;year = %s",v.getMake(),v.getModel(),v.getYear())).collect(
        Collectors.toList());
    result.stream().forEach(System.out::println);
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

    OlderVehiclesFilter that = (OlderVehiclesFilter) o;

    return vehicles.equals(that.vehicles);
  }

  @Override
  public int hashCode() {
    return vehicles.hashCode();
  }

  @Override
  public String toString() {
    return "OlderVehiclesFilter{" +
        "vehicles=" + vehicles +
        '}';
  }
}
