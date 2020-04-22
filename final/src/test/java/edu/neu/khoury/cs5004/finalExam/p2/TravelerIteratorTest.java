package edu.neu.khoury.cs5004.finalExam.p2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class TravelerIteratorTest {

  private List<Traveler> travelers;
  private Destination destination1;
  private Destination destination2;
  private Destination destination3;
  private Destination destination4;
  Traveler traveler;
  Traveler traveler1;
  Traveler traveler2;
  private TravelerIterator travelerIterator;


  @Before
  public void setUp() throws Exception {
    destination1 = new Destination("123","Austria","012", 5.0f);
    destination2 = new Destination("456","Germany","234",3.5f);
    destination3 = new Destination("567","Switzerland","456",4.5f);
    destination4 = new Destination("asd","USA","234",3.0f);
    List<Destination> destinations = new ArrayList<>();
    destinations.add(destination1);
    destinations.add(destination2);
    destinations.add(destination3);
    destinations.add(destination4);
    traveler = new Traveler("abc","sdf",destinations);
    List<Destination> destinations1 = new ArrayList<>();
    destinations1.add(destination1);
    destinations1.add(destination2);
    destinations1.add(destination4);
    traveler1 = new Traveler("asd","qwe",destinations1);
    List<Destination> destinations2 = new ArrayList<>();
    destinations2.add(destination1);
    destinations2.add(destination2);
    destinations2.add(destination3);
    traveler2 = new Traveler("qwe","14",destinations2);
    travelers = new ArrayList<>();
    travelers.add(traveler);
    travelers.add(traveler1);
    travelers.add(traveler1);
    travelers.add(traveler2);
    travelers.add(traveler);
    travelerIterator = new TravelerIterator(travelers);
  }

  @Test
  public void hasNext() {
    assertTrue(travelerIterator.hasNext());
    assertEquals(travelerIterator.next(),traveler);
    assertTrue(travelerIterator.hasNext());
    assertEquals(travelerIterator.next(),traveler2);
    assertTrue(travelerIterator.hasNext());
    assertEquals(travelerIterator.next(),traveler);
    assertFalse(travelerIterator.hasNext());
  }

  @Test
  public void next() {
  }
}