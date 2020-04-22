package edu.neu.khoury.cs5004.finalExam.p3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class StringProcessor3 {
  private List<String> someString = new ArrayList<>();

  public static Map<String, Integer> countChosenDigit(List<String> list, char digit1, char digit2)
  {
    Map<String, Integer> result = new HashMap<>();
    //YOUR CODE HERE
    for (String string: list) {
        result.put(string, StringProcessor3.countDigits(string,digit1,digit2));
    }
    return result;
  }

  private static Integer countDigits(String string, char digit1,char digit2) {
    Integer count = 0;
    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) == digit1 || string.charAt(i) == digit2) {
        count += 1;
      }
    }
    return count;
  }
}
