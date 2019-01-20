import java.util.Arrays;
public class Matrix 
{

	private double[][] matrix; //the actua "matrix" a 2d array
	private final int NUMROW; //the number of rows
	private final int NUMCOL; //the number of columns

	/**
	 * This is a constructor to create a Matrix.
	 * @param m this is a 2D Array of doubles
	 */
	public Matrix(double[][] m)
	{
		NUMROW = m.length;
		NUMCOL = m[0].length;
		matrix = new double[NUMROW][NUMCOL];
		for (int row = 0; row<NUMROW; row++)  //this loop adds the array to the private matrix
		{
			for (int column=0; column < NUMCOL; column++)
			{
				matrix[row][column] = m[row][column];
			}
		}
	}
	
	
	
	/**
	 * this converts out the matrix as a String.
	 * @return It returns the string of the matrix.
	 */
	public String toString()
	{
		String matrixString = "";
		matrixString = matrixString + "[";// adds the first [
		for (int row = 0; row<NUMROW; row++) //this loop adds the contents by row
		{
			for (int column=0; column < NUMCOL; column++) //this adds the contents by column
			{
				if (row == NUMROW-1 && column == NUMCOL -1) //decinding if it is the end of the matix or not
				{
					matrixString = matrixString + matrix[row][column];
				}
				else
				{
					matrixString = matrixString + matrix[row][column] + ", ";
				}
			}
				if (row != NUMROW-1) //going to the next line
				{
					matrixString = matrixString + "\n";
				}
		}
		matrixString = matrixString + "]"; //adding last brace
		return matrixString;
	}
	
	
	
	/**
	 * This returns a new matrix wit the columns as rows and the rows as columns
	 * @return another matrix with the rows of the previous as columns and the columns of the old one as rows.
	 */
	public Matrix transposeMatrix()
	{
		double[][] transposedArray = new double[NUMCOL][NUMROW]; //creating a new array that will store the transposed
		for (int row = 0; row < NUMROW; row++) //filling the transposed array
		{
			for (int column=0; column < NUMCOL; column++)
			{
				transposedArray[column][row] = matrix[row][column];
			}
		}
		Matrix transposedMatrix = new Matrix(transposedArray);
		return transposedMatrix;
	}
	
	
	/**
	 * This method sets every value above the diagonal in the Matrix to zero
	 * @return a matrix that is the same as the one used, except all variables above the method are zero
	 */
	public Matrix getUpperDiagonal()
	{
		double[][] upperZeroedArray = new double[NUMROW][NUMCOL]; //creates new array for a matrix to be returned
		for (int row = 0; row<NUMROW; row++) //copys matrix into the new array
		{
			for (int column=0; column < NUMCOL; column++)
			{
				upperZeroedArray[row][column] = matrix[row][column];
			}
		}
		for (int row = 0; row<NUMROW; row++) //goes through the array and changes the values above the variable to zero
		{
			for (int column=0; column < NUMCOL; column++)
			{
				if (column > row)
					upperZeroedArray[row][column] = 0;
			}
		}
		Matrix upperZeroedMatrix = new Matrix(upperZeroedArray);
		return upperZeroedMatrix;		
	}
	
	
	/**
	 * This method sets every value below the diagonal in the Matrix to zero
	 * @return a matrix that is the same as the one used, except all variables below the method are zero
	 */
	public Matrix getLowerDiagonal()
	{
		double[][] lowerZeroedArray =new double[NUMROW][NUMCOL];// creates new array to used in matrix to be returned
		for (int row = 0; row<NUMROW; row++) //copies matrix to new array
		{
			for (int column=0; column < NUMCOL; column++)
			{
				lowerZeroedArray[row][column] = matrix[row][column];
			}
		}
		for (int row = 0; row<NUMROW; row++) //changes values below diagonal to zero
		{
			for (int column=0; column < NUMCOL; column++)
			{
				if (column < row)
					lowerZeroedArray[row][column] = 0;
			}
		}
		Matrix lowerZeroedMatrix = new Matrix(lowerZeroedArray);
		return lowerZeroedMatrix;		
	}
	
	/**
	 * this function returns a matrix with all but the diagonal as zero
	 * @return a matrix with all but the diagonal as zeros
	 */
	public Matrix getDiagonal()
	{
		Matrix diagonalMatrix = new Matrix(matrix); //creates new matrix
		diagonalMatrix = diagonalMatrix.getUpperDiagonal().getLowerDiagonal(); //sets values abve and below diagonal to zero
		return diagonalMatrix;
	}
	
