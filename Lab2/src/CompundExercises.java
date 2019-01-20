////////////////////////////////////////////////////////////////////////////////////
//  C212
//   
//  Released:  1/11/18
//
//  Lab 2
//  @Gary Baker and garybake
//  Last Edited: 1/22/18
//
//
//  Directions: See Below 
//               
//////////////////////////////////////////////////////////////////////////////////

// Change the following program to use compound assignments: Then repeat the process to pre-increment only.
class CompoundExercises {

     public static void compoundOperators()
     {
          
          int result = 1 + 2; // result is now 3
          System.out.println(result);

          //result -= 1; // result is now 2
          //System.out.println(result);
          --result; // result is now 2
          System.out.println(result);
          
          result *= 2; // result is now 4
          System.out.println(result);

          result /= 2; // result is now 2
          System.out.println(result);

          result += 8; // result is now 10
          result %= 7; // result is now 3
          System.out.println(result);
     }
     
     // In the following program, explain why the value "8" is printed twice in a row:
     public static void question1() 
     {
        int i = 5;
        i++;
        System.out.println(i);    // "6"
        ++i;                     
        System.out.println(i);    // "7"
        System.out.println(++i);  // "8"
        System.out.println(i++);  // "8"
        System.out.println(++i);  // "10"
        //It prints 8 twice because i++ increments after it returns the number. So it will print 8 and then become 9.
     }
}