package problem2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class CatalogTest {

  Author author;
  RecordingArtist recordingArtist;
  RecordingArtist recordingArtist1;
  ArrayList<RecordingArtist> members;
  ArrayList<Item> lst;
  Band band;
  Book book;
  Music music;
  Music music1;
  Catalog catalog;
  Catalog catalog1;

  @Before
  public void setUp() throws Exception {
    author = new Author("first", "last");
    recordingArtist = new RecordingArtist("f", "l");
    book = new Book(author, "title", 2020);
    music = new Music(recordingArtist, "Title", 1999);

    recordingArtist1 = new RecordingArtist("ee", "ff");
    members = new ArrayList<>();
    members.add(recordingArtist);
    members.add(recordingArtist1);
    band = new Band("name", members);
    music1 = new Music(band, "title", 2000);

    catalog = new Catalog();

    lst = new ArrayList<>();
    lst.add(book);
    catalog1 = new Catalog(lst);
  }

  @Test
  public void addItem() {
    catalog.addItem(book);
    ArrayList<Item> result = new ArrayList<>();
    result.add(book);
    assertEquals(result, catalog.getItems());
  }

  @Test
  public void getItems() {
    catalog.addItem(book);
    ArrayList<Item> result = new ArrayList<>();
    result.add(book);
    assertEquals(result, catalog.getItems());
  }

  @Test
  public void removeItem() {
    catalog.addItem(book);
    catalog.addItem(music);
    catalog.removeItem(music);
    ArrayList<Item> result = new ArrayList<>();
    result.add(book);
    assertEquals(result, catalog.getItems());
  }

  @Test
  public void search() {
    assertEquals(lst, catalog1.search("Ti"));
  }

  @Test
  public void testSearch() {
    assertEquals(lst, catalog1.search(author));
  }

  @Test
  public void testSearch1() {
    catalog1.addItem(music);
    catalog1.addItem(music1);
    ArrayList<Item> lst1 = new ArrayList<>();
    lst1.add(music);
    lst1.add(music1);
    assertEquals(lst1, catalog1.search(recordingArtist));
  }
}