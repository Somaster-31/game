
import java.util.Scanner;
import java.util.Random;
//import javax.lang.model.util.ElementScanner14;

public class game {
   public static void main(String args[]) {

      // play 1
      // 0 - ROCK
      // 1 - PAPER
      // 2 - SCISSOR
      System.out.println("///////// WELECOME TO ROCK PAPER SCISSOR GAME/////////");
      System.out.println("");
      Scanner sc = new Scanner(System.in);
      System.out.println("Your turn: ");
      int i = sc.nextInt();

      if (i == 0) {
         System.out.println("ROCK");
      } else if (i == 1) {
         System.out.println("PAPER");
      }

      else if (i == 2) {
         System.out.println("SCISSOR ");
      } else {
         System.out.println("Invalid input");

      }
      System.out.println("");
      System.out.println("");
      System.out.println("");

      Random rand = new Random();

      int minRange = 0, maxRange = 3;
      int value = rand.nextInt(maxRange - minRange) + minRange;
      System.out.println("Computer's Turn");
      System.out.println(value);

      if (value == 0) {
         System.out.println("ROCK");
      } else if (value == 1) {
         System.out.println("PAPER");
      }

      else {
         System.out.println("SCISSOR ");
      }

      System.out.println("");
      System.out.println("");

      if (i == 0 && value == 0) {
         System.out.println("Its Draw ");

      }
      if (i == 1 && value == 1) {
         System.out.println("Its Draw ");

      }
      if (i == 2 && value == 2) {
         System.out.println("Its Draw ");

      }
      if (i == 1 && value == 0) {
         System.out.println("1 point ");
      }

      if (i == 1 && value == 2) {
         System.out.println("Sorry no points ");

      }

      if (i == 2 && value == 0) {
         System.out.println("Sorry no points ");

      }
      if (i == 2 && value == 1) {
         System.out.println("1 point ");

      }

      if (i == 0 && value == 1) {
         System.out.println("Sorry no points ");

      }
      if (i == 0 && value == 2) {
         System.out.println("1 point");

      }

      // System.out.println("Your Score is: ");

   }
}