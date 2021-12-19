package Tuan3_Bai7_8;
import java.util.Scanner;
public class Average {
	public int[] data;
	private double mean;
	
	public Average() {
		data = new int [5];
		Scanner intput = new Scanner(System.in);
		
		for(int i=0; i<data.length;i++) {
			System.out.println("Enter number " + (i+1) + ": ");
			data[i] = intput.nextInt();
		}
		selectionSort();
		calculatemean();
	}
	
	public void calculatemean() {
		int total = 0;
		for(int i=0; i<data.length;i++) {
			total = total +data[i];
			mean = total / data.length;
		}
	}
	
	public void selectionSort() {
		for (int i = 0; i < data.length; i++){
            int max = data[i];
            int maxIndex = i;
            for (int j = i+1; j<data.length; j++) {
                if (max < data[j]) {
                    max = data[j];
                    maxIndex = j;
                }

            }
            data[maxIndex] = data[i];
            data[i] = max;
        }
	}
	
	public String toString()
	{
	String output;
	output ="The test scores in descending order are \n";

	for (int i = 0; i < data.length; i++)
	{
	output = output + data[i] + " ";
	}
	output = output + "\nThe average is " + mean;
	return output;
	}
	
}
