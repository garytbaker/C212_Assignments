////////////////////////////////////////////////////////////////////////////////////
//
//  Homework 1 
//  
//  Author  Gary Baker garybake
//  Last Edited:  2/1/18
//
//
//  Directions:  Implement toString method and distanceTo method 
//  Note:        Will need to change return values - added so code initially compiles 
//               
//////////////////////////////////////////////////////////////////////////////////


import java.lang.Math;

public class Point {
    
    private int x;
    private int y;
    
    // Constructor method 
    public Point(int x, int y) {
        // this.x is the x as an instance field 
        // x is just the x local as a parameter to this method 
        this.x = x; 
        this.y = y;
    }
    
    // return this points x value 
    public int x() {
     return this.x;   
    }
    
    // return this points y value 
    public int y() {
     return this.y;   
    }
    
    // return distance from this point to other point  
    public double distanceTo(Point other) {
        /*find distance from one point to other point 
        * with distance formula
        */
    	double distance = Math.abs(Math.sqrt((Math.pow((this.x() - other.x()), 2)) + (Math.pow((this.y() - other.y()), 2))));
        return distance;
    }
    
    // returns the point as a String 
    public String toString() {
        String stringOfPoint = "(" + this.x() + "," +this.y() + ")";
        return stringOfPoint;
    }
 
    // test client 
    public static void main(String[] args) {
        // Instantiating 4 Objects of type Point 
        // Type is a Point - Variable Name - Creating new Point with new keyword 
        Point center = new Point(0,0);
        Point point1 = new Point(5, 10);
        Point point2 = new Point(3, 7);
        Point point3 = new Point(0, 3);
        
        // creating a variables distance# that is distance from one Point to another
        // call objects or class methods with . operator
        // distanceTO takes a parameter of type Point, so we passed it a point
        double distance1 = center.distanceTo(point1);
        double distance2 = point1.distanceTo(point2);
        double distance3 = point2.distanceTo(point3);
        System.out.println(distance1);
        System.out.println(distance2);
        System.out.println(distance3);
        
    }
}