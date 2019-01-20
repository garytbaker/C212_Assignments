import java.util.Scanner;

public class GlobalWarmingTest 
{

	public static String globalWarmingQuiz()
	/*
	 * This is a method that will perform the test
	 */
	{
		Scanner userInput = new Scanner(System.in);
		int points = 0; // the number of correct responses
		boolean questionOneAnswered = false;  //every question is set up like this. a while loop that repeats until a valid response is given.
		System.out.println("Question 1: What is the main caus of Global Warming?"); // if the response is the correction on, it increments points by 1.
		System.out.println("1) Carbon Dioxide 2) Greenhouse Gases 3) Air pollutants 4) All of the above");
		while (!questionOneAnswered)
		{
			int questionOneAnswer = 0;
			boolean validInputForQuestion1 = false;
			while (!validInputForQuestion1) // this while loop is for input verification. If they enter a wrong key, stops program from crashing.
			{
				if (userInput.hasNextInt())
				{
					questionOneAnswer = userInput.nextInt();
					validInputForQuestion1 = true;
				}
				else
				{
					System.out.println("\"Please enter a valid response. (1,2,3,or 4)\"");
					userInput.next();
				}
			}
			switch (questionOneAnswer) //using switch to test the cases as it can only be 1 of four values
			{
				case 1:
					questionOneAnswered = true;
					break;
				case 2:
					questionOneAnswered = true;
					break;
				case 3:
					questionOneAnswered = true;
					break;
				case 4:
					points++;
					questionOneAnswered = true;
					break;

			}
		}
		System.out.println("Question 2: Some believe weather stations in ______ areas are influenced by surrondings?");
		System.out.println("1) Urban 2) Rural 3) High Altitude 4) Low Altitude"); //and repeat
		boolean questionTwoAnswered = false;
		while (!questionTwoAnswered)
		{
			int questionTwoAnswer = 0;
			boolean validInputForQuestion2 = false;
			while (!validInputForQuestion2) 
			{
				if (userInput.hasNextInt())
				{
					questionTwoAnswer = userInput.nextInt();
					validInputForQuestion2 = true;
				}
				else
				{
					System.out.println("\"Please enter a valid response. (1,2,3,or 4)\"");
					userInput.next();
				}
			}
			switch (questionTwoAnswer)
			{
				case 1:
					points++;
					questionTwoAnswered = true;
					break;
				case 2:
					questionTwoAnswered = true;
					break;
				case 3:
					questionTwoAnswered = true;
					break;
				case 4:
					questionTwoAnswered = true;
					break;
			}
		}
		System.out.println("Question 3: Which One of these is not what Scientists say is a result of Climate Change?");
		System.out.println("1) Melting Glaciers 2) Rising Sea Levels 3) Heat Adapted Species 4) Increased Allergies");
		boolean questionThreeAnswered = false;
		while (!questionThreeAnswered)
		{
			int questionThreeAnswer = 0;
			boolean validInputForQuestion3 = false;
			while (!validInputForQuestion3) 
			{
				if (userInput.hasNextInt())
				{
					questionThreeAnswer = userInput.nextInt();
					validInputForQuestion3 = true;
				}
				else
				{
					System.out.println("\"Please enter a valid response. (1,2,3,or 4)\"");
					userInput.next();
				}
			}
			switch (questionThreeAnswer)
			{
				case 1:
					questionThreeAnswered = true;
					break;
				case 2:
					questionThreeAnswered = true;
					break;
				case 3:
					points++;
					questionThreeAnswered = true;
					break;
				case 4:
					questionThreeAnswered = true;
					break;
			}		
		}
		System.out.println("Question 4: According to climate change skeptics, Why are computer models not accurate");
		System.out.println("1) They don't feel temperature. 2) They are merely a guess");
		System.out.println("3) They are always technologically behind. 4) They actually are accurate.");
		boolean questionFourAnswered = false;
		while (!questionFourAnswered)
		{
			int questionFourAnswer = 0;
			boolean validInputForQuestion4 = false;
			while (!validInputForQuestion4) 
			{
				if (userInput.hasNextInt())
				{
					questionFourAnswer = userInput.nextInt();
					validInputForQuestion4 = true;
				}
				else
				{
					System.out.println("\"Please enter a valid response. (1,2,3,or 4)\"");
					userInput.next();
				}
			}
			switch (questionFourAnswer)
			{
				case 1:
					questionFourAnswered = true;
					break;
				case 2:
					points++;
					questionFourAnswered = true;
					break;
				case 3:
					questionFourAnswered = true;
					break;
				case 4:
					questionFourAnswered = true;
					break;
			}
		}
		System.out.println("Question 5: What is the only Country to have higher Carbon Dioxide emmisions than the US?");
		System.out.println("1) China 2) Russia 3) India 4) The US is the largest pollutor");
		boolean questionFiveAnswered = false;
		while (!questionFiveAnswered)
		{
			int questionFiveAnswer = 0;
			boolean validInputForQuestion5 = false;
			while (!validInputForQuestion5) 
			{
				if (userInput.hasNextInt())
				{
					questionFiveAnswer = userInput.nextInt();
					validInputForQuestion5 = true;
				}
				else
				{
					System.out.println("\"Please enter a valid response. (1,2,3,or 4)\"");
					userInput.next();
				}
			}
			switch (questionFiveAnswer)
			{
				case 1:
					points++;
					questionFiveAnswered = true;
					break;
				case 2:
					questionFiveAnswered = true;
					break;
				case 3:
					questionFiveAnswered = true;
					break;
				case 4:
					questionFiveAnswered = true;
					break;
			}
		}
		switch (points) // a switch case at the end to check how well they did and return the correct response
		{
		case 5:
			return "Excellent";
		case 4:
			return "Very Good";
		default:
			return "Time to brush up on your knowledge of Global Warming. \n Visit https://www.nrdc.org/stories/global-warming-101"
				+ " \n and https://science.howstuffworks.com/environmental/green-science/climate-skeptic1.htm";
		}
	}
	//for Testing
	public static void main(String[] args)
	{
		String myTestResults = globalWarmingQuiz(); //the test case. checked with 0,1,2,3,4,5 questions right. 
		System.out.println(myTestResults);
	}
	
}
