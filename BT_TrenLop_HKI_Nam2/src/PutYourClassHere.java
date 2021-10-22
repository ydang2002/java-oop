import java.util.Scanner;
// Demonstration of static methods
public class PutYourClassHere
 {
 public static void main (String [] args)
  {
  int choice; //the user's choice
  double value = 0; //the value returned from the method
  char letter;  //the Y or N from the user's decision to exit 
  double radius; //the radius of the circle
  double length; //the length of the rectangle 
  double width,height;  //the width and height of the rectangle 
  double base;  //the base of the triangle 
  double side1,side2,side3;  // sides of the triangle

//create a scanner object to read from the keyboard
  Scanner keyboard = new Scanner (System.in);

//do loop was chose to allow the menu to be displayed first do
  do
  {
   //call the printMenu method here
   printMenu();
   choice = keyboard.nextInt();

  switch (choice)
  {
   case 1:
    System.out.print("Enter the radius of the circle:  ");
    radius = keyboard.nextDouble();
    value = circleArea(radius);
     //call the circleArea method and store the result in the value 
    System.out.println("The area of the circle is " + value);
    break;
   case 2:
    System.out.print("Enter the length of the rectangle:  "); 
    length = keyboard.nextDouble();
    System.out.print("Enter the width of the rectangle:  ");
    width = keyboard.nextDouble();
    value = rectangleArea(length,width);
    //call the rectangleArea method and store the result in the value 
    System.out.println("The area of the rectangle is " + value); 
    break;
   case 3:
    System.out.print("Enter the height of the triangle:  "); 
    height = keyboard.nextDouble(); 
    System.out.print("Enter the base of the triangle:  "); 
    base = keyboard.nextDouble();
    value = triangleArea(height,base);
    //call the triangleArea method and store the result in the value 
    System.out.println("The area of the triangle is " + value); 
    break;
   case 4:
    System.out.print("Enter the radius of the circle:  ");
    radius = keyboard.nextDouble();
    value = circleCircumference(radius);
    //call the circumference method and store the result in the value 
    System.out.println("The circumference of the circle is " + value); 
    break;
   case 5:
    System.out.print("Enter the length of the rectangle:  "); 
    length = keyboard.nextDouble(); 
    System.out.print("Enter the width of the rectangle:  "); 
    width = keyboard.nextDouble();
    value = rectanglePerimeter(length,width);
    //call the perimeter method and store the result in the value 
    System.out.println("The perimeter of the rectangle is " + value); 
    break;
   case 6:
    System.out.print("Enter the length of side 1 of the triangle:  ");
    side1 = keyboard.nextDouble();
    System.out.print("Enter the length of side 2 of the triangle:  ");
    side2 = keyboard.nextDouble();
    System.out.print("Enter the length of side 3 of the triangle:  ");
    side3 = keyboard.nextDouble();
    value = trianglePerimeter(side1,side2,side3);
    //call the perimeter method and store the result in the value 
    System.out.println("The perimeter of the triangle is " + value); 
    break;
   default:
  System.out.println("You did not enter a valid choice.");
     }//end of switch statement
//consumes the new line character after the number 
  keyboard.nextLine();

  System.out.println("Do you want to exit the program (Y/N)?:  "); 
  String answer = keyboard.nextLine();
  letter = answer.charAt(0); //select first character of response

  }while (letter != 'Y' && letter != 'y'); //end of do-while loop

 }//end of main

//insert your method definitions here
 public static void printMenu() {
  System.out.println("This is a geometry calculator ");
  System.out.println("Choose what you would like to calculate!");
  System.out.println("1. Find the area of a cirlce ");
  System.out.println("2. Find the area of a rectangle ");
  System.out.println("3. Find the area of a triangle ");
  System.out.println("4. Find the circumference of a cirle ");
  System.out.println("5. Find the perimeter of a rectangle ");
  System.out.println("6. Find the perimeter of a triangle");
  System.out.print("Enter the number of your choice: ");
 }
 public static double circleArea(double r) {
  return Math.PI * r * r;
 }
 public static double rectangleArea(double length, double width) {
  return length * width;
 }
 public static double triangleArea(double height, double base) {
  return .5 * height * base;
 }
 public static double circleCircumference(double r) {
  return 2 * Math.PI * r;
 }
 public static double rectanglePerimeter(double length,double width) {
  return 2 * length + 2 * width;
 }
 public static double trianglePerimeter(double side1,double side2, double side3) {
  return side1 + side2 + side3;
 }


}//end of class