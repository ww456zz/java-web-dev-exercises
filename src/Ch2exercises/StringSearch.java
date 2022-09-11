package Ch2exercises;

import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String prom = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book," +
                "' thought Alice 'without pictures or conversation?'";
        String lowerProm = prom.toLowerCase();
        System.out.println("Enter your search: ");
        String searchProm = input.nextLine();
        String lowerSearch = searchProm.toLowerCase();

      if (prom.indexOf(lowerSearch)>=0) {
          System.out.println("true");
      }
input.close();
    }
}
