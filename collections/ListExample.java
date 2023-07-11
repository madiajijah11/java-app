package collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
  public static void main(String[] args) {
    // instance object
    List<String> stationaries = new ArrayList<>();

    // CRUD
    stationaries.add("pulpen");
    stationaries.add("pensil");
    stationaries.add("kacamata");
    stationaries.add(null);

    // print
    System.out.println(stationaries);

    // update
    stationaries.set(3, "penghapus");
    System.out.println(stationaries);

    // delete
    stationaries.remove(2);
    System.out.println(stationaries);
    System.out.println(stationaries.get(0));
  }
}
