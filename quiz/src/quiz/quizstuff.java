package quiz;

public class quizstuff {

	public static void main(String[] args) {
	
		
		
		
		
		
		
		
		
		
		
		int count = 0;
		int[][] numarray = new int[2][3];
		for (int i = 0; i < 3; i++)
		{
		   for (int j = 0; j < 2; j++)
		   {
		      numarray[j][i] = count;
		      count++;
		   }
		}
		System.out.print(numarray[1][2]);
		
		
		
		
		

	}

}
