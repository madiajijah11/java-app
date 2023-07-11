package collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
  public static void main(String[] args) {
    // instance obj
    Set<String> months = new HashSet<>();

    months.add("jan");
    months.add("feb");
    months.add("mar");
    months.add("mar");
    months.add("apr");
    months.add("mei");

    System.out.println(months);
  }
}
