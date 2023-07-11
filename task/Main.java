package task;

import java.util.Arrays;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Task 1
        // Buatkan java program untuk menampilkan firstName, lastName, birthPlace,
        // birthYear, dan progrLangFav!
        Scanner input = new Scanner(System.in);

        try {
            String firstName, lastName, birthPlace, progrLangFav;
            int birthYear;

            System.out.print("First Name: ");
            firstName = input.nextLine().trim();
            System.out.print("Last Name: ");
            lastName = input.nextLine().trim();
            System.out.print("Birth Year: ");
            birthYear = Integer.parseInt(input.nextLine().trim());
            System.out.print("Birth Place: ");
            birthPlace = input.nextLine().trim();
            System.out.print("Favorite Programming Language: ");
            progrLangFav = input.nextLine().trim();

            System.out.println("Full Name: " + firstName + " " + lastName);
            System.out.println("Birth Place: " + birthPlace);
            System.out.println("Age: " + (LocalDate.now().getYear() - birthYear));
            System.out.println("Favorite Programming Language: " + progrLangFav);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number for the birth year.");
        } finally {
            // Avoid resource leak
            input.close();
        }

        Integer[] array1 = { 2, 3, 4, 5 }, array2 = { 1, 3, 5, 7 };

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    System.out.print(array1[i] + ", ");
                    break;
                }
            }
        }

        Integer[] array = { 3, 2, 4, 1, 5 };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < (array.length - i - 1); j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
