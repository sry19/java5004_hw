package edu.neu.khoury.cs5004.finalExam.p1;

import static org.junit.Assert.*;

import com.sun.org.apache.bcel.internal.generic.DUP2_X1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import sun.security.krb5.internal.crypto.Des;

public class DestinationProcessorTest {

  Destination destination1;
  Destination destination2;
  Destination destination3;
  Destination destination4;
  List<Destination> destinationList;
  DestinationProcessor destinationProcessor;

  @Before
  public void setUp() throws Exception {
    destination1 = new Destination("123","xyz","012", 5.0f);
    destination2 = new Destination("456","abc","234",3.5f);
    destination3 = new Destination("567","sdf","456",4.5f);
    destinationList = new ArrayList<>();
    destinationList.add(destination1);
    destinationList.add(destination1);
    destinationList.add(destination2);
    destinationList.add(destination3);
    destinationProcessor = new DestinationProcessor(destinationList);
  }

  @Test
  public void countDestinations() {
    Map<Destination, Long> result = new HashMap<>();
    result.put(destination1,2l);
    result.put(destination2,1l);
    result.put(destination3,1l);
    assertEquals(result,DestinationProcessor.countDestinations(destinationList));
  }

  @Test
  public void filterByDistance() {
    List<Destination> result = new ArrayList<>();
    result.add(destination2);
    result.add(destination3);
    assertEquals(result,destinationProcessor.filterByDistance(4.6f) );
  }
}