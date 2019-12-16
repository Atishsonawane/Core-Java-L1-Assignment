/*

AIM : Write a program to find greatest number in an array

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
