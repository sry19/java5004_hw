package edu.neu.khoury.cs5004.finalExam.p1;

/**
 * The type Item.
 */
public class Item {

  private String name;
  private Float price;

  /**
   * Construct a Item object that has the provided name and price
   *
   * @param name  the name to be given to this shopping item
   * @param price the price to be given to this item
   */
  public Item(String name, Float price) {
    this.name = name;
    this.price = price;
  }

  /**
   * Gets name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets price.
   *
   * @return the price
   */
  public Float getPrice() {
    return price;
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

    if (!name.equals(item.name)) {
      return false;
    }
    return price.equals(item.price);
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + price.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Item{" +
        "name='" + name + '\'' +
        ", price=" + price +
        '}';
  }
}
