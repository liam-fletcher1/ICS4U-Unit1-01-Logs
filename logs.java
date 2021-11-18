/*
* The logs program
*
* @author  Liam Fletcher
* @version 1.0
* @since   2021-11-19 
* Class logs.
*/

import java.util.Scanner;

public class logs {
  
  /**
  * The logs program
  */

  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter log length (0.25m, 0.5m or 1m): ");

    // String input 
    float length = myObj.nextFloat();

    // Output input by user
    System.out.println("Total log amount: " + (1100 / (length * 20)));
    System.out.println("Done.");
  }
}
