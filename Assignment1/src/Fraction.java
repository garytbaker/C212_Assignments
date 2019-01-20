////////////////////////////////////////////////////////////////////////////////////
//
//  Homework 1
//
//  Author  Gary Baker and garybake
//  Last Edited:  1/31/2018
//
//
//  Directions:  provide code for unimplemented methods
//
//               ** The fractions do not need to be in a simplified form **
//               ** without being in simplified form it makes adding and subtracting easier **
//////////////////////////////////////////////////////////////////////////////////

public class Fraction 
{
    // Instance Fields declarations
    private int num; 
    private int denom;
    
    // Constructror - method that initializes class 
    // Paramaters
    // num   - numerator of fraction 
    // denom - denomenator of fraction 
    public Fraction(int num, int denom) 
    {
         // throw Exception if denominator is 0 
        if (denom == 0) 
        { 
            throw new ArithmeticException("Cannot dvide by zero");
        }
        
        this.num = num;
        this.denom = denom; 
    }
    
    // @return value of numerator 
    public int num() 
    {
        return num;
    }
    
    // @return value of denomenator 
    public int denom() 
    {
        return denom; 
    }
    
    // add 2 fractions
    public Fraction add(Fraction other) 
    {
        int newDenom = this.denom() * other.denom();
        int newNum = (this.num() * other.denom()) + (this.denom() * other.num());
        Fraction newFraction = new Fraction(newNum, newDenom);
        return newFraction; // return statments add initialy so file compiles
                                   // your will need to change the return statements 
    }
    
    // subtract two fractions 
    public Fraction minus(Fraction other) 
    {
    	int newDenom = this.denom() * other.denom();
        int newNum = (this.num() * other.denom()) - (this.denom() * other.num());
        Fraction newFraction = new Fraction(newNum, newDenom);
        return newFraction;
    }
    
    // multiply two fractions 
    public Fraction multiply(Fraction other) 
    {
    	int newDenom = this.denom() * other.denom();
        int newNum = (this.num() * other.num());
        Fraction newFraction = new Fraction(newNum, newDenom);
        return newFraction;
    }
    
    // divide two fractions 
    public Fraction divide(Fraction other) 
    {
    	int newDenom = this.denom() * other.num();
        int newNum = (this.num() * other.denom());
        Fraction newFraction = new Fraction(newNum, newDenom);
        return newFraction;
    }
    
    // returns decimal value of this fraction
    public double decimalVal() 
    {
        double doubleNum = (double) this.num();
        double doubleDenom = (double) this.denom();
        double decimalNumber = doubleNum / doubleDenom;
        // cast integer num and denom values as doubles before operating on in this method
     return decimalNumber;   
    }
    
    // returns a string with numerator / denominator 
    public String toString() 
    {
        String stringNum = (this.num() + "/" + this.denom());
        
        return stringNum;
    }
    
    // Test Client 
    public static void main(String[] args) 
    {
        // creating a Fraction object from Class Fraction 
        // also known as in Instance 
        Fraction f1 = new Fraction(5, 10);
        Fraction f2 = new Fraction(1, 3);
        
        // example call of printing the value of two fractions multiplied 
        // f1.multiply(f2) returns a new Fraction object, so we can call its toString() method
        System.out.println( f1.multiply(f2).toString() );
        
    }
}