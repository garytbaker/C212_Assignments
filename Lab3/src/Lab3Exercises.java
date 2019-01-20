/****************************************
*C212
*  
* Released:  1/24/18
*
*  Lab 3
*  @Gary Baker and garybake
*  Last Edited: 1/29/18
*
*
*  Directions: finish methods and make comments answering questions. 
*
*****************************************/

import java.util.*;
import java.util.Scanner;


public class Lab3Exercises 
{
	
	
	public static boolean palidrome(String myString)
	/*
	 * this is a function that will check to see if the word is the smae if it is spelled backwards
	 */
	{

		int lettersLeftToReversePossiblePalidrome = (myString.length() - 1); //a variable that keeps track of the number of letters left to be reversed
		String comparedPalidrome = "";
		boolean isOrIsNotPalidrome = false; //what will be returned by the function.
		
		while(lettersLeftToReversePossiblePalidrome >= 0) // a loop that stays open while there are letters left to be reversed
		{
			 
			comparedPalidrome = (comparedPalidrome + myString.charAt(lettersLeftToReversePossiblePalidrome--));	//adding the last letter to the new word
			if (comparedPalidrome.length() == myString.length()) //checks to see if the words are the same length
			{		
				if (myString.equals(comparedPalidrome))
				{	
					isOrIsNotPalidrome = true; //if it is a palidrome, it sets it to true
				}

			}
		}
		
		return isOrIsNotPalidrome;
	}
	
	
	public static String numbers()
	/*
	 * this is a function that takes user input until a non-integer is input and then returns the sum of the unique numbers,
	 * the biggest value, and the smallest value.
	 */
	{
		Scanner userInput = new Scanner(System.in); //using the scanner class to get input
		List<Integer> listOfNumbers = new ArrayList<Integer>(); //the creation of an arraylist to store values
		while (userInput.hasNextInt()) // this is a loop that checks to see if the numbers are still ints, then checks to see if they have yet to be added to the list.
		//if they haven't, it adds them to the list
		{
			int currentScan = userInput.nextInt();
			if (listOfNumbers.contains(currentScan) != true)
			{
			listOfNumbers.add(currentScan);
			}
		}
		int sizeOfList = listOfNumbers.size(); //declaration of base variables
		int maximumNumber = listOfNumbers.get(0);
		int minimumNumber = listOfNumbers.get(0);
		int sumOfNumbers = 0;
		for (int number = 0; number < (sizeOfList); number++)  //a for loop that calculates the same and locates the max and min
		{
			sumOfNumbers += listOfNumbers.get(number);
			if (listOfNumbers.get(number) > maximumNumber)
			{
				maximumNumber = listOfNumbers.get(number);
			}
			if (listOfNumbers.get(number) < minimumNumber)
			{
				minimumNumber = listOfNumbers.get(number);
			}
				
		}	
		
		String attributesOfNumbers = ("Sum: " + sumOfNumbers + " Minimum Value: " + minimumNumber + " Maximum Value: " + maximumNumber);
		return attributesOfNumbers;
	}
    	
	
	public static String grade()
	/*
	 * this is a method that takes input and returns the corresponding letter grade
	 */
	{
		Scanner userInputForGrade = new Scanner(System.in);
		double gradeInPercent = userInputForGrade.nextDouble();  //setting user input to a variable
		String letterGrade = ""; 
		if (gradeInPercent > 92.1)  // a bunch of if, if else, and else statements locating the denoting the grade brackets.
		{
			letterGrade = "A";
		}
		else if (gradeInPercent > 82.1)
		{
			letterGrade = "B";
		}
		else if (gradeInPercent > 72.1)
		{
			letterGrade = "C";
		}
		else if (gradeInPercent > 62.1)
		{
			letterGrade = "D";
		}
		else
		{
			letterGrade = "F";
		}
		String stringOfGrade = ("Your grade is a " + letterGrade); //what the function will return
		return stringOfGrade;
	}
	
	
	public static String intToBinary(int number)
	/*
	 * this is a function that will take an int and return its binary value
	 */
	{
		String numberInBinary = ""; //the binary will be created as a string.
		int numberBeforeDivision = number;  //the number that will be checked with a modulus before being divided by two to see if the next binary digit is a 1 or a 0
		while (numberBeforeDivision > 0) // a while loop that creates the string of the binary
		{
			if ((numberBeforeDivision % 2) == 1) //how to find out if the digit is a 1 or a two by using a modulus
			{
				numberInBinary = "1" + numberInBinary;
			}
			
			else
			{
				numberInBinary = "0"+ numberInBinary;
			}
			numberBeforeDivision = numberBeforeDivision/2; //sets the next number to be checked with the modulus
		}
		if (numberInBinary == "") // a conditional if the user only input 0 to return the right binary value
		{
			numberInBinary = "0";
		}
		return numberInBinary;
	}
	
	
	public static void main(String[] args) //the main where the functions are being tested
	{
		Scanner typedWord = new Scanner(System.in);
		String possiblePalidrome = typedWord.nextLine();
		System.out.println(Lab3Exercises.palidrome(possiblePalidrome)); //tested "abba", "asdsa", and "asdfg".
		
		System.out.println(numbers()); //tested [1,2,3,4,3,2,1,w], [2,3,4,3,5,3,1,e],[1,2,3,1,2]
		
		System.out.println(grade()); //tested 91.3, 50, and 72.2 
		
		System.out.println(intToBinary(0));
		System.out.println(intToBinary(1));
		System.out.println(intToBinary(4));
		System.out.println(intToBinary(8));


	}
}
/*
*i)
*	1) It would be a double with the value 1.618
*	2) It would be a double with the value of 10.0
*	3) It would be a boolean with the value false
*	4) It would be a String with the value "123"
*ii)
*	1)3.00009155413138
*	2)999000
*	3)10000
*
**/
