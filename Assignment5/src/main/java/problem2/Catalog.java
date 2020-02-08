package problem2;

import java.util.ArrayList;

/**
 * The type Catalog.
 */
public class Catalog {

  private ArrayList<Item> items;

  /**
   * Instantiates a new Catalog.
   *
   * @param items the items
   */
  public Catalog(ArrayList<Item> items) {
    this.items = items;
  }

  /**
   * Instantiates a new Catalog.
   */
  public Catalog() {
    this.items = new ArrayList<>();
  }

  /**
   * Gets items.
   *
   * @return the items
   */
  public ArrayList<Item> getItems() {
    return this.items;
  }

  /**
   * Add item.
   *
   * @param item the item
   */
  public void addItem(Item item) {
    this.items.add(item);
  }

  /**
   * Remove item.
   *
   * @param item the item
   */
  public void removeItem(Item item) {
    this.items.remove(item);
  }

  /**
   * Search array list.
   *
   * @param keyword the keyword
   * @return the array list
   */
  public ArrayList<Item> search(String keyword) {
    ArrayList<Item> result = new ArrayList<>();
    keyword = keyword.toLowerCase();
    for (Item item : this.items) {
      String string = item.getTitle().toLowerCase();
      if (string.contains(keyword)) {
        result.add(item);
      }
    }
    return result;
  }

  /**
   * Search array list.
   *
   * @param author the author
   * @return the array list
   */
  public ArrayList<Item> search(Author author) {
    ArrayList<Item> result = new ArrayList<>();
    for (Item item : this.items) {
      if (item.getCreators().match(author)) {
        result.add(item);
      }
    }
    return result;
  }

  /**
   * Search array list.
   *
   * @param recordingArtist the recording artist
   * @return the array list
   */
  public ArrayList<Item> search(RecordingArtist recordingArtist) {
    ArrayList<Item> result = new ArrayList<>();
    for (Item item : this.items) {
      if (item.getCreators().match(recordingArtist)) {
        result.add(item);
      }
    }
    return result;
  }
}
