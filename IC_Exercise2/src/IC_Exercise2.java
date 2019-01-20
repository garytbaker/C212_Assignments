////////////////////////////////////////////////////////////////////////////////////
//
//  In Class Assignment 2
//
//  Author  Gary Baker and garybake
//  Last Edited:  1/31/2018
//
////////////////////////////////////////////////////////////////////////////////////



import java.util.Scanner;

public class IC_Exercise2
/*
 * this is a class that will find the second largest input and what position it is in.
 */
{

	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Input: ");
		int currentValue = userInput.nextInt();  //setting the default values for the max, second max, and positions
		int maximum = currentValue;
		int position = 1;
		int maximumPosition = 0;
		int secondMaximumPosition = 0;
		int secondMaximum = 0;
		boolean done = false;   //while loop condition
		while (!done)
		{
			position++;     //finding position
			currentValue = userInput.nextInt();
			if (currentValue > maximum)        //checking where the new value is compared to the max
			{
				secondMaximumPosition = maximumPosition;
				secondMaximum = maximum;
				maximum = currentValue;
				maximumPosition = position;
			}
			else if (currentValue == -1)  //ending the loop
			{
				done = true;
			}
			else if ((currentValue > secondMaximum) || secondMaximum == 0) //deals with a secondmax if it comes after a max. EX 4 then 3
			{
				secondMaximum = currentValue;
				secondMaximumPosition = position;
			}
		}
		System.out.println(secondMaximum + " (Second Largest) - " + secondMaximumPosition +" number");
	}
	
	
	
	
}