	/**
	 * this method returns a diagonal starting from the bottom left and going to the to right. everything else as zeros.
	 * @return a matrix with everything but the anti-diagonal as zeros
	 */
	public Matrix getAntiDiagonal()
	{
		double[][] antiDiagonaledArray = new double[NUMROW][NUMCOL]; //creates new array to create matrix to be returned
		for (int row = 0; row<NUMROW; row++) //fills array from matrix
		{
			for (int column=0; column < NUMCOL; column++)
			{
				antiDiagonaledArray[row][column] = matrix[row][column];
			}
		}
		for (int row = 0; row<NUMROW; row++) //sets all values that aren't in antidiagonal to zero
		{
			for (int column=0; column < NUMCOL; column++)
			{
				if ((column+row)!= (NUMROW-1)) //checking to see if they are in antidiagonal
					antiDiagonaledArray[row][column] = 0;
			}
		}
		Matrix antiDiagonaledMatrix = new Matrix(antiDiagonaledArray);
		return antiDiagonaledMatrix;
	}
	
	/**
	 * checks to see if the Matrix is a square
	 * @return true or false depeding on if it is a square
	 */
	public boolean isSquareMatrix()
	{
		if (NUMROW == NUMCOL) //checks to see if they are a square
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * checks to see if two matrices are equal
	 * @param m another matrix
	 * @return true if they are equal false if they are not.
	 */
	public boolean isEqual(Matrix m)
	{
		boolean equality = true;
		
		if ((this.NUMROW == m.NUMROW)&& (this.NUMCOL == m.NUMCOL)) //checks to see if they are equal size
		{
			for (int row = 0; row<NUMROW; row++) // a loop checking to see if each individual value in the array is equal
			{
				for (int column=0; column < NUMCOL; column++)
				{
					if (this.matrix[row][column] != m.matrix[row][column])
					{
						equality = false;
					}					
				}
			}
		}
		else
		{
			equality = false;
		}
		return equality; //returns true if equal, false if not
	}
	
	/**
	 * checks to see if the Matrix is a square matrix that has 1s as a diagonal and everything else as zeros.
	 * @return true if the matrix is an Identity matrix and false if it is not
	 */
	public boolean isIdentityMatrix()
	{
		boolean isAnIdentityMatrix = false;
		if (this.isSquareMatrix()) //makes sure it is a square matrix
		{
			Matrix identityMatrix = new Matrix(matrix);
			for (int diagonalPosition = 0; diagonalPosition < NUMROW; diagonalPosition++) //position in a diagonal is by row/column
			{
				identityMatrix.matrix[diagonalPosition][diagonalPosition] = 1; //sets the identity matrix to diagonal to 1s 
			}
			identityMatrix = identityMatrix.getDiagonal();
			if (this.isEqual(identityMatrix))//compares matrix to identity matrix
			{
				isAnIdentityMatrix = true;
			}
		}
		return isAnIdentityMatrix; //returns false if the matrix is not an identity matrix and true if it is.
	}
	
	public static void main(String[] args) 
	{
		double[][] thisIsATestArray = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		double[][] thisIsASquareArray = {{1,2,3,4},{5,6,7,8},{3,4,5,6},{0,9,8,7}};
		double[][] thisIsAnotherSquareArray = {{1,2,3,4},{5,6,7,8},{3,4,5,6},{0,9,8,7}};
		double[][] thisIsAnIdentityArray = {{1,0,0},{0,1,0},{0,0,1}};
		
		Matrix identityMatrix = new Matrix(thisIsAnIdentityArray);
		Matrix testMatrix = new Matrix(thisIsATestArray);
		Matrix squareMatrix = new Matrix(thisIsASquareArray);
		Matrix anotherSquareMatrix = new Matrix(thisIsAnotherSquareArray);
		Matrix transposedMatrix = testMatrix.transposeMatrix();
		Matrix upperDiagonalMatrix = testMatrix.getUpperDiagonal();
		Matrix lowerDiagonalMatrix = transposedMatrix.getLowerDiagonal();
		Matrix diagonalMatrix = transposedMatrix.getDiagonal();
		Matrix antiDiagonalMatrix = testMatrix.getAntiDiagonal();
		System.out.println(testMatrix.toString());
		System.out.print(transposedMatrix.toString());
		System.out.print(upperDiagonalMatrix.toString());
		System.out.print(lowerDiagonalMatrix.toString());
		System.out.print(diagonalMatrix.toString());
		System.out.print(antiDiagonalMatrix.toString());
		System.out.println(testMatrix.isSquareMatrix());
		System.out.println(squareMatrix.isSquareMatrix());
		System.out.println(squareMatrix.isEqual(anotherSquareMatrix));
		System.out.println(squareMatrix.isEqual(testMatrix));
		System.out.println(identityMatrix.isIdentityMatrix());
		System.out.println(testMatrix.isIdentityMatrix());
	}
	
	
	
	
}
