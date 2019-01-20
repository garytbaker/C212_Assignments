
import  java.util.Arrays;
public class ICExercise3 
{

	public static double[] swapArrayElement (double[] inComingArray)
	{
		double minimum = inComingArray[0];
		int minIndex = 0;
		int maxIndex = 0;
		double maximum = inComingArray[0];
		for (int i = 0; i<inComingArray.length; i++)
		{
			if (inComingArray[i] < minimum)
			{
				minimum = inComingArray[i];
				minIndex = i;
			}
			if (inComingArray[i] > maximum)
			{
				maximum = inComingArray[i];
				maxIndex = i;
			}
			
		}
		inComingArray[maxIndex] = minimum;
		inComingArray[minIndex] = maximum;
		return inComingArray;
	}
		public static void main(String[] args)
		{
			double[] myArr= {1.0,2.0,3.0};
			swapArrayElement(myArr);
			for (double element:myArr)
			{
				System.out.print(element + " ");
			}
		}
		
	
	
}
