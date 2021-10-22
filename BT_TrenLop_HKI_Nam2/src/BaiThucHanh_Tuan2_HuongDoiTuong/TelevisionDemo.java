package BaiThucHanh_Tuan2_HuongDoiTuong;
import java.util.Scanner;  // Needed for the Scanner class
//import Television;
/**
   This class demonstrates the Television class.
*/

public class TelevisionDemo
{
   public static void main(String[] args)
   {
      // Create a Scanner object to read from the keyboard
      Scanner keyboard = new Scanner (System.in);

      // Declare variables
      int station;         // The user's channel choice

      // Declare and instantiate a television object
      Television bigScreen = new Television("Toshiba", 55);

      // Turn the power on
      bigScreen.power();

      // Display the state of the television
      System.out.println("A " +
                         bigScreen.getScreenSize() +
                         " inch " +
                         bigScreen.getManufacturer() +
                         " has been turned on.");

      // Prompt the user for input and store into station
      System.out.print("What channel do you want? ");
      station = keyboard.nextInt();

      // Change the channel on the television
      bigScreen.setChannel(station);

      // Increase the volume of the television
      bigScreen.increaseVolume();

      // Display the the current channel and
      // volume of the television
      System.out.println("Channel: " +
                         bigScreen.getChannel() +
                         " Volume: " +
                         bigScreen.getVolume());
      System.out.println("Too loud! Lowering the volume.");

      // Decrease the volume of the television
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();
      bigScreen.decreaseVolume();

      // Display the the current channel and
      // volume of the television
      System.out.println("Channel: " +
                         bigScreen.getChannel() +
                         " Volume: " +
                         bigScreen.getVolume());

      System.out.println();   // For a blank line

      // HERE IS WHERE YOU DO TASK #5
    //declare and instantiate a television object
    		Television portable = new Television("Sharp", 19);
    		//turn the power on
    		portable.power();
    		//display the state of the television
    		System.out.println("A " + portable.getScreenSize() + " inch " +
    			portable.getManufacturer()	+ " has been turned on.");
    		//prompt the user for input and store into station
    		System.out.print("What channel do you want?  ");
    		station = keyboard.nextInt();

    		//change the channel on the television
    		portable.setChannel(station);
    		//increase the volume of the television
    		portable.increaseVolume();
    		//display the the current channel and volume of the television
    		System.out.println("Channel:  " + portable.getChannel() +
    			"   Volume:  "	+ portable.getVolume());
    		
    		//decrease the volume of the television
    		portable.decreaseVolume();
    		portable.decreaseVolume();
    		portable.decreaseVolume();
    		
    		System.out.println();   	//for a blank line
      
   }
}