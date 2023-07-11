import java.util.Scanner;

public class Main {
  public int sisi = 5;
  public static int tinggi = 10;

  // main method
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
      // task 1
      String firstName;
      String lastName;
      String birthPlace;
      String progrLangFav;
      Integer birthYear;

      System.out.print("Nama Depan: ");
      firstName = input.nextLine();
      System.out.print("Nama Belakang: ");
      lastName = input.nextLine();
      System.out.print("Tahun Lahir: ");
      birthYear = Integer.valueOf(input.nextLine());
      System.out.print("Tempat Lahir: ");
      birthPlace = input.nextLine();
      System.out.print("Bahasa Pemrograman Favorite: ");
      progrLangFav = input.nextLine();

      System.out.println("fullName: " + firstName + " " + lastName);
      System.out.println("birthPlace: " + birthPlace);
      System.out.println("age: " + (2023 - birthYear));
      System.out.println("programming language fav: " + progrLangFav);
    } finally {
      input.close();
      System.out.println("finally");
    }

    // task 2
    int[] arrAngka1 = { 2, 3, 4, 5 };
    int[] arrAngka2 = { 1, 3, 5, 7 };

    for (int i = 0; i < arrAngka1.length; i++) {
      for (int j = 0; j < arrAngka2.length; j++) {
        if (arrAngka1[i] == arrAngka2[j]) {
          System.out.print(arrAngka1[i] + ", ");
        }
      }
    }

    System.out.println();

    System.out.println("halo selamat pagi!" + " " + " teman-teman");
    System.out.println("""
        1. beli makan
        2. beli minum
        """);
    System.out.println("hello world");
    System.out.print("hello satu");
    System.out.println("hello again");

    // instace obj
    /*
     * obj dapat digunakan untuk mengakses atribut dan method non-static
     */
    Main objMain = new Main();
    System.out.println(objMain.sisi);

    /*
     * untuk mengakses static atribt dan method, bisa dipanggil menggunakan class
     */
    System.out.println(Main.tinggi);

    int num = 100;
    System.out.println(num);
    String nama = "femil";
    System.out.println("nama: " + nama);
  }
}