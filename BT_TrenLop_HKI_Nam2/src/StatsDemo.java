import java.text.DecimalFormat;	//for number formatting
import java.util.Scanner;		//for keyboard input

import javax.print.attribute.standard.NumberUpSupported;

import java.io.*;               //ADD AN IMPORT STATEMENT HERE  //for using files

public class StatsDemo
{
	private final static String FILE_URL = "Numbers.txt";
    public static void main(String [] args) throws IOException   //ADD A THROWS CLAUSE HERE
    {
    	
    	//File File = new File(FILE_URL);
        double sum = 0;		//the sum of the numbers
        int count = 0;		//the number of numbers added
        double mean = 0;  	//the average of the numbers
        double stdDev = 0;	//the standard deviation of the numbers
        String line;		//a line from the file
        double difference;	//difference between the value and the mean

        DecimalFormat threeDecimals = new DecimalFormat("0.000");
        Scanner keyboard = new Scanner (System.in);             // Creates an object of class Scanner.
        String filename=FILE_URL;	                                    // The user inputs a file's name.
        
        
        //Prompt the user and read in the file name
        /*System.out.println("This program calculates statistics"
                + "on a file containing a series of numbers.");
        System.out.print("Enter the file name:  ");
        filename = keyboard.nextLine();*/

        //ADD LINES FOR TASK #4 HERE
        FileReader file = new FileReader(filename);             // Create a FileReader object passing it the filename.
        BufferedReader input = new BufferedReader(file);        // Create a BufferedReader object passing it the FileReader object.
        line = input.readLine();                                // Priming read to read the first line of the file.
        while (line != null)                                    // Create a loop that continues until you are at the end of the file.
        {
            sum += Double.parseDouble(line);                    // Convert the line into a double value and add the value to the sum.
            count++; 											// Increment the counter.
            line = input.readLine();                            // Read a new line from the file.
        }
        input.close();                                          // Close the input file.
        file.close();
        mean = sum / count;                                     // Store the calculated mean.
        System.out.println("tong: "+sum);
        //ADD LINES FOR TASK #5 HERE
        FileReader file2 = new FileReader(filename);            // Reconnect to the FileReader object passing it the filename.
        BufferedReader input2 = new BufferedReader(file2);      // Reconnect to the BufferedReader object passing it the FileReader object.
        sum = 0;                                                // Reinitialize the sum of the numbers.
        count = 0;                                              // Reinitialize the number of numbers added.
        line = input2.readLine();                               // Priming read to read the first line of the file
        while (line != null)                                    // Loop that continues until you are at the end of the file.
        {
            difference = Double.parseDouble(line) - mean;       // Convert the line into a double value and subtract the mean.
            sum += Math.pow(difference, 2);                     // Add the square of the difference to the sum.
            count++;                                            // Increment the counter.
            line = input2.readLine();                           // Read a new line from the file.
        }
        input2.close();                                         // Close the input file.
        stdDev = Math.sqrt((sum / count));                      // Store the calculated standard deviation.
       

        //ADD LINES FOR TASK #3 HERE
        FileWriter fWriter = new FileWriter("Results.txt");     // Create an object of type FileWriter using �Results.txt�
        PrintWriter output = new PrintWriter(fWriter);          // Create an object of PrintWriter passing it the FileWriter object.
        output.println("The mean is " +                                     // Print the results to the output file.
                threeDecimals.format(mean) + " and the standard " +
                "deviation is " + threeDecimals.format(stdDev) + ".");
        output.close();       // Close the output file.
        System.out.println(" kết thuc");
        
    }
}