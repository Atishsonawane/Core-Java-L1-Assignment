/*

AIM : Write a Java program to calculate the factorial of a number without using any loop.

*/

import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    System.out.print("Enter a number : ");  
    Scanner in = new Scanner(System.in);  
    int n = in.nextInt();  

    System.out.println("Factorial value is " + getFactorial(n)); 
  }
  static int getFactorial(int num) 
  {  
    if (num <= 1)  
    {
        return 1;
    }  
    else 
    {
        return (num * getFactorial(num - 1));  
    }
  }  
}
