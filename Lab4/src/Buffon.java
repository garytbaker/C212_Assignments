import java.util.Random;
public class Buffon 
{
	/*
	 * This is a class to conduct the buffon Needle Experiment to approximate pi, though it uses pi so it is nt a good pi estimator.
	 */
	public static double buffonNeddleExperiment()
	/*
	 * This is the function that will perform the test
	 */
	{
		Random randomNumberGenerator = new Random(); //creation of a random number generator
		double attempts = 10000.0; // the number of attempts of the experiment. it is a double so the divison at the end will be a double to retain decimals.
		int currentAttempt = 0; 
		int hits = 0; //the number of times the needle is a hit
		while (currentAttempt<attempts) // a loop whose condition makes it to where the experiment is attempted 10000 times
		{
			double lowPoint = (randomNumberGenerator.nextFloat()*2); // creates a random number between 0 and 2 to be the low point of the needle
			double angle = (randomNumberGenerator.nextFloat()*180); //creates a random number between 0 and 180 to be a random angle
			double highPoint = (lowPoint + Math.sin(Math.toRadians(angle))); //calculates the highest point of the needle.
			if (highPoint >= 2)
			{
				hits++;  //adds a hit if it is above 2
			}
			currentAttempt++;
		}
		return (attempts/hits); //returns what should be an approximation of pi
	}
	public static void main(String[] args)
		{			
			System.out.print(buffonNeddleExperiment()); //ran it 10 times and found that it was close to pi each time.
		}	
	
}
