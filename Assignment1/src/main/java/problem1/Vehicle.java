package problem1;

/**
* Vehicle is a simple object that has a unique Vehicle Identification Number (VIN), and corresponding license plate.
*/
public class Vehicle {
    private Integer VIN;
    private String licensePlate;
    private Owner owner;

    /**
     * Constructor that creates a new vehicle object with the specified VIN and * license plate.
     *
     * @param VIN          - VIN of the new Vehicle object.
     * @param licensePlate - license plate of the new Vehicle.
     * @param owner - the owner of the vehicle
     */
    public Vehicle(Integer VIN, String licensePlate, Owner owner) {
        this.VIN = VIN;
        this.licensePlate = licensePlate;
        this.owner = owner;
    }

    /**
     * Returns the VIN of the Vehicle.
     *
     * @return the VIN of the Vehicle.
     */
    public Integer getVIN() {
        // return VIN
        return this.VIN;
    }

    /**
     * Returns the licensePlate of the Vehicle.*
     *
     * @return the licensePlate of the Vehicle.
     */
    public String getLicensePlate() {
        // return license plate
        return this.licensePlate;
    }

    /**
     * return the owner
     *
     * @return owner
     */
    public Owner getOwner() {
        return this.owner;
    }

    /**
     * Sets the VIN of the Vehicle.
     *
     * @param VIN the new VIN of the Vehicle
     */
    public void setVIN(Integer VIN) {
        // set a new VIN
        this.VIN = VIN;
    }

    /**
     * Sets the licensePlate of the Vehicle.
     *
     * @param licensePlate the new licensePlate of the Vehicle
     */
    public void setLicensePlate(String licensePlate) {
        // set a new license plate
        this.licensePlate = licensePlate;
    }
}


