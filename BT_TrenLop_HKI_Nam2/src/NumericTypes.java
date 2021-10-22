// TASK #2 Add an import statement for the Scanner class
// TASK #2(Alternate)
// Add an import statement for the JOptionPane class

/**
   This program demonstrates how numeric types and
   operators behave in Java.
*/
import java.util.Scanner;
public class NumericTypes
{
   public static void main (String [] args)
   {
      // TASK #2 Create a Scanner object here
      // (not used for alternate)

      // Identifier declarations
	   Scanner sc=new Scanner(System.in);
      final int NUMBER = 2 ;        // Number of scores
      final int SCORE1 = 100;       // First test score
      final int SCORE2 = 95;        // Second test score
      final int BOILING_IN_F = 212; // Boiling temperature
      double fToC;                     // Temperature Celsius
      double average;               // Arithmetic average
      String output;                // Line of output
      //int tinh = (int)5/9*(BOILING_IN_F - 32);
      //System.out.println("ket qua"+tinh);
      // TASK #2 declare variables used here
      // TASK #3 declare variables used here
      // TASK #4 declare variables used here

      // Find an arithmetic average.
      average = (double)(SCORE1 + SCORE2) / NUMBER;//Thêm dấu ngoặc đơn() và ép kiểu (double)
      output = SCORE1 + " and " + SCORE2 +
               " have an average of " + average;
      System.out.println(output);

      // Convert Fahrenheit temperature to Celsius.
      fToC = (double)5/9 * (BOILING_IN_F - 32);
      output = BOILING_IN_F + " in Fahrenheit is " +
               fToC + " in Celsius.";
      System.out.println(output);
      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #2 HERE
      // Prompt the user for first name
      // Read the user's first name
      // Prompt the user for last name
      // Read the user's last name
      // Concatenate the user's first and last names
      // Print out the user's full name
      
      String first_name, last_name, full_name;
      System.out.print("Please enter your first name ");
      first_name= sc.nextLine();
      System.out.print("Please enter your lasst name ");
      last_name= sc.nextLine();
      full_name=first_name+last_name;
      System.out.println("Hello "+full_name);
      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #3 HERE
      // Get the first character from the user's first name
      // Print out the user's first initial
      // Convert the user's full name to uppercase
      // Print out the user's full name in uppercase
      String firstInitial;

      //khai báo một mảng, sau đó sử dụng phương thức toCharArray()
      //để chuyển đổi message thành một mảng kiểu char
      String tam=first_name;
      char[] charArray = tam.toCharArray();
      System.out.println("The user’s first initial is: "+charArray[0]);
      System.out.println("The fullname after changing to :"+full_name.toUpperCase());
      System.out.println("The fullname " +full_name+ " and "+charArray.length+" characters");


      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #4 HERE
      float diameter,r;
	double volume;
      // Prompt the user for a diameter of a sphere
      System.out.println("Please enter a diameter of a sphere");
      // Read the diameter
      diameter = sc.nextFloat();
      // Calculate the radius
      r = (float)diameter/2; 
      // Calculate the volume
      volume = ((float)4/3*Math.PI* Math.pow(r,3));
      System.out.println(Math.PI);
      System.out.println(Math.pow(r,3));
      // Print out the volume
      System.out.println("the volume: "+volume);
   }


}