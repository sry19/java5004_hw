package edu.neu.khoury.cs5004.finalExam.p3;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

public class TripRecommenderTest {

  Destination destination1;
  Destination destination2;
  Destination destination3;
  List<Destination> destinationList;
  List<Destination> destinationList1;
  List<Destination> destinationList2;
  List<Traveler> list;
  TripRecommender recommender;

  @Before
  public void setUp() throws Exception {
    destination1 = new Destination("123","xyz","012", 5.0f);
    destination2 = new Destination("456","abc","234",3.5f);
    destination3 = new Destination("567","sdf","456",4.5f);
    destinationList = new ArrayList<>();
    destinationList.add(destination1);
    Traveler traveler = new Traveler("as","sd",destinationList);
    destinationList1 = new ArrayList<>();
    destinationList1.add(destination1);
    destinationList1.add(destination1);
    destinationList1.add(destination2);
    Traveler traveler1 = new Traveler("asd","wer",destinationList1);
    destinationList2 = new ArrayList<>();
    destinationList2.add(destination1);
    destinationList2.add(destination1);
    destinationList2.add(destination2);
    destinationList2.add(destination3);
    Traveler traveler2 = new Traveler("we","qw",destinationList2);
    list = new ArrayList<>();
    list.add(traveler);
    list.add(traveler1);
    list.add(traveler2);
    recommender = new TripRecommender();
  }

  @Test
  public void getAggregatedStatistics() {
    Map<Destination,Integer> result = new HashMap<>();
    result.put(destination1,5);
    result.put(destination2,2);
    result.put(destination3,1);
    recommender.getAggregatedStatistics(list);
    assertEquals(result, recommender.getDestinationStatistics());
  }

  @Test
  public void recommendMostLikelyDestination() {
    recommender.getAggregatedStatistics(list);
    assertEquals(destination1,recommender.recommendMostLikelyDestination());
  }

  @Test
  public void recommendMostUnlikelyDestination() {
    recommender.getAggregatedStatistics(list);
    assertEquals(destination3,recommender.recommendMostUnlikelyDestination());
  }

  @Test
  public void testEquals() {
  }

  @Test
  public void testHashCode() {
  }

  @Test
  public void testToString() {
  }
}