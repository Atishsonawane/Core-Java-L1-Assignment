/*

AIM : Write a program to find greatest number in an array

*/

import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
      System.out.println ("Enter the length of the array : ");
    int length = s.nextInt ();
    int[] myArray = new int[length];
      System.out.println ("Enter the elements of the array : ");

    for (int i = 0; i < length; i++)
      {
	myArray[i] = s.nextInt ();
      }

    // Initialize maximum element 
    int max = myArray[0];

    // Traverse array elements from second and compare every element with current max   
    for (int i = 1; i < myArray.length; i++)
      {
	if (myArray[i] > max)
	  max = myArray[i];
      }
    System.out.println("Greatest element in the array : " + max);
  }
}
