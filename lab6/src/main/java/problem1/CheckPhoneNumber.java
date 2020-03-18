package problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The type Check phone number.
 */
public class CheckPhoneNumber {

  private List<String> records;

  /**
   * Instantiates a new Check phone number.
   *
   * @param records the records
   */
  public CheckPhoneNumber(List<String> records) {
    this.records = records;
  }

  /**
   * Record parser all list.
   *
   * @return the list
   */
  public List<String> recordParserAll() {
    List<String> result = new ArrayList<String>();
    for (int i = 0; i < this.records.size(); i++) {
      String line = this.records.get(i);
      String[] oneRecord = line.split(":");
      oneRecord[2] = phoneNumberParser(oneRecord[2]);
      String oneResult;
      oneResult = String.join(":", oneRecord);
      result.add(oneResult);
    }
    return result;
  }

  /**
   * Phone number parser string.
   *
   * @param originPhoneNumber the origin phone number
   * @return the string
   */
  public String phoneNumberParser(String originPhoneNumber) {
    String pattern1 = "\\((\\d{3})\\)\\s(\\d{3})[-](\\d{4})";
    Pattern r1 = Pattern.compile(pattern1);
    Matcher m1 = r1.matcher(originPhoneNumber);

    String pattern2 = "\\d{3}\\.\\d{3}\\.\\d{4}";
    Pattern r2 = Pattern.compile(pattern2);
    Matcher m2 = r2.matcher(originPhoneNumber);

    String pattern3 = "(\\d{3})[\\-](\\d{3})[\\-](\\d{4})";
    Pattern r3 = Pattern.compile(pattern3);
    Matcher m3 = r3.matcher(originPhoneNumber);

    if (m1.matches()) {
      return m1.group(1) + "." + m1.group(2) + "." + m1.group(3);
    } else if (m2.matches()) {
      return originPhoneNumber;
    } else if (m3.matches()) {
      return m3.group(1) + "." + m3.group(2) + "." + m3.group(3);
    }
    return "**no match**";
  }

}
