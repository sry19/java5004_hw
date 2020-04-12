package reservationsystem.model;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * The type Theater.
 */
public class Theater {

  private String name;
  private List<Row> rowList;
  private List<Integer> wheelchairAccessRow;

  /**
   * Instantiates a new Theater.
   *
   * @param name      the name
   * @param numOfRows the num of rows
   */
  public Theater(String name, int numOfRows) {
    this.name = name;
    this.rowList = createRowList(numOfRows);
    this.wheelchairAccessRow = this.wheelchairRowsStatics(rowList);
  }

  private List<Row> createRowList(int numOfRows) {
    if (numOfRows < 1) {
      throw new IllegalArgumentException();
    }
    List<Row> rows = new ArrayList<>();
    Stream.iterate(1,i->i+1).limit(numOfRows).map(s->new Row(s,false)).forEach(rows::add);
    rows.get(3).setWheelchairAccessible(true);
    return rows;
  }

  private List<Integer> wheelchairRowsStatics(List<Row> rowList) {
    List<Integer> result = new ArrayList<>();
    for (Row row: rowList) {
      if (row.isWheelchairAccessible()) {
        result.add(row.getRowNumber());
      }
    }
    return result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Theater theater = (Theater) o;

    if (!name.equals(theater.name)) {
      return false;
    }
    if (!rowList.equals(theater.rowList)) {
      return false;
    }
    return wheelchairAccessRow.equals(theater.wheelchairAccessRow);
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + rowList.hashCode();
    result = 31 * result + wheelchairAccessRow.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Theater{" +
        "name='" + name + '\'' +
        ", rowList=" + rowList +
        ", wheelchairAccessRow=" + wheelchairAccessRow +
        '}';
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
   * Gets row list.
   *
   * @return the row list
   */
  public List<Row> getRowList() {
    return rowList;
  }

  /**
   * Gets wheelchair access row.
   *
   * @return the wheelchair access row
   */
  public List<Integer> getWheelchairAccessRow() {
    return wheelchairAccessRow;
  }
}