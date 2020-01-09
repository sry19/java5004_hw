/**
 * Represents an Address with their details--street number, street name, city name, state acronym, zip code,
 * country name
 */
public class Address {
    private Integer streetNum;
    private String streetName;
    private String cityName;
    private String stateAcronym;
    private Integer zipCodeNum;
    private String countryName;

    /**
     * creates a new address given the street number,street name, city name, state acronym, zip code and country name*
     * @param streetNum the street number
     * @param streetName the street name
     * @param cityName the city name
     * @param stateAcronym the state acronym
     * @param zipCodeNum the zip code
     * @param countryName the country name
     */
    public Address(Integer streetNum,String streetName,String cityName,String stateAcronym,Integer zipCodeNum,String countryName){
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.cityName = cityName;
        this.stateAcronym = stateAcronym;
        this.zipCodeNum = zipCodeNum;
        this.countryName = countryName;
    }

    /**
     * return the street number
     * @return the street number
     */
    public Integer getStreetNum() {
        return this.streetNum;
    }

    /**
     * return the street name
     * @return the street name
     */
    public String getStreetName() {
        return this.streetName;
    }

    /**
     * return the city name
     * @return the city name
     */
    public String getCityName() {
        return this.cityName;
    }

    /**
     * return the state acronym
     * @return the state acronym
     */
    public String getStateAcronym() {
        return this.stateAcronym;
    }

    /**
     * return the zip code represented as a number
     * @return the zip code represented as a number
     */
    public Integer getZipCodeNum() {
        return this.zipCodeNum;
    }

    /**
     * return the country name
     * @return the country name
     */
    public String getCountryName() {
        return this.countryName;
    }
}
