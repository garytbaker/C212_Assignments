//  Lab 2 
//  
//  Released:  1/11/18
//
//  @Author  Gary Baker
//  Last Edited: 1/17/2018  
//
//
//  Directions:  Implement the following methods 
//               
//               
//////////////////////////////////////////////////////////////////////////////////

// Note:  Do not need to explicitly import classes from java.lang but wanted to make it explicit 
// Goal - understand using Static classes - i.e. the Math class was not designed to be Instantiated (make objects) 
// It is a class that provides functionality and will be used to complete one of the methods
import java.lang.Math;

public class Lab2Template 
{
    

    // computes volume of a sphere when given its diameter
    public static double volumeOfSphere(int diameter)
    {
    	double radius = diameter / 2.0;
    	double volume = Math.PI * 4/3 * Math.pow((radius), 3);
    	return volume;
    }
    
    // computes surface area of a cylinder with given diameter and height
    public static double surfaceAreaCylinder(double diameter, double height) 
    {
    	double surfaceArea = ((Math.PI * diameter * height)+ (2 * Math.PI * Math.pow((diameter / 2), 2)));
    	return surfaceArea;
    }
    
    // returns a String, in the following format "SquareArea: *, Perimeter: *, Diagonal: *" where * refers to square of 
    // the rectanglar area, perimeter, and the diagonal of the square respectively 
    // (use Pythagorean Theorem)
    public static String squareMeasurements(int len) 
    {
    	double squareArea = Math.pow(len, 2);
    	int perimeter = len * 4;
    	double diagonal = Math.sqrt((2 * Math.pow(len, 2)));
    	String squareAttributes = ("SquareArea: " + String.valueOf(squareArea) + " Perimeter: " + String.valueOf(perimeter) + " Diagonal: " + String.valueOf(diagonal));
    	return squareAttributes;
    }
    
    // reads a number between 1000 and 9999999 and prints it with commas (,) separating every three digits
    // for example: 12317910 will be printed as 12,317,910
    // hint use modulus (%) to save part of the number, then concatenate back together as a String
    public static String addCommas(int num) 
    {
      String numberWithCommas = String.format("%,d", num);
      return numberWithCommas;
    }
    
    // given angle in Degrees, convert to radians (hint look at Math class Java doc API)
    // and return a string of the Sin, Cos, and Tangent of the angle  
    public static String trigFunctions(double angleInDegrees) 
    {
    	double angleInRadians = Math.toRadians(angleInDegrees);
    	
    	double sinOfAngle = Math.sin(angleInRadians);
    	double cosOfAngle = Math.cos(angleInRadians);
    	double tanOfAngle = Math.tan(angleInRadians);
    	
    	String angleAttributes = "Sin: " + String.valueOf(sinOfAngle) + " Cos: " + String.valueOf(cosOfAngle) + " Tan: " + String.valueOf(tanOfAngle);
    	return angleAttributes;
    
    }
    
 
    // test client 
    public static void main(String[] args) 
    {
       System.out.println(volumeOfSphere(2));
       System.out.println(volumeOfSphere(3));
       System.out.println(volumeOfSphere(4));
       
       System.out.println(surfaceAreaCylinder(2,2));
       System.out.println(surfaceAreaCylinder(1,3));
       System.out.println(surfaceAreaCylinder(4,1));
       
       System.out.println(squareMeasurements(2));
       System.out.println(squareMeasurements(3));
       System.out.println(squareMeasurements(4));
       
       System.out.println(addCommas(1234567));
       System.out.println(addCommas(4567));
       System.out.println(addCommas(67));
       
       System.out.println(trigFunctions(55));
       System.out.println(trigFunctions(90));
       System.out.println(trigFunctions(145));
       
       CompoundExercises.compoundOperators();
       
    }
}

///////////////////////////////////
//                               //
// ANSER THE FOLLOWING QUESTIONS //
//                               //
///////////////////////////////////

/*
 * Questions 1-3 are on explicit and implicit casting of some numerical types  
 *
 * 1.  What happens if you multipy a double with a char? 
 * 		Since double is a bigger data type, it converts the char into a double by its ASCII value, then it
 * 		multiplies the ASCII value by the other double.
 * 
 * 2.  What happens if a method has a parameter of type int, but you pass it a char?
 * 		The char gets converted to an int by its ASCII value and then
 * 		the method uses that value to perform the method.
 *  * 
 * 3.  What happens if a method has a parameter of type char, but you pass it an int? 
 * 		Compile-type Error
 * 4.  What are the 8 primitive data types in the Java language 
 * 		Boolean
 * 		Char
 * 		Byte
 * 		Short
 * 		Int
 * 		Long
 * 		float
 * 		double
 *
 * 5.  Consider the following code snippet.
 *     int i = 10;
 *     n = ++(i++);
 *     System.out.println(++(i++)% 5) ;
 * 
 *     Without Compiling the Program:
 *     What {do you think} are the values of i and n if the code is executed?
 *     i = 14
 *     n = 11
 *     
 *     What are the final value printed?
 *     3
 *     
 *     Now Compile and Run the Program to check your answers. If they are different, explain why 
 *     and provide updated code!
 *     
 *     I was right when i compiled and ran the code.
 */
