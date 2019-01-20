import java.util.Scanner;

public class PrintingSymbol 
/* This is a class that will ask the user for input of a number of lines
 * and ask for the number of symbols per line
 * and ask for a symbol and then print it out with tabs at the beginning of a line.
 */
{

	public static void symbolPrinter()
	/*
	 * This is the function that will ask for input and then print out the symbols.
	 */
	{
		Scanner userInput = new Scanner(System.in);  // getting input from the user
		System.out.print("Enter Lines to display: ");
		int numberOfLines = 0;  // a variable that will be the number of lines after it is determined
		boolean validInputForLines = false;
		while (!validInputForLines)  //a while loop to check the validity of the user input. (Seeing if it is a odd number greater than 7
		{
			if (userInput.hasNextInt())  //makes sure it is a number
			{
				numberOfLines = userInput.nextInt(); //stores the number
				if ((numberOfLines > 7) && ((numberOfLines%2) == 1 )) //checks to see if the number is in the right values
				{
					validInputForLines = true; //exits the loop
				}
				else // lets the user know to re-input a valid response
				{
					System.out.println("Please enter a valid response. (odd number greater than 7)");
				}
			}
			else
			{
				System.out.println("Please enter a valid response. (odd number greater than 7)"); 
				userInput.next(); //scans the next line to stop an infinite loop
			}
		}
		System.out.print("Enter the Number Of Symbols Per Line: ");
		int numberOfSymbols = 0; 
		boolean validInputForSymbols = false;
		while (!validInputForSymbols)  //a while loop that checks the validity of the number of symbols per line 
		{
			if (userInput.hasNextInt())  //makes sure it is a number
			{
				numberOfSymbols = userInput.nextInt();
				if ((numberOfSymbols > 25) && (numberOfSymbols < 50))  //after storing the number it checks to make sure it is within the right values
				{
					validInputForSymbols = true; //exits loop
				}
				else
				{
					System.out.println("Please enter a valid response. (number between 25 and 50)"); //lets the user know they mis-input
				}
			}
			else
			{
				System.out.println("Please enter a valid response. (number between 25 and 50");
				userInput.next(); //goes to the next line to stop from going infinite
			}
		}
		System.out.print("Enter the Symbol to Print: ");
		String possibleSymbol = "A"; // sets two variables. One is the going to be the actual sybmol, the other is a placeholder before checking ACII Value
		char trueSymbol = 'A';
		boolean validInputForChar = false;
		while (!validInputForChar) //checks validity of the symbol
		{
			if (userInput.hasNext()) //checks to see if something was input
			{
				possibleSymbol = userInput.next(); //stores everything input
				char symbol = possibleSymbol.charAt(0); //takes only the first character because it only needs the first symbol
				int symbolASCII = (int) symbol; // converts the char to an int, which returns the ASCII Value
				if ((symbolASCII >= 33) && (symbolASCII <= 47))  //checks ASCOO Value
				{
					trueSymbol = symbol;
					validInputForChar = true;
				}
				else //talks about mis-inputs like before
				{
					System.out.println("Please enter a valid response. (A symbol with ASCII Value greater than 33 and less than 47)");
				}
			}
			else
			{
				System.out.println("Please enter a valid response. (A symbol with ASCII Value greater than 33 and less than 47)");
				userInput.next();
			}
		}
		for (int lineRepetitions = 0; lineRepetitions < numberOfLines; lineRepetitions++ ) //loop that repeats the process on each line.
		{
			for (int tabs = 0; tabs <= lineRepetitions; tabs++) //adds another tab to the start of each line
			{
				System.out.printf("\t");
			}
			for (int currentSymbol = 0; currentSymbol < numberOfSymbols; currentSymbol++) //adds the symbol to the line x number of times
			{
				System.out.print(trueSymbol);
			}
			System.out.println(""); //goes to the next line
		}
		
	}
	
	
	//Testing Client
	public static void main(String[] args)
	{
	 symbolPrinter(); //tested inputs (number of lines: 1,2,11,12,q) (number of symbols: 23,27,51,q) (symbols:$,*,q)
	}
	
	
	
	
}
