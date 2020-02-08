package problem2;

/**
 * The type Item.
 */
public abstract class Item {

  private Creators creators;
  private String title;
  private Integer releasedYear;

  /**
   * Instantiates a new Item.
   *
   * @param creators     the creators
   * @param title        the title
   * @param releasedYear the released year
   */
  public Item(Creators creators, String title, Integer releasedYear) {
    this.creators = creators;
    this.title = title;
    this.releasedYear = releasedYear;
  }

  /**
   * Gets creators.
   *
   * @return the creators
   */
  public Creators getCreators() {
    return this.creators;
  }

  /**
   * Gets title.
   *
   * @return the title
   */
  public String getTitle() {
    return this.title;
  }

  /**
   * Gets released year.
   *
   * @return the released year
   */
  public Integer getReleasedYear() {
    return this.releasedYear;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Item item = (Item) o;

    if (!creators.equals(item.creators)) {
      return false;
    }
    if (!title.equals(item.title)) {
      return false;
    }
    return releasedYear.equals(item.releasedYear);
  }

  @Override
  public int hashCode() {
    int result = creators.hashCode();
    result = 31 * result + title.hashCode();
    result = 31 * result + releasedYear.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Item {creators = " + this.creators.toString() + ", title = " + this.title
        + ", releasedYear = " + this.releasedYear + "}";
  }
}
