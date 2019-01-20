////////////////////////////////////////////////////////////////////////////////////
//
//  Lab4
//
//  Author  Gary Baker and garybake
//  Last Edited:  1/31/2018
//
////////////////////////////////////////////////////////////////////////////////////



import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
public class RomanNumeral 
/* This is a class that has a method that converts numbers to roman numerals.
 * 
 */
{

	public static String toRomanNumeral()
	{
		Scanner userInput = new Scanner(System.in); // getting input from the user
		System.out.print("Input Number: "); //prompting the user
		int numberBase10 = userInput.nextInt();
		String romanNumeralNumber = "";  //the string the roman numeral will be added too.
		while (numberBase10 >= 1000) //checks to see how big the roman numeral is, then determines what letter to add to the string. after it does
		{							// it removes the amount equal to the character in order to find the next character.
			romanNumeralNumber = romanNumeralNumber + "M"; //there is a lot of code to go through the different letters up to 3499.
			numberBase10 -= 1000;
		}
		while (numberBase10 >= 900)
		{
			romanNumeralNumber = romanNumeralNumber + "CM";
			numberBase10 -= 900;
		}
		while (numberBase10 >= 800)
		{
			romanNumeralNumber = romanNumeralNumber + "DCCC";
			numberBase10 -= 800;
		}
		while (numberBase10 >= 700)
		{
			romanNumeralNumber = romanNumeralNumber + "DCC";
			numberBase10 -= 700;
		}
		while (numberBase10 >= 600)
		{
			romanNumeralNumber = romanNumeralNumber + "DC";
			numberBase10 -= 600;
		}
		while (numberBase10 >= 500)
		{
			romanNumeralNumber = romanNumeralNumber + "D";
			numberBase10 -= 500;
		}
		while (numberBase10 >= 400)
		{
			romanNumeralNumber = romanNumeralNumber + "CD";
			numberBase10 -= 400;
		}
		while (numberBase10 >= 300)
		{
			romanNumeralNumber = romanNumeralNumber + "CCC";
			numberBase10 -= 300;
		}
		while (numberBase10 >= 200)
		{
			romanNumeralNumber = romanNumeralNumber + "CC";
			numberBase10 -= 200;
		}
		while (numberBase10 >= 100)
		{
			romanNumeralNumber = romanNumeralNumber + "C";
			numberBase10 -= 100;
		}
		while (numberBase10 >= 90)
		{
			romanNumeralNumber = romanNumeralNumber + "XC";
			numberBase10 -= 90;
		}
		while (numberBase10 >= 80)
		{
			romanNumeralNumber = romanNumeralNumber + "LXXX";
			numberBase10 -= 80;
		}
		while (numberBase10 >= 70)
		{
			romanNumeralNumber = romanNumeralNumber + "LXX";
			numberBase10 -= 70;
		}
		while (numberBase10 >= 60)
		{
			romanNumeralNumber = romanNumeralNumber + "LX";
			numberBase10 -= 60;
		}
		while (numberBase10 >= 50)
		{
			romanNumeralNumber = romanNumeralNumber + "L";
			numberBase10 -= 50;
		}
		while (numberBase10 >= 40)
		{
			romanNumeralNumber = romanNumeralNumber + "XL";
			numberBase10 -= 40;
		}
		while (numberBase10 >= 30)
		{
			romanNumeralNumber = romanNumeralNumber + "XXX";
			numberBase10 -= 30;
		}
		while (numberBase10 >= 20)
		{
			romanNumeralNumber = romanNumeralNumber + "XX";
			numberBase10 -= 20;
		}
		while (numberBase10 >= 10)
		{
			romanNumeralNumber = romanNumeralNumber + "X";
			numberBase10 -= 10;
		}
		while (numberBase10 >= 9)
		{
			romanNumeralNumber = romanNumeralNumber + "IX";
			numberBase10 -= 9;
		}
		while (numberBase10 >= 8)
		{
			romanNumeralNumber = romanNumeralNumber + "VIII";
			numberBase10 -= 8;
		}
		while (numberBase10 >= 7)
		{
			romanNumeralNumber = romanNumeralNumber + "VII";
			numberBase10 -= 7;
		}
		while (numberBase10 >= 6)
		{
			romanNumeralNumber = romanNumeralNumber + "VI";
			numberBase10 -= 6;
		}
		while (numberBase10 >= 5)
		{
			romanNumeralNumber = romanNumeralNumber + "V";
			numberBase10 -= 5;
		}
		while (numberBase10 >= 4)
		{
			romanNumeralNumber = romanNumeralNumber + "IV";
			numberBase10 -= 4;
		}
		while (numberBase10 >= 3)
		{
			romanNumeralNumber = romanNumeralNumber + "III";
			numberBase10 -= 3;
		}
		while (numberBase10 >= 2)
		{
			romanNumeralNumber = romanNumeralNumber + "II";
			numberBase10 -= 2;
		}
		while (numberBase10 >= 1)
		{
			romanNumeralNumber = romanNumeralNumber + "I";
			numberBase10 -= 1;
		}
		String finalRomanNumeral = ("Roman Numeral: " + romanNumeralNumber);  //adds the new roman numeral to the string that is returned.
		return finalRomanNumeral;
	}	
	
	

	
	public static void main(String[] args)
	{
		String romanNumeralNumber = toRomanNumeral();
		System.out.println(romanNumeralNumber); // tested 1978, 789, 43, 25, and 7
	}
		
	
}
