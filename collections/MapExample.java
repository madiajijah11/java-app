package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
  public static void main(String[] args) {
    Map<String, Integer> stocks = new HashMap<>();

    // assign value
    stocks.put("A100", 100);
    stocks.put("B101", 20);
    stocks.put("B102", 30);

    System.out.println(stocks);
  }
}
