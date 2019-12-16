/*

AIM : Write a Java program to print the result of the following operations. Declare variables and
initialize them with given values
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3

*/

public class Main
{
  public static void main (String[]args)
  {
    // a.  -5 + 8 * 6
    int a = 5;
    int b = 8;
    int c = 6;
    
    int answerA = -a + b * c;

    System.out.println ("Answer to a. is " + answerA);

    // b.  (55+9) % 9
    int d = 55;
    int e = 9;
    
    int answerB = (d+e)%e;
    
    System.out.println("Answer to b. is " + answerB);

    // c.  20 + -3*5 / 8
    int f = 20;
    int g = 3;
    
    int answerC = f+(-g*a)/b;
    
    System.out.println("Answer to c. is " + answerC);
    
    // d.  5 + 15 / 3 * 2 - 8 % 3
    int i = 15;
    int j = 2;
    
    int answerD = a+i/g*j-b%g;
    
    System.out.println("Answer to d. is " + answerD);
   }
}
