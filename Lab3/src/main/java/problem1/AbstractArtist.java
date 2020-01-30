package problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The type Abstract artist.
 */
public class AbstractArtist implements Artist {
  private Name name;
  private Integer age;
  private String[] genre;
  /**
   * The Awards.
   */
  protected String[] awards;
  private Integer MAX_AGE = 128;
  private Integer MIN_AGE = 0;

  /**
   * Instantiates a new Abstract artist.
   *
   * @param name   the name
   * @param age    the age
   * @param genre  the genre
   * @param awards the awards
   * @throws OutOfRangeException the out of range exception
   */
  public AbstractArtist(Name name, Integer age, String[] genre, String[] awards) throws OutOfRangeException{
    if (age > MAX_AGE || age < MIN_AGE) {
      throw new OutOfRangeException();
    }
    this.name = name;
    this.age = age;
    this.genre = genre;
    this.awards = awards;
  }

  /**
   * Gets name.
   *
   * @return the name
   */
  public Name getName() {
    return this.name;
  }

  /**
   * Gets age.
   *
   * @return the age
   */
  public Integer getAge() {
    return this.age;
  }

  /**
   * Get genre string [ ].
   *
   * @return the string [ ]
   */
  public String[] getGenre() {
    return this.genre;
  }

  /**
   * Get awards string [ ].
   *
   * @return the string [ ]
   */
  public String[] getAwards() {
    return this.awards;
  }

  /**
   * Sets age.
   *
   * @param age the age
   */
  public void setAge(Integer age) {
    this.age = age;
  }

  /**
   * Sets genre.
   *
   * @param genre the genre
   */
  public void setGenre(String[] genre) {
    this.genre = genre;
  }

  /**
   * Sets awards.
   *
   * @param awards the awards
   */
  public void setAwards(String[] awards) {
    this.awards = awards;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    AbstractArtist that = (AbstractArtist) o;

    if (!name.equals(that.name)) {
      return false;
    }
    if (!age.equals(that.age)) {
      return false;
    }
    // Probably incorrect - comparing Object[] arrays with Arrays.equals
    if (!Arrays.equals(genre, that.genre)) {
      return false;
    }
    // Probably incorrect - comparing Object[] arrays with Arrays.equals
    return Arrays.equals(awards, that.awards);
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + age.hashCode();
    result = 31 * result + Arrays.hashCode(genre);
    result = 31 * result + Arrays.hashCode(awards);
    return result;
  }

  @Override
  public String toString() {
    return "AbstractArtist { name = " + this.name + ", age = " + this.age + ", genre = " + this.genre + ", awards = " + this.awards + "}";
  }

  /**
   * receives an award and adds to the awards array
   *
   * @param award the award
   * @return and artist
   */
  @Override
  public AbstractArtist receiveAward(String award) {
    List<String> lst = new ArrayList<>(Arrays.asList(this.awards));
    lst.add(award);
    this.awards =lst.toArray(new String[lst.size()]);
    return this;
  }
}
