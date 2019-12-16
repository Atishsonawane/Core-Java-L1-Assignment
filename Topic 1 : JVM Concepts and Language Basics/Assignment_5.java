/*

AIM : Write a program that will accept a 4 digit number(assume that the user enters only 4 digit nos.)
and print the sum of all the 4 digits. For ex : If the number passed is 3629, the program should
print “The sum of all the digits entered is 20”

*/

import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter the number: ");
    int num;
    int count = 0;
    int sum = 0;
    num = in.nextInt();
    int n = num;
    
    while(num != 0)
    {
        num = num/10;
        ++count;
    }
    
    if(count == 4)
    {
        while (n != 0) 
        { 
            sum = sum + n % 10; 
            n = n/10; 
        } 
        System.out.println("Sum of digits is : " + sum);
    }
    else
    {
        System.out.println("Number entered is not a four digit number. Please enter a four digit number.");
    }
  }
}
