package universitas .util;

import java.util.ArrayList;

public class CollectionExample {

  public static void main(String[] args) {
    // ArrayList for flower names
    ArrayList<String> flowers = new ArrayList<>();
    flowers.add("Rose");
    flowers.add("Daisy");
    flowers.add("Tulip");

    System.out.println("Isi ArrayList (Bunga):");
    for (String flower : flowers) {
      System.out.println(flower);
    }

    // Example using ArrayDeque with numbers (unchanged)
    ArrayDeque<Integer> numbers = new ArrayDeque<>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);

    System.out.println("\nIsi ArrayDeque (Angka):");
    for (int number : numbers) {
      System.out.println(number);
    }
  }
}
